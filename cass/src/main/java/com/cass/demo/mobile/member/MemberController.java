package com.cass.demo.mobile.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobileXdm/member")
public class MemberController {

	@RequestMapping(value = "/LoginXdmForm")
	public String loginXdmForm() {
		return "mobileXdm/member/Login";
	}
}
