package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureDao {
	public List<ManufactureDto> selectList(ManufactureVo vo);
	public int selectOneCount(ManufactureVo vo);
	public List<ManufactureDto> selectListForInco(ManufactureVo vo);
	public int selectOneCountForInco(ManufactureVo vo);
}
