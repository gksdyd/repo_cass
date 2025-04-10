package com.cass.demo.module.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
public class IncomeXdmController extends BaseController {

	@Autowired
	IncomeService service;
	
	@RequestMapping(value = "/xdm/income/IncomeXdmList")
	public String IncomeXdmList(IncomeVo vo, Model model) {
		utildatetime(vo);
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		model.addAttribute("list", service.selectList(vo));
		model.addAttribute("vo", vo);
//		model.addAttribute("list", service.selectList(dto));
		
		return "xdm/income/IncomeXdmList";
	}
	

}
