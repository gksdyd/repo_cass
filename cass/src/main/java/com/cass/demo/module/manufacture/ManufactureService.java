package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cass.demo.module.productorder.ProductOrderDto;

@Service
public class ManufactureService {
	
	@Autowired
	ManufactureDao dao;
	
	public List<ManufactureDto> selectList(ManufactureVo vo) {
		return dao.selectList(vo);
	}
	public List<ManufactureDto> selectXdmList(ManufactureVo vo) {
		return dao.selectXdmList(vo);
	}
	public ManufactureDto selectOne(ManufactureDto dto) {
		return dao.selectOne(dto);
	}
	public List<ManufactureDto> selectOneList(ManufactureDto dto) {
		return dao.selectOneList(dto);
	}

	public int selectOneCount(ManufactureVo vo) {
		return dao.selectOneCount(vo);
	}
	
	public int selectOneXdmCount(ManufactureVo vo) {
		return dao.selectOneXdmCount(vo);
	}
	
	public List<ManufactureDto> selectListForInco(ManufactureVo vo) {
		return dao.selectListForInco(vo);
	}

	public int selectOneCountForInco(ManufactureVo vo) {
		return dao.selectOneCountForInco(vo);
	}
	
	public int insert(ProductOrderDto dto) {
		return dao.insert(dto);
	}
	
	public int maxMafaNum() {
		return dao.maxMafaNum();
	}
	
	public int update(ManufactureDto dto) {
		return dao.update(dto);
	}
	
	public int updateNotUse(ManufactureDto dto) {
		return dao.updateNotUse(dto);
	}
	
	public List<ManufactureDto> isIncomeComplete(ManufactureDto dto) {
		return dao.isIncomeComplete(dto);
	}
}
