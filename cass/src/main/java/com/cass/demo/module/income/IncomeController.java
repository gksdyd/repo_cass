package com.cass.demo.module.income;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobileXdm/income")
public class IncomeController {

	@RequestMapping(value = "/IncomeXdmList")
	public String incomeXdmForm() {
		return "mobileXdm/income/IncomeXdmList";
	}
	

}
