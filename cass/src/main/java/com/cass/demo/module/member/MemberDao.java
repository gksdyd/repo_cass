package com.cass.demo.module.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	public MemberDto selectOneLogin(MemberDto memberDto);
	public MemberDto getIdPass(MemberDto memberDto);
	public int selectOneCount(MemberVo vo);
	public List<MemberDto> selectList(MemberVo vo);
	public MemberDto selectOne(MemberDto memberDto);
}
