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
	public List<ProductOrderDto> selectedOneList(ProductOrderVo productOrderVo) {
		return productOrderDao.selectedOneList(productOrderVo);
	}
	public List<ProductOrderDto> selectedTempList(ProductOrderVo productOrderVo) {
		return productOrderDao.selectedTempList(productOrderVo);
	}

	
	public int selectOneCount(ProductOrderVo productOrderVo) {
		return productOrderDao.selectOneCount(productOrderVo);
	}

	public List<ProductOrderDto> selectListForMafa(ProductOrderVo productOrderVo) {
		return productOrderDao.selectListForMafa(productOrderVo);
	}
	
	public int selectOneCountForMafa(ProductOrderVo productOrderVo) {
		return productOrderDao.selectOneCountForMafa(productOrderVo);
	}
	
	public ProductOrderDto selectOne(ProductOrderVo productOrderVo) {
		return productOrderDao.selectOne(productOrderVo);
	}
	public ProductOrderDto selectNum(ProductOrderVo productOrderVo) {
		return productOrderDao.selectNum(productOrderVo);
	}

	public int ueletePdol(ProductOrderDto productOrderDto) {
		return productOrderDao.ueletePdol(productOrderDto);
	}
	public int insertTemp(ProductOrderDto productOrderDto) {
		return productOrderDao.insertTemp(productOrderDto);
	}
	public int insert(ProductOrderDto productOrderDto) {
		return productOrderDao.insert(productOrderDto);
	}
	public int insertOL(ProductOrderDto productOrderDto) {
		return productOrderDao.insertOL(productOrderDto);
	}
	public int update(ProductOrderDto productOrderDto) {
		return productOrderDao.update(productOrderDto);
	}
	
	public Integer selectMaxSeq(ProductOrderDto productOrderDto) {
		return productOrderDao.selectMaxSeq(productOrderDto);
	}
	public Integer selectMaxNum(ProductOrderDto productOrderDto) {
		return productOrderDao.selectMaxNum(productOrderDto);
	}

}
