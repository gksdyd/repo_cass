package com.cass.demo.module.product;

import com.cass.demo.base.xdm.BaseVo;

public class ProductVo extends BaseVo {

	private String seq;
	
	private int prdtUseNy = 1;
	private int prdtDelNy = 0;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getPrdtUseNy() {
		return prdtUseNy;
	}
	public void setPrdtUseNy(int prdtUseNy) {
		this.prdtUseNy = prdtUseNy;
	}
	public int getPrdtDelNy() {
		return prdtDelNy;
	}
	public void setPrdtDelNy(int prdtDelNy) {
		this.prdtDelNy = prdtDelNy;
	}
	
}
