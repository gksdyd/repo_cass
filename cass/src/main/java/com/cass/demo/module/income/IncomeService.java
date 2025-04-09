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

}
