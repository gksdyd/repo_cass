package com.cass.demo.module.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/mobileXdm/member")
public class MobileMemberController {
	
	@Autowired
	MemberService memberService;

	@RequestMapping(value = "/LoginMobileForm")
	public String loginXdmForm(MemberDto dto, Model model) {
		model.addAttribute("getIdPass", memberService.getIdPass(dto));
		return "mobileXdm/member/Login";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/SigninMobileProc")
	public Map<String, Object> signinXdmProc(MemberDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		MemberDto rtUserDto = memberService.selectOneLogin(dto);
//		아이디, 패스워드 집어넣어서 데이터 받기
		if(rtUserDto != null) {
			returnMap.put("rt", "success");
			httpSession.setAttribute("sessXdmSeq", rtUserDto.getMembSeq());
			httpSession.setAttribute("sessXdmName", rtUserDto.getMembName());
			httpSession.setAttribute("sessXdmId", rtUserDto.getMembId());
			
		} else {
			returnMap.put("rt", "false");
		}		
		return returnMap;
	}
}
