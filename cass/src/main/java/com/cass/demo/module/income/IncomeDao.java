package com.cass.demo.module.income;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cass.demo.module.manufacture.ManufactureDto;

@Repository
public interface IncomeDao {
	public List<IncomeDto> selectList(IncomeVo vo);
	public int selectOneCount(IncomeVo vo);
	public List<IncomeDto> selectListForDeli(IncomeVo vo);
	public int selectOneCountForDeli(IncomeVo vo);
	public List<IncomeDto> selectIncoStatus();
	public int insert(ManufactureDto dto);
	public int selectMaxIncoNum();
}
