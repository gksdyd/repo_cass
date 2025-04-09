package com.cass.demo.module.stock;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface StockDao {

	public List<StockDto> selectList(StockVo vo);
	public int selectOneCount(StockVo vo);
}
