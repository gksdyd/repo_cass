package com.cass.demo.module.income;

public class IncomeDto {
	private String incoSeq;
	private Integer ptorNum;
	private String papaName;
	private String incoDate;
	private Integer incoAmountPrice;
//	-----
	public String getIncoSeq() {
		return incoSeq;
	}
	public void setIncoSeq(String incoSeq) {
		this.incoSeq = incoSeq;
	}
	public Integer getPtorNum() {
		return ptorNum;
	}
	public void setPtorNum(Integer ptorNum) {
		this.ptorNum = ptorNum;
	}
	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public String getIncoDate() {
		return incoDate;
	}
	public void setIncoDate(String incoDate) {
		this.incoDate = incoDate;
	}
	public Integer getIncoAmountPrice() {
		return incoAmountPrice;
	}
	public void setIncoAmountPrice(Integer incoAmountPrice) {
		this.incoAmountPrice = incoAmountPrice;
	}
	
}
