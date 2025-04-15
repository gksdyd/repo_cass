package com.cass.demo.module.index;

import org.springframework.stereotype.Repository;

@Repository
public interface IndexDao {
	
	public int selectOneCountOnPdor(IndexDto dto);
	public int selectOneCountOnMafa(IndexDto dto);
	public int selectOneCountOnDeli(IndexDto dto);

}
