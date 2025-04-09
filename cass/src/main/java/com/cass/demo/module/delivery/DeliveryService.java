package com.cass.demo.module.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryDao deliveryDao;
	
	public List<DeliveryDto> selectList(DeliveryVo deliveryVo) {
		return deliveryDao.selectList(deliveryVo);
	}
	public int selectOneCount(DeliveryVo deliveryVo) {
		return deliveryDao.selectOneCount(deliveryVo);
	}

}
