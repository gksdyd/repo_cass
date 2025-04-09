package com.cass.demo.module.parts;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PartsDao {

	public List<PartsDto> selectList(PartsVo vo);
}
