package com.cass.demo.module.delivery;

import java.time.LocalDateTime;

public class DeliveryDto {
	
	private String deliSeq;
	private Integer deliStausCd;
	private String deliRegDate;
	private String deliModDate;
	private String deliDesc;
	
	private String productorder_pdorSeq;
	private Integer pdorTotalPrice;
	
	private Integer pdorNum;
	private Integer productTotalCnt;
	
	
	public String getDeliSeq() {
		return deliSeq;
	}
	public void setDeliSeq(String deliSeq) {
		this.deliSeq = deliSeq;
	}
	public Integer getDeliStausCd() {
		return deliStausCd;
	}
	public void setDeliStausCd(Integer deliStausCd) {
		this.deliStausCd = deliStausCd;
	}
	public String getDeliRegDate() {
		return deliRegDate;
	}
	public void setDeliRegDate(String deliRegDate) {
		this.deliRegDate = deliRegDate;
	}
	public String getDeliModDate() {
		return deliModDate;
	}
	public void setDeliModDate(String deliModDate) {
		this.deliModDate = deliModDate;
	}
	public String getDeliDesc() {
		return deliDesc;
	}
	public void setDeliDesc(String deliDesc) {
		this.deliDesc = deliDesc;
	}
	public String getProductorder_pdorSeq() {
		return productorder_pdorSeq;
	}
	public void setProductorder_pdorSeq(String productorder_pdorSeq) {
		this.productorder_pdorSeq = productorder_pdorSeq;
	}
	public Integer getPdorTotalPrice() {
		return pdorTotalPrice;
	}
	public void setPdorTotalPrice(Integer pdorTotalPrice) {
		this.pdorTotalPrice = pdorTotalPrice;
	}
	public Integer getPdorNum() {
		return pdorNum;
	}
	public void setPdorNum(Integer pdorNum) {
		this.pdorNum = pdorNum;
	}
	public Integer getProductTotalCnt() {
		return productTotalCnt;
	}
	public void setProductTotalCnt(Integer productTotalCnt) {
		this.productTotalCnt = productTotalCnt;
	}
}
