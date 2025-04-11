package com.cass.demo.module.manufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/mobileXdm/manufacture")
public class ManufactureXdmController extends BaseController {
	
	@Autowired
	ManufactureService service;
	
	@RequestMapping(value = "/ManufactureXdmList")
	public String manufactureXdmForm(@ModelAttribute("vo") ManufactureVo vo, Model model) {
		utildatetime(vo);
		vo.setParamsPaging(service.selectOneCount(vo));
		model.addAttribute("list", service.selectList(vo));
	    model.addAttribute("activePage", "manufacture");
		return "mobileXdm/manufacture/ManufactureXdmList";
	}
	

}