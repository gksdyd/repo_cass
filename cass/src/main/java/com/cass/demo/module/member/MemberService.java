package com.cass.demo.module.member;

import java.util.List;

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
	
	public int selectOneCount(MemberVo vo) {
		return memberDao.selectOneCount(vo);
	}
	public List<MemberDto> selectList(MemberVo vo) {
		return memberDao.selectList(vo);
	}
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}
	

}
