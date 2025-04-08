package com.cass.demo.module.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobileXdm/service")
public class IncomeController {

	@RequestMapping(value = "/IncomeXdmList")
	public String incomeXdmForm() {
		return "mobileXdm/service/IncomeXdmList";
	}
}
