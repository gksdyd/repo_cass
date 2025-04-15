package com.cass.demo.module.productorder;

import com.cass.demo.base.xdm.BaseVo;

public class ProductOrderVo extends BaseVo{
	
	private Integer pdorNum;
	private Integer pdorStatusCd;
	private Integer shStatusCd;

 	private String pdorSeq;
	private String pdolSeq;
	private String tpolSeq;
	
	private int flag = 0;
//	-----
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

	public String getPdorSeq() {
		return pdorSeq;
	}

	public void setPdorSeq(String pdorSeq) {
		this.pdorSeq = pdorSeq;
	}

	public String getPdolSeq() {
		return pdolSeq;
	}

	public void setPdolSeq(String pdolSeq) {
		this.pdolSeq = pdolSeq;
	}

	public String getTpolSeq() {
		return tpolSeq;
	}

	public void setTpolSeq(String tpolSeq) {
		this.tpolSeq = tpolSeq;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Integer getShStatusCd() {
		return shStatusCd;
	}

	public void setShStatusCd(Integer shStatusCd) {
		this.shStatusCd = shStatusCd;
	}
	
}
