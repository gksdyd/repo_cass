package com.cass.demo.module.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cass.demo.module.income.IncomeDto;
import com.cass.demo.module.productorder.ProductOrderDto;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryDao deliveryDao;
	
	public List<DeliveryDto> selectList(DeliveryVo deliveryVo) {
		return deliveryDao.selectList(deliveryVo);
	}
	
	public List<DeliveryDto> selectOneList(DeliveryDto dto) {
		return deliveryDao.selectOneList(dto);
	}
	public int selectOneCount(DeliveryVo deliveryVo) {
		return deliveryDao.selectOneCount(deliveryVo);
	}

	public int deliMaxNum() {
		return deliveryDao.deliMaxNum();
	}
	
	public int insert(ProductOrderDto dto) {
 		return deliveryDao.insert(dto);
	}
	
	public DeliveryDto selectOne(DeliveryDto dto) {
		return deliveryDao.selectOne(dto);
	}
	
}
