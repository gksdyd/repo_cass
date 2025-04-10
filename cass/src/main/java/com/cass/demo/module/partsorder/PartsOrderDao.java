package com.cass.demo.module.partsorder;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PartsOrderDao {
	
	public List<PartsOrderDto> selectList(PartsOrderVo partsOrderVo);
	public int selectOneCount(PartsOrderVo partsOrderVo);

}
