package com.cass.demo.module.productorder;

import com.cass.demo.base.xdm.BaseVo;

public class ProductOrderVo extends BaseVo{
	
	private String pdorSeq;
	private String pdolSeq;
	private String tpolSeq;

//	-----

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
	

}
