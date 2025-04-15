package com.cass.demo.module.delivery;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cass.demo.module.productorder.ProductOrderDto;

@Repository
public interface DeliveryDao {
	
	public List<DeliveryDto> selectList(DeliveryVo deliveryVo);
	public List<DeliveryDto> selectOneList(DeliveryDto dto);
	public int selectOneCount(DeliveryVo deliveryVo);
	public int deliMaxNum();
	public int insert(ProductOrderDto dto);
	public DeliveryDto selectOne(DeliveryDto dto);
}
