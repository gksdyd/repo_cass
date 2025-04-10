package com.cass.demo.module.dealer;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DealerDao {
	public DealerDto selectOneLogin(DealerDto dealerDto);
	public DealerDto getIdPass(DealerDto dealerDto);
	public int selectOneCount(DealerVo vo);
	public List<DealerDto> selectList(DealerVo vo);
	public DealerDto selectOne(DealerDto dealerDto);
}
