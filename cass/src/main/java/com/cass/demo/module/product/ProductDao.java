package com.cass.demo.module.product;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {

	public List<ProductDto> selectList(ProductVo vo);
	public int selectOneCount(ProductVo Vo);
	public ProductDto selectOne(ProductDto productDto);
	public ProductDto selectOne(ProductVo Vo);
	
	public int insert(ProductDto productDto);
	public int update(ProductDto productDto);
	public int uelete(ProductDto productDto);
	
	public List<ProductDto> selectListProduct();
}
