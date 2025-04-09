package com.cass.demo.module.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobileXdm/income")
public class IncomeController {

	@Autowired
	IncomeService service;
	
	@RequestMapping(value = "/IncomeXdmList")
	public String incomeXdmForm(IncomeDto dto, Model model) {
		
		model.addAttribute("list", service.selectList(dto));
		
		return "mobileXdm/income/IncomeXdmList";
	}
	

}
