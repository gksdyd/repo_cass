package com.cass.demo.module.dealer;

import com.cass.demo.base.xdm.BaseVo;

public class DealerVo extends BaseVo{
private String seq;
	
	private int dealUseNy = 1;
	private int dealDelNy = 0;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getDealerUseNy() {
		return dealUseNy;
	}
	public void setDealerUseNy(int dealerUseNy) {
		this.dealUseNy = dealerUseNy;
	}
	public int getDealerDelNy() {
		return dealDelNy;
	}
	public void setDealerDelNy(int dealerDelNy) {
		this.dealDelNy = dealerDelNy;
	}

}
