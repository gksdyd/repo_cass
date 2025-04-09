package com.cass.demo.module.partpartner;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PartpartnerDao {
	
	public PartpartnerDto selectOneLogin(PartpartnerDto partpartnerDto);
	public PartpartnerDto getIdPass(PartpartnerDto partpartnerDto);
	public int selectOneCount(PartpartnerVo vo);
	public List<PartpartnerDto> selectList(PartpartnerVo vo);
	public PartpartnerDto selectOne(PartpartnerDto partpartnerDto);
}
