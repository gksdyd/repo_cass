package com.cass.demo.module.member;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	public MemberDto selectOneLogin(MemberDto memberDto);
	public MemberDto getIdPass(MemberDto memberDto);
	
}
