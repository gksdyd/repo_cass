package com.cass.demo.module.delivery;

import java.time.LocalDateTime;

public class DeliveryDto {
	
	private String deliSeq;
	private Integer deliStausCd;
	private LocalDateTime deliRegDate;
	private LocalDateTime deliModDate;
	private String deliDesc;
	
	private String productorder_pdorSeq;
	private Integer pdorTotalPrice;
	
	
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
	public LocalDateTime getDeliRegDate() {
		return deliRegDate;
	}
	public void setDeliRegDate(LocalDateTime deliRegDate) {
		this.deliRegDate = deliRegDate;
	}
	public LocalDateTime getDeliModDate() {
		return deliModDate;
	}
	public void setDeliModDate(LocalDateTime deliModDate) {
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
	
	

}
