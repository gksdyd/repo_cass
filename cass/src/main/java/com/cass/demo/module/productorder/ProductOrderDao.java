package com.cass.demo.module.productorder;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ProductOrderDao {
	
	public List<ProductOrderDto> selectList(ProductOrderVo productOrderVo);
	public List<ProductOrderDto> selectedOneList(ProductOrderVo productOrderVo);
	public List<ProductOrderDto> selectedTempList(ProductOrderVo productOrderVo);
	public ProductOrderDto selectOne(ProductOrderVo productOrderVo);
	public ProductOrderDto selectNum(ProductOrderVo productOrderVo);

	public int selectOneCount(ProductOrderVo productOrderVo);
	public List<ProductOrderDto> selectListForMafa(ProductOrderVo productOrderVo);
	public int selectOneCountForMafa(ProductOrderVo productOrderVo);
	
	public List<ProductOrderDto> selectListForDeli(ProductOrderVo productOrderVo);
	public int selectOneCountForDeli(ProductOrderVo productOrderVo);

	public List<ProductOrderDto> selectOneList(ProductOrderVo productOrderVo);
	
	public int ueletePdol(ProductOrderDto productOrderDto);
	public int insertOrderList(ProductOrderDto productOrderDto);
	public int insert(ProductOrderDto productOrderDto);
	public int insertOL(ProductOrderDto productOrderDto);
	public int update(ProductOrderDto productOrderDto);
	
	public Integer selectMaxSeq();
	public Integer selectMaxNum();

	public Integer updateOrder(ProductOrderVo productOrderVo);
	
	public List<ProductOrderDto> selectOrderList(ProductOrderDto productOrderDto);
	public int updateOrderList(ProductOrderDto productOrderDto);
	public int deletOrderList(ProductOrderDto productOrderDto);
	
	public int updateAmoutPrice(ProductOrderDto productOrderDto);
}