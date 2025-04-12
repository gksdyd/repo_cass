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
	public int insertTemp(ProductOrderDto productOrderDto);
	public int insert(ProductOrderDto productOrderDto);
	public int insertOL(ProductOrderDto productOrderDto);
	public int update(ProductOrderDto productOrderDto);
	
	public Integer selectMaxSeq(ProductOrderDto productOrderDto);
	public Integer selectMaxNum(ProductOrderDto productOrderDto);

	public Integer updateOrder(ProductOrderVo productOrderVo);
}