package com.cass.demo.module.productorder;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ProductOrderDao {
	
	public List<ProductOrderDto> selectList(ProductOrderVo productOrderVo);
	public int selectOneCount(ProductOrderVo productOrderVo);



}
