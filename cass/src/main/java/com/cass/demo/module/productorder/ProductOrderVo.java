package com.cass.demo.module.productorder;

import com.cass.demo.base.xdm.BaseVo;

public class ProductOrderVo extends BaseVo{
	
	private Integer pdorNum;
	private Integer pdorStatusCd;

	public Integer getPdorNum() {
		return pdorNum;
	}

	public void setPdorNum(Integer pdorNum) {
		this.pdorNum = pdorNum;
	}

	public Integer getPdorStatusCd() {
		return pdorStatusCd;
	}

	public void setPdorStatusCd(Integer pdorStatusCd) {
		this.pdorStatusCd = pdorStatusCd;
	}
}
