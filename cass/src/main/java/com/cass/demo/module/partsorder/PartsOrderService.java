package com.cass.demo.module.partsorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartsOrderService {
	@Autowired
	PartsOrderDao partsOrderDao;
	
	public List<PartsOrderDto> selectList(PartsOrderVo partsOrderVo) {
		return partsOrderDao.selectList(partsOrderVo);
	}
	public int selectOneCount(PartsOrderVo partsOrderVo) {
		return partsOrderDao.selectOneCount(partsOrderVo);
	}

}
