package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cass.demo.module.productorder.ProductOrderDto;

@Repository
public interface ManufactureDao {
	public List<ManufactureDto> selectList(ManufactureVo vo);
	public ManufactureDto selectOne(ManufactureDto dto);
	public int selectOneCount(ManufactureVo vo);
	public List<ManufactureDto> selectListForInco(ManufactureVo vo);
	public int selectOneCountForInco(ManufactureVo vo);
	public int insert(ProductOrderDto dto);
	public int maxMafaNum();
	public int update(ManufactureDto dto);
	public int updateNotUse(ManufactureDto dto);
	public List<ManufactureDto> isIncomeComplete(ManufactureDto dto);
}
