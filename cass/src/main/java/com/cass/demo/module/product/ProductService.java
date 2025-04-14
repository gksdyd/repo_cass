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
	
	public ProductDto selectOne(ProductDto productDto) {
		return productDao.selectOne(productDto);
	}
	
	public ProductDto selectOne(ProductVo Vo) {
		return productDao.selectOne(Vo);
	}
	
	public int insert(ProductDto productDto) {
		return productDao.insert(productDto);
	}
	
	public int update(ProductDto productDto) {
		return productDao.update(productDto);
	}
	
	public int uelete(ProductDto productDto) {
		return productDao.uelete(productDto);
	}
	
	public List<ProductDto> selectListProduct() {
		return productDao.selectListProduct();
	}
}
