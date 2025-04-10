package com.cass.demo.module.partsorder;

import java.time.LocalDateTime;

public class PartsOrderDto {
	
	private String ptorSeq;
	private Integer ptorNum;
	private Integer ptorAmountPrice;
	private Integer ptorDelNy;
	private LocalDateTime ptorRegDate;
	private LocalDateTime ptorModDate;
	private Integer ptorStatusCd;
	private String ptorDesc;
	private String partpartner_papaSeq;
	
	private String papaName;
	private String ptolSeq;
	private Integer ptolQty;
	private Integer ptolAmountPrice;
	private String parts_partSeq;
	private String partsorder_ptorSeq;
	
	
	public String getPtorSeq() {
		return ptorSeq;
	}
	public void setPtorSeq(String ptorSeq) {
		this.ptorSeq = ptorSeq;
	}
	public Integer getPtorNum() {
		return ptorNum;
	}
	public void setPtorNum(Integer ptorNum) {
		this.ptorNum = ptorNum;
	}
	public Integer getPtorAmountPrice() {
		return ptorAmountPrice;
	}
	public void setPtorAmoutPrice(Integer ptorAmountPrice) {
		this.ptorAmountPrice = ptorAmountPrice;
	}
	public Integer getPtorDelNy() {
		return ptorDelNy;
	}
	public void setPtorDelNy(Integer ptorDelNy) {
		this.ptorDelNy = ptorDelNy;
	}
	public LocalDateTime getPtorRegDate() {
		return ptorRegDate;
	}
	public void setPtorRegDate(LocalDateTime ptorRegDate) {
		this.ptorRegDate = ptorRegDate;
	}
	public LocalDateTime getPtorModDate() {
		return ptorModDate;
	}
	public void setPtorModDate(LocalDateTime ptorModDate) {
		this.ptorModDate = ptorModDate;
	}
	public Integer getPtorStatusCd() {
		return ptorStatusCd;
	}
	public void setPtorStatusCd(Integer ptorStatusCd) {
		this.ptorStatusCd = ptorStatusCd;
	}
	public String getPtorDesc() {
		return ptorDesc;
	}
	public void setPtorDesc(String ptorDesc) {
		this.ptorDesc = ptorDesc;
	}
	public String getPartpartner_papaSeq() {
		return partpartner_papaSeq;
	}
	public void setPartpartner_papaSeq(String partpartner_papaSeq) {
		this.partpartner_papaSeq = partpartner_papaSeq;
	}
	public String getPtolSeq() {
		return ptolSeq;
	}
	public void setPtolSeq(String ptolSeq) {
		this.ptolSeq = ptolSeq;
	}
	public Integer getPtolQty() {
		return ptolQty;
	}
	public void setPtolQty(Integer ptolQty) {
		this.ptolQty = ptolQty;
	}
	public Integer getPtolAmountPrice() {
		return ptolAmountPrice;
	}
	public void setPtolAmoutPrice(Integer ptolAmountPrice) {
		this.ptolAmountPrice = ptolAmountPrice;
	}
	public String getParts_partSeq() {
		return parts_partSeq;
	}
	public void setParts_partSeq(String parts_partSeq) {
		this.parts_partSeq = parts_partSeq;
	}
	public String getPartsorder_ptorSeq() {
		return partsorder_ptorSeq;
	}
	public void setPartsorder_ptorSeq(String partsorder_ptorSeq) {
		this.partsorder_ptorSeq = partsorder_ptorSeq;
	}
	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public void setPtorAmountPrice(Integer ptorAmountPrice) {
		this.ptorAmountPrice = ptorAmountPrice;
	}
	public void setPtolAmountPrice(Integer ptolAmountPrice) {
		this.ptolAmountPrice = ptolAmountPrice;
	}
	
	

}
