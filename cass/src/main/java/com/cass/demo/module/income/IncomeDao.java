package com.cass.demo.module.income;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IncomeDao {
	public List<IncomeDto> selectList(IncomeVo vo);
	public int selectOneCount(IncomeVo vo);
	public List<IncomeDto> selectListForDeli(IncomeVo vo);
	public int selectOneCountForDeli(IncomeVo vo);
	public List<IncomeDto> selectIncoStatus();
}
