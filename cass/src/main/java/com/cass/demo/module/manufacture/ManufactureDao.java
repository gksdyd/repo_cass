package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureDao {
	public List<ManufactureDto> selectList(ManufactureDto dto);
}
