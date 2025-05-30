package com.cass.demo.module.dealer;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DealerDao {
	public DealerDto selectOneLogin(DealerDto dealerDto);
	public DealerDto getIdPass(DealerDto dealerDto);
	public int selectOneCount(DealerVo vo);
	public List<DealerDto> selectList(DealerVo vo);
	public List<DealerDto> selectListForIndex(DealerDto dealerDto);
	public DealerDto selectOne(DealerDto dealerDto);
	public DealerDto selectOne(DealerVo Vo);
	public List<DealerDto> selectOneList(DealerDto dealerDto);
	
	public int insert(DealerDto dealerDto);
	public int update(DealerDto dealerDto);
	public int uelete(DealerDto dealerDto);
	
	public List<DealerDto> selectListDealerName();
}
