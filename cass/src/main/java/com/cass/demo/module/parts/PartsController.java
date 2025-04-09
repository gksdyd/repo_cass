package com.cass.demo.module.parts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/parts")
public class PartsController {

	@Autowired
	PartsService partsService;
	
	@RequestMapping(value = "/PartsXdmList")
	public String partXdmList(Model model, @ModelAttribute("vo") PartsVo vo) {
		model.addAttribute("list", partsService.selectList(vo));
		return "xdm/parts/PartsXdmList";
	}
}
