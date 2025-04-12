package com.cass.demo.module.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.manufacture.ManufactureDto;
import com.cass.demo.module.manufacture.ManufactureService;
import com.cass.demo.module.manufacture.ManufactureVo;

@Controller
@RequestMapping(value = "/mobileXdm/income")
public class IncomeController extends BaseController {

	@Autowired
	IncomeService service;
	
	@Autowired
	ManufactureService manufactureService;
	
	@RequestMapping(value = "/IncomeXdmList")
	public String incomeXdmForm(@ModelAttribute("incomeVo") IncomeVo incomeVo, 
			@ModelAttribute("manuVo") ManufactureVo manuVo, Model model) {
		utildatetime(incomeVo);
		model.addAttribute("selectIncoStatus",service.selectIncoStatus());
		incomeVo.setParamsPaging(service.selectOneCount(incomeVo));
		model.addAttribute("list", service.selectList(incomeVo));
		
		manuVo.setParamsPagingNew(manufactureService.selectOneCountForInco(manuVo));
		model.addAttribute("orderList", manufactureService.selectListForInco(manuVo));
		
		model.addAttribute("activePage", "income");
		return "mobileXdm/income/IncomeXdmList";
	}
	
	@ResponseBody
	@RequestMapping(value = "/IncomeXdmProc")
	public void incomeXdmProc(ManufactureDto dto) {
		manufactureService.updateNotUse(dto);
		
		dto.setIncoNum(service.selectMaxIncoNum());
		service.insert(dto);
	}
}
