package com.cass.demo.module.partpartner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
public class PartpartnerXdmController extends BaseController {
	
	@Autowired
	PartpartnerService partpartnerService;
	
	@RequestMapping(value = "/partpartner/partpartnerXdmList")
	public String partpartnerXdmList(PartpartnerVo vo, PartpartnerDto dto, Model model) {
		utildatetime(vo);
		
		vo.setParamsPaging(partpartnerService.selectOneCount(vo));
		
		model.addAttribute("list", partpartnerService.selectList(vo));
		model.addAttribute("vo", vo);
		return "xdm/partpartner/PartpartnerXdmList";
	}
}
