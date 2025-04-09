package com.cass.demo.module.parts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartsService {

	@Autowired
	PartsDao partsDao;
	
	public List<PartsDto> selectList(PartsVo vo) {
		return partsDao.selectList(vo);
	}
}
