package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufactureService {
	
	@Autowired
	ManufactureDao dao;
	
	public List<ManufactureDto> selectList(ManufactureDto dto) {
		return dao.selectList(dto);
	}

}
