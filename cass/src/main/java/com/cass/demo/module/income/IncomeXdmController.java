package com.cass.demo.module.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;

@Controller
public class IncomeXdmController extends BaseController {

	@Autowired
	IncomeService service;
	@Autowired
	ProductOrderService productOrderService;
	
	
	@RequestMapping(value = "/xdm/income/IncomeXdmList")
	public String IncomeXdmList(IncomeVo vo, Model model) {
		utildatetime(vo);
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		model.addAttribute("list", service.selectList(vo));
		model.addAttribute("vo", vo);
		
		return "xdm/income/IncomeXdmList";
	}
	@RequestMapping(value = "/xdm/income/IncomeXdmView")
	public String IncomeXdmView(Model model, IncomeDto dto) {
		
		model.addAttribute("item", service.selectOne(dto));
		return "xdm/income/IncomeXdmView";
	}

}
