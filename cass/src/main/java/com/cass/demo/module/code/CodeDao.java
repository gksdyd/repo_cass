package com.cass.demo.module.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
	
	public List<CodeDto> selectList(CodeVo vo);
	public List<CodeDto> selectGroupList();
	public CodeDto selectOne(CodeDto codeDto);
	public CodeDto selectOne(CodeVo vo);
	
	public int insert(CodeDto codeDto);
	public int update(CodeDto codeDto);
	public int uelete(CodeDto codeDto);
	
	public int selectOneCount(CodeVo vo);
	
	public List<CodeDto> selectListCachedCodeArrayList();
}
