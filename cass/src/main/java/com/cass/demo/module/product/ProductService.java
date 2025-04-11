package com.cass.demo.module.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public List<ProductDto> selectList(ProductVo vo) {
		return productDao.selectList(vo);
	}
		
	public int selectOneCount(ProductVo Vo) {
		return productDao.selectOneCount(Vo);
	}
}
