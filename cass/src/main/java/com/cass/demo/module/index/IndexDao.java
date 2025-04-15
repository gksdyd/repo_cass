package com.cass.demo.module.index;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IndexDao {
	
	public int selectOneCountOnPdor();
	public int selectOneCountOnMafa();
	public int selectOneCountOnDeli();
	
	public List<IndexDto> selectListItemForIndex(IndexDto dto);

}
