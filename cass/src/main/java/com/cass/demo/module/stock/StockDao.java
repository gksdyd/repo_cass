package com.cass.demo.module.stock;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cass.demo.module.manufacture.ManufactureDto;

@Repository
public interface StockDao {

	public List<StockDto> selectList(StockVo vo);
	public int selectOneCount(StockVo vo);
	public int insert(ManufactureDto dto);
	public Integer selectOneProductTotalQty(ManufactureDto dto);
}
