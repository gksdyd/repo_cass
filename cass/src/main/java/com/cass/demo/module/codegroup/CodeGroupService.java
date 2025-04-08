package com.cass.demo.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cass.demo.base.xdm.BaseVo;


@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao codeGroupDao;
	
//	public List<CodeGroupDto> selectList(CodeGroupVo vo) {
//		return codeGroupDao.selectList(vo);
//	}
	public List<CodeGroupDto> selectList(BaseVo vo) {
		return codeGroupDao.selectList(vo);
	}
	
	public List<CodeGroupDto> selectListWithoutPaging() {
		return codeGroupDao.selectListWithoutPaging();
	}
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}
	
	public CodeGroupDto selectOne(CodeGroupVo vo) {
		return codeGroupDao.selectOne(vo);
	}
	
	public int insert(CodeGroupDto codeGroupDto) {
		return codeGroupDao.insert(codeGroupDto);
	}
	
	public int update(CodeGroupDto codeGroupDto) {
		return codeGroupDao.update(codeGroupDto);
	}
	
	public int uelete(CodeGroupDto codeGroupDto) {
		return codeGroupDao.uelete(codeGroupDto);
	}
	
	public int selectOneCount(CodeGroupVo vo) {
		return codeGroupDao.selectOneCount(vo);
	}
	public int selectOneCount(BaseVo vo) {
		return codeGroupDao.selectOneCount(vo);
	}
}
