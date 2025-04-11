package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufactureService {
	
	@Autowired
	ManufactureDao dao;
	
	public List<ManufactureDto> selectList(ManufactureVo vo) {
		return dao.selectList(vo);
	}

	public int selectOneCount(ManufactureVo vo) {
		return dao.selectOneCount(vo);
	}
	
	public List<ManufactureDto> selectListForInco(ManufactureVo vo) {
		return dao.selectListForInco(vo);
	}

	public int selectOneCountForInco(ManufactureVo vo) {
		return dao.selectOneCountForInco(vo);
	}
}
