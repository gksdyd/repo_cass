package com.cass.demo.module.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/mobileXdm/income")
public class IncomeController extends BaseController {

	@Autowired
	IncomeService service;
	
	@RequestMapping(value = "/IncomeXdmList")
	public String incomeXdmForm(@ModelAttribute("vo") IncomeVo vo, Model model) {
		utildatetime(vo);
		vo.setParamsPaging(service.selectOneCount(vo));
		model.addAttribute("list", service.selectList(vo));
		return "mobileXdm/income/IncomeXdmList";
	}
	

}
