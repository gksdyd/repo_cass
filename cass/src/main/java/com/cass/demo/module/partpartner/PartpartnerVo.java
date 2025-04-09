package com.cass.demo.module.partpartner;

import com.cass.demo.base.xdm.BaseVo;

public class PartpartnerVo extends BaseVo{
	
	private String seq;
	
	private int papaUseNy = 1;
	private int papaDelNy = 0;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getPapaUseNy() {
		return papaUseNy;
	}
	public void setPapaUseNy(int papaUseNy) {
		this.papaUseNy = papaUseNy;
	}
	public int getPapaDelNy() {
		return papaDelNy;
	}
	public void setPapaDelNy(int papaDelNy) {
		this.papaDelNy = papaDelNy;
	}

}
