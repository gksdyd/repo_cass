package com.cass.demo.module.income;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cass.demo.module.manufacture.ManufactureDto;

@Service
public class IncomeService {
	
	@Autowired
	IncomeDao dao;
	
	public List<IncomeDto> selectList(IncomeVo vo) {
		return dao.selectList(vo);
	}
	
	public int selectOneCount(IncomeVo vo) {
		return dao.selectOneCount(vo);
	}

	public List<IncomeDto> selectListForDeli(IncomeVo vo) {
		return dao.selectListForDeli(vo);
	}
	
	public int selectOneCountForDeli(IncomeVo vo) {
		return dao.selectOneCountForDeli(vo);
	}
	
	public List<IncomeDto> selectIncoStatus(){
		return dao.selectIncoStatus();
	}
	
	public int insert(ManufactureDto dto) {
		return dao.insert(dto);
	}
	
	public int selectMaxIncoNum() {
		return dao.selectMaxIncoNum();
	}
}
