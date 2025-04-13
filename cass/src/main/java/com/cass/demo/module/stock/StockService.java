package com.cass.demo.module.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cass.demo.module.manufacture.ManufactureDto;

@Service
public class StockService {

	@Autowired
	StockDao stockDao;
	
	public List<StockDto> selectList(StockVo vo) {
		return stockDao.selectList(vo);
	}
	
	public int selectOneCount(StockVo vo) {
		return stockDao.selectOneCount(vo);
	}
	
	public int insert(ManufactureDto dto) {
		return stockDao.insert(dto);
	}
	
	public Integer selectOneProductTotalQty(ManufactureDto dto) {
		return stockDao.selectOneProductTotalQty(dto);
	}
}
