package com.cass.demo.mobile.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public MemberDto selectOneLogin(MemberDto memberDto) {
		return memberDao.selectOneLogin(memberDto);
	}
	
	public MemberDto getIdPass(MemberDto memberDto) {
		return memberDao.getIdPass(memberDto);
	}
}
