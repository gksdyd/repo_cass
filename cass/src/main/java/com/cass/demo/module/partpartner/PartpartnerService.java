package com.cass.demo.module.partpartner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartpartnerService {
	
	@Autowired
	PartpartnerDao partpartnerDao;
	
	public PartpartnerDto selectOneLogin(PartpartnerDto partpartnerDto) {
		return partpartnerDao.selectOneLogin(partpartnerDto);
	}
	
	public PartpartnerDto getIdPass(PartpartnerDto partpartnerDto) {
		return partpartnerDao.getIdPass(partpartnerDto);
	}
	
	public int selectOneCount(PartpartnerVo vo) {
		return partpartnerDao.selectOneCount(vo);
	}
	public List<PartpartnerDto> selectList(PartpartnerVo vo) {
		return partpartnerDao.selectList(vo);
	}
	public PartpartnerDto selectOne(PartpartnerDto partpartnerDto) {
		return partpartnerDao.selectOne(partpartnerDto);
	}
}
