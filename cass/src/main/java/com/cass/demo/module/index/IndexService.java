package com.cass.demo.module.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	
	@Autowired
	IndexDao dao;
	
	public int selectOneCountOnPdor() {
		return dao.selectOneCountOnPdor();
	}
	public int selectOneCountOnMafa() {
		return dao.selectOneCountOnMafa();
	}
	public int selectOneCountOnDeli() {
		return dao.selectOneCountOnDeli();
	}
	
	public List<IndexDto> selectListItemForIndex(IndexDto dto) {
		return dao.selectListItemForIndex(dto);
	}

}
