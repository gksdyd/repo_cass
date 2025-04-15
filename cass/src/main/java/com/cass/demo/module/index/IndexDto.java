package com.cass.demo.module.index;

public class IndexDto {

	private String prdtSeq;
	private String prdtName;
	private Integer prdtCateCd;
	private int prdtPrice;
	private int amountPrice;
	private int amountQty;
//	-----
	
	public String getPrdtName() {
		return prdtName;
	}
	public String getPrdtSeq() {
		return prdtSeq;
	}
	public void setPrdtSeq(String prdtSeq) {
		this.prdtSeq = prdtSeq;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}
	public Integer getPrdtCateCd() {
		return prdtCateCd;
	}
	public void setPrdtCateCd(Integer prdtCateCd) {
		this.prdtCateCd = prdtCateCd;
	}
	public int getPrdtPrice() {
		return prdtPrice;
	}
	public void setPrdtPrice(int prdtPrice) {
		this.prdtPrice = prdtPrice;
	}
	public int getAmountPrice() {
		return amountPrice;
	}
	public void setAmountPrice(int amountPrice) {
		this.amountPrice = amountPrice;
	}
	public int getAmountQty() {
		return amountQty;
	}
	public void setAmountQty(int amountQty) {
		this.amountQty = amountQty;
	}
	
	
}
