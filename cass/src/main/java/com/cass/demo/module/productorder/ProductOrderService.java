package com.cass.demo.module.productorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOrderService {
	
	@Autowired
	ProductOrderDao productOrderDao;
	
	public List<ProductOrderDto> selectList(ProductOrderVo productOrderVo) {
		return productOrderDao.selectList(productOrderVo);
	}
	
	public int selectOneCount(ProductOrderVo productOrderVo) {
		return productOrderDao.selectOneCount(productOrderVo);
	}

}
