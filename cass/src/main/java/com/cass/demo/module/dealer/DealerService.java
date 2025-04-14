package com.cass.demo.module.dealer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealerService {
	
	@Autowired
	DealerDao dealerDao;
	
	public DealerDto selectOneLogin(DealerDto dealerDto) {
		return dealerDao.selectOneLogin(dealerDto);
	}
	
	public DealerDto getIdPass(DealerDto dealerDto) {
		return dealerDao.getIdPass(dealerDto);
	}
	
	public int selectOneCount(DealerVo vo) {
		return dealerDao.selectOneCount(vo);
	}
	public List<DealerDto> selectList(DealerVo vo) {
		return dealerDao.selectList(vo);
	}
	public DealerDto selectOne(DealerDto dealerDto) {
		return dealerDao.selectOne(dealerDto);
	}
	
	public DealerDto selectOne(DealerVo Vo) {
		return dealerDao.selectOne(Vo);
	}
	
	public int insert(DealerDto dealerDto) {
		return dealerDao.insert(dealerDto);
	}
	
	public int update(DealerDto dealerDto) {
		return dealerDao.update(dealerDto);
	}
	
	public int uelete(DealerDto dealerDto) {
		return dealerDao.uelete(dealerDto);
	}
	
	public List<DealerDto> selectListDealerName() {
		return dealerDao.selectListDealerName();
	}
}
