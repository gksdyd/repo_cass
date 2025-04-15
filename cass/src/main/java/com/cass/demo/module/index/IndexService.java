package com.cass.demo.module.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	
	@Autowired
	IndexDao dao;
	
	public int selectOneCountOnPdor(IndexDto dto) {
		return dao.selectOneCountOnPdor(dto);
	}
	public int selectOneCountOnMafa(IndexDto dto) {
		return dao.selectOneCountOnMafa(dto);
	}
	public int selectOneCountOnDeli(IndexDto dto) {
		return dao.selectOneCountOnDeli(dto);
	}

}
