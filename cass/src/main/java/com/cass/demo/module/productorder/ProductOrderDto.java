package com.cass.demo.module.productorder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductOrderDto {
	
	private String pdorSeq;
	private Integer pdorNum;
	private LocalDateTime pdorRegDate;
	private LocalDateTime pdorModDate;
	private Integer pdorTotalQty;
	private Integer pdorTotalPrice;
	private String pdorDesc;
	private Integer pdorDelNy;
	private String pdorStatusCd;
	private String dealer_dealSeq;
	
	private String pdolSeq;
	private Integer pdolQty;
	private Integer pdolAmountPrice;
	private Integer pdolDelNy;
	private Integer pdolStatusCd;
	private String product_prdtSeq;
	private String productorder_pdorSeq;
	private String dealName;
	private String dealManager;

	private String prdtName;
  private String prdtSN;
	private String prdtPrice;
	
	private String tpolSeq;
	private String tpolQty;
	private Integer tpolTotalPrice;
	
	private String mafaNum;
	private String deliNum;
	private String incoNum;
	private Integer stckTotalQty;
	
	List<String> scaleNameArray = new ArrayList<>();
	List<Integer> scaleCountArray = new ArrayList<>();
	
	public String getPdorSeq() {
		return pdorSeq;
	}
	public void setPdorSeq(String pdorSeq) {
		this.pdorSeq = pdorSeq;
	}
	public Integer getPdorNum() {
		return pdorNum;
	}
	public void setPdorNum(Integer pdorNum) {
		this.pdorNum = pdorNum;
	}
	public LocalDateTime getPdorRegDate() {
		return pdorRegDate;
	}
	public void setPdorRegDate(LocalDateTime pdorRegDate) {
		this.pdorRegDate = pdorRegDate;
	}
	public LocalDateTime getPdorModDate() {
		return pdorModDate;
	}
	public void setPdorModDate(LocalDateTime pdorModDate) {
		this.pdorModDate = pdorModDate;
	}
	public Integer getPdorTotalPrice() {
		return pdorTotalPrice;
	}
	public void setPdorTotalPrice(Integer pdorTotalPrice) {
		this.pdorTotalPrice = pdorTotalPrice;
	}
	public String getPdorDesc() {
		return pdorDesc;
	}
	public void setPdorDesc(String pdorDesc) {
		this.pdorDesc = pdorDesc;
	}
	public Integer getPdorDelNy() {
		return pdorDelNy;
	}
	public void setPdorDelNy(Integer pdorDelNy) {
		this.pdorDelNy = pdorDelNy;
	}
	public String getPdorStatusCd() {
		return pdorStatusCd;
	}
	public void setPdorStatusCd(String pdorStatusCd) {
		this.pdorStatusCd = pdorStatusCd;
	}
	public String getDealer_dealSeq() {
		return dealer_dealSeq;
	}
	public void setDealer_dealSeq(String dealer_dealSeq) {
		this.dealer_dealSeq = dealer_dealSeq;
	}
	public String getPdolSeq() {
		return pdolSeq;
	}
	public void setPdolSeq(String pdolSeq) {
		this.pdolSeq = pdolSeq;
	}
	public Integer getPdolQty() {
		return pdolQty;
	}
	public void setPdolQty(Integer pdolQty) {
		this.pdolQty = pdolQty;
	}
	public Integer getPdolAmountPrice() {
		return pdolAmountPrice;
	}
	public void setPdolAmountPrice(Integer pdolAmountPrice) {
		this.pdolAmountPrice = pdolAmountPrice;
	}
	public String getProduct_prdtSeq() {
		return product_prdtSeq;
	}
	public void setProduct_prdtSeq(String product_prdtSeq) {
		this.product_prdtSeq = product_prdtSeq;
	}
	public String getProductorder_pdorSeq() {
		return productorder_pdorSeq;
	}
	public void setProductorder_pdorSeq(String productorder_pdorSeq) {
		this.productorder_pdorSeq = productorder_pdorSeq;
	}
	public String getDealName() {
		return dealName;
	}
	public void setDealName(String dealName) {
		this.dealName = dealName;
	}
	public String getDealManager() {
		return dealManager;
	}
	public void setDealManager(String dealManager) {
		this.dealManager = dealManager;
	}

	public Integer getPdorTotalQty() {
		return pdorTotalQty;
	}
	public void setPdorTotalQty(Integer pdorTotalQty) {
		this.pdorTotalQty = pdorTotalQty;
	}

	public String getPrdtName() {
		return prdtName;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}

	public String getPrdtSN() {
		return prdtSN;
	}
	public void setPrdtSN(String prdtSN) {
		this.prdtSN = prdtSN;
	}

	public String getPrdtPrice() {
		return prdtPrice;
	}
	public void setPrdtPrice(String prdtPrice) {
		this.prdtPrice = prdtPrice;
	}
	public Integer getPdolDelNy() {
		return pdolDelNy;
	}
	public void setPdolDelNy(Integer pdolDelNy) {
		this.pdolDelNy = pdolDelNy;
	}
	public String getTpolSeq() {
		return tpolSeq;
	}
	public void setTpolSeq(String tpolSeq) {
		this.tpolSeq = tpolSeq;
	}
	public String getTpolQty() {
		return tpolQty;
	}
	public void setTpolQty(String tpolQty) {
		this.tpolQty = tpolQty;
	}
	public Integer getTpolTotalPrice() {
		return tpolTotalPrice;
	}
	public void setTpolTotalPrice(Integer tpolTotalPrice) {
		this.tpolTotalPrice = tpolTotalPrice;
	}
	public Integer getPdolStatusCd() {
		return pdolStatusCd;
	}
	public void setPdolStatusCd(Integer pdolStatusCd) {
		this.pdolStatusCd = pdolStatusCd;
	}
	public String getMafaNum() {
		return mafaNum;
	}
	public void setMafaNum(String mafaNum) {
		this.mafaNum = mafaNum;
	}
	public String getDeliNum() {
		return deliNum;
	}
	public void setDeliNum(String deliNum) {
		this.deliNum = deliNum;
	}
	public String getIncoNum() {
		return incoNum;
	}
	public void setIncoNum(String incoNum) {
		this.incoNum = incoNum;
	}
	public Integer getStckTotalQty() {
		return stckTotalQty;
	}
	public void setStckTotalQty(Integer stckTotalQty) {
		this.stckTotalQty = stckTotalQty;
	}
	public List<String> getScaleNameArray() {
		return scaleNameArray;
	}
	public void setScaleNameArray(List<String> scaleNameArray) {
		this.scaleNameArray = scaleNameArray;
	}
	public List<Integer> getScaleCountArray() {
		return scaleCountArray;
	}
	public void setScaleCountArray(List<Integer> scaleCountArray) {
		this.scaleCountArray = scaleCountArray;
	}
}
