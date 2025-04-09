package com.cass.demo.module.delivery;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDao {
	
	public List<DeliveryDto> selectList(DeliveryVo deliveryVo);
	public int selectOneCount(DeliveryVo deliveryVo);

}
