package com.cass.demo.module.income;

import java.util.List;

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
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;

@Controller
@RequestMapping(value = "/mobileXdm/income")
public class IncomeController extends BaseController {

	@Autowired
	IncomeService service;
	
	@Autowired
	ManufactureService manufactureService;
	
	@Autowired
	ProductOrderService orderService;
	
	@RequestMapping(value = "/IncomeXdmList")
	public String incomeXdmForm(@ModelAttribute("incomeVo") IncomeVo incomeVo, 
			@ModelAttribute("manuVo") ManufactureVo manuVo, Model model) {
		utildatetime(incomeVo);
		utildatetime(manuVo);

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
		
		dto.setIncoNum(service.selectMaxIncoNum() + 1);
		service.insert(dto);
		
		List<ManufactureDto> dtos = manufactureService.isIncomeComplete(dto);
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getMafaUseNy() == 1) {
				return;
			}
		}
		
		ProductOrderVo vo = new ProductOrderVo();
		vo.setPdorNum(dto.getPdorNum());
		vo.setPdorStatusCd(6);
		orderService.updateOrder(vo);
	}
}
