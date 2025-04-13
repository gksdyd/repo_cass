package com.cass.demo.module.stock;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cass.demo.module.manufacture.ManufactureDto;
import com.cass.demo.module.productorder.ProductOrderDto;

@Repository
public interface StockDao {

	public List<StockDto> selectList(StockVo vo);
	public int selectOneCount(StockVo vo);
	public int insert(ManufactureDto dto);
	public Integer selectOneProductTotalQty(ManufactureDto dto);
	public Integer selectOneProductTotalQty(ProductOrderDto dto);
	public Integer insertForDeli(ProductOrderDto dto);
}
