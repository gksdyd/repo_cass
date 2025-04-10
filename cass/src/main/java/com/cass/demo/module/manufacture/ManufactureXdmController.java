package com.cass.demo.module.manufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobileXdm/manufacture")
public class ManufactureXdmController {
	
	@Autowired
	ManufactureService service;
	
	@RequestMapping(value = "/ManufactureXdmList")
	public String manufactureXdmForm(ManufactureDto dto, Model model) {
		
		model.addAttribute("list", service.selectList(dto));
		
		return "mobileXdm/manufacture/ManufactureXdmList";
	}
	

}