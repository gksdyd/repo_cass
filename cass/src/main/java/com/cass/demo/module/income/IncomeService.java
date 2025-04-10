package com.cass.demo.module.income;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService {
	
	@Autowired
	IncomeDao dao;
	
	public List<IncomeDto> selectList(IncomeDto dto) {
		return dao.selectList(dto);
	}
	public List<IncomeDto> selectList(IncomeVo vo) {
		return dao.selectList(vo);
	}
	
	public int selectOneCount(IncomeVo vo) {
		return dao.selectOneCount(vo);
	}

}
