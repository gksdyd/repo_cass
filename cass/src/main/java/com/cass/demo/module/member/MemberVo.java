package com.cass.demo.module.member;

import com.cass.demo.base.xdm.BaseVo;

public class MemberVo extends BaseVo{
	
	private String seq;
	
	private Integer shBlackNy = 0;
//	-----

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public Integer getShBlackNy() {
		return shBlackNy;
	}

	public void setShBlackNy(Integer shBlackNy) {
		this.shBlackNy = shBlackNy;
	}

	
}
