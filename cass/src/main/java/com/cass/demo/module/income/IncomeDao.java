package com.cass.demo.module.income;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IncomeDao {
	public List<IncomeDto> selectList(IncomeDto dto);
}
