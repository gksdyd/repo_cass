package com.cass.demo.module.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.module.dealer.DealerDto;
import com.cass.demo.module.dealer.DealerService;

@Controller
public class IndexController {
	
	@Autowired
	IndexService service;
	
	@Autowired
	DealerService dealerService;

	@RequestMapping(value = "/xdm/indexXdm")
	public String xdmIndex(Model model, IndexDto dto, DealerDto dealerDto) {
		
		model.addAttribute("pdor", service.selectOneCountOnPdor());
		model.addAttribute("mafa", service.selectOneCountOnMafa());
		model.addAttribute("deli", service.selectOneCountOnDeli());
		model.addAttribute("list", dealerService.selectListForIndex(dealerDto));
		model.addAttribute("items", service.selectListItemForIndex(dto));
		
		return "xdm/index/index";
	}
	@RequestMapping(value = "/index")
	public String Home() {
		return "usr/index/home";
	}
	@RequestMapping(value = "/index/home-logined")
	public String homelogined() {
		return "usr/index/home-logined";
	}
	@RequestMapping(value = "/member/SigninUsrForm")
	public String signinUsrForm() {
		return "usr/member/SigninUsrForm";
	}
	@RequestMapping(value = "/member/signupUsrForm")
	public String signupUsrForm() {
		return "usr/member/SignupUsrForm";
	}
	@RequestMapping(value = "/member/passwordrecoveryUsrForm")
	public String passwordrecoveryUsrForm() {
		return "usr/member/PasswordrecoveryUsrForm";
	}
	
}
