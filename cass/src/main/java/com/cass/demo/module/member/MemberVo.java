package com.cass.demo.module.member;

import com.cass.demo.base.xdm.BaseVo;

public class MemberVo extends BaseVo{
	
	private String seq;
	
	private int membUseNy = 1;
	private int membDelNy = 0;
//	-----

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public int getMembUseNy() {
		return membUseNy;
	}

	public void setMembUseNy(int membUseNy) {
		this.membUseNy = membUseNy;
	}

	public int getMembDelNy() {
		return membDelNy;
	}

	public void setMembDelNy(int membDelNy) {
		this.membDelNy = membDelNy;
	}
	
}
