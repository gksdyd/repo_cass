package com.cass.demo.module.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cass.demo.module.productorder.ProductOrderVo;

@Repository
public interface ProductDao {

	public List<ProductDto> selectList(ProductVo vo);
	public int selectOneCount(ProductVo Vo);
}
