package com.cass.demo.module.dealer;

import com.cass.demo.base.xdm.BaseVo;

public class DealerVo extends BaseVo{
	
	private String seq;
	
	private String dealSeq;
	
	private int dealUseNy = 1;
	private int dealDelNy = 0;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getDealSeq() {
		return dealSeq;
	}
	public void setDealSeq(String dealSeq) {
		this.dealSeq = dealSeq;
	}
	public int getDealUseNy() {
		return dealUseNy;
	}
	public void setDealUseNy(int dealUseNy) {
		this.dealUseNy = dealUseNy;
	}
	public int getDealDelNy() {
		return dealDelNy;
	}
	public void setDealDelNy(int dealDelNy) {
		this.dealDelNy = dealDelNy;
	}

}
