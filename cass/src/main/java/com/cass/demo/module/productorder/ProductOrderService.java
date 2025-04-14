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
	
	public List<ProductOrderDto> selectListForDeli(ProductOrderVo productOrderVo) {
		return productOrderDao.selectListForDeli(productOrderVo);
	}
	
	public int selectOneCountForDeli(ProductOrderVo productOrderVo) {
		return productOrderDao.selectOneCountForDeli(productOrderVo);
	}
	
	public List<ProductOrderDto> selectOneList(ProductOrderVo productOrderVo) {
		return productOrderDao.selectOneList(productOrderVo);
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
	public int insertOrderList(ProductOrderDto productOrderDto) {
		return productOrderDao.insertOrderList(productOrderDto);
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
	
	public Integer selectMaxSeq() {
		return productOrderDao.selectMaxSeq();
	}
	public Integer selectMaxNum() {
		return productOrderDao.selectMaxNum();
	}
	
	public Integer updateOrder(ProductOrderVo productOrderVo) {
		return productOrderDao.updateOrder(productOrderVo);
	}
	public List<ProductOrderDto> selectOrderList(ProductOrderDto productOrderDto) {
		return productOrderDao.selectOrderList(productOrderDto);
	}
	
	public int updateOrderList(ProductOrderDto productOrderDto) {
		return productOrderDao.updateOrderList(productOrderDto);
	}
	
	public int deletOrderList(ProductOrderDto productOrderDto) {
		return productOrderDao.deletOrderList(productOrderDto);
	}
}
