package com.cass.demo.module.income;

import com.cass.demo.base.xdm.BaseDto;

public class IncomeDto extends BaseDto{
	private String incoSeq;
	private Integer incoNum;
	private Integer incoStatusCd;
	private Integer incoTotalQty;
	private String incoRegDate;
	private String incoModDate;
	private String incoDesc;
	private Integer mafaNum;
	
	private String pdorSeq;
	private Integer pdorNum;
	private String dealName;
//	-----
	public String getIncoSeq() {
		return incoSeq;
	}
	public void setIncoSeq(String incoSeq) {
		this.incoSeq = incoSeq;
	}
	public Integer getIncoNum() {
		return incoNum;
	}
	public void setIncoNum(Integer incoNum) {
		this.incoNum = incoNum;
	}
	public Integer getIncoStatusCd() {
		return incoStatusCd;
	}
	public void setIncoStatusCd(Integer incoStatusCd) {
		this.incoStatusCd = incoStatusCd;
	}
	public Integer getIncoTotalQty() {
		return incoTotalQty;
	}
	public void setIncoTotalQty(Integer incoTotalQty) {
		this.incoTotalQty = incoTotalQty;
	}
	public String getIncoRegDate() {
		return incoRegDate;
	}
	public void setIncoRegDate(String incoRegDate) {
		this.incoRegDate = incoRegDate;
	}
	public String getIncoModDate() {
		return incoModDate;
	}
	public void setIncoModDate(String incoModDate) {
		this.incoModDate = incoModDate;
	}
	public Integer getMafaNum() {
		return mafaNum;
	}
	public void setMafaNum(Integer mafaNum) {
		this.mafaNum = mafaNum;
	}
	public Integer getPdorNum() {
		return pdorNum;
	}
	public void setPdorNum(Integer pdorNum) {
		this.pdorNum = pdorNum;
	}
	public String getDealName() {
		return dealName;
	}
	public void setDealName(String dealName) {
		this.dealName = dealName;
	}
	public String getIncoDesc() {
		return incoDesc;
	}
	public void setIncoDesc(String incoDesc) {
		this.incoDesc = incoDesc;
	}
	public String getPdorSeq() {
		return pdorSeq;
	}
	public void setPdorSeq(String pdorSeq) {
		this.pdorSeq = pdorSeq;
	}
	
}
