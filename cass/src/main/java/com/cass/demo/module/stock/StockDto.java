package com.cass.demo.module.stock;

public class StockDto {

	private String stckSeq;
	private int stckQty;
	private int stckTotalQty;
	private String stckModDate;
	private String stckDesc;
	private String parts_partSeq;
	private String product_prdtSeq;
	private String manufacture_mafaSeq;
	private String delivery_deliSeq;
	private String incoming_incoSeq; 
	private String prdtName; 
	private String partName; 
	
	public String getStckSeq() {
		return stckSeq;
	}
	public void setStckSeq(String stckSeq) {
		this.stckSeq = stckSeq;
	}
	public int getStckQty() {
		return stckQty;
	}
	public void setStckQty(int stckQty) {
		this.stckQty = stckQty;
	}
	public int getStckTotalQty() {
		return stckTotalQty;
	}
	public void setStckTotalQty(int stckTotalQty) {
		this.stckTotalQty = stckTotalQty;
	}
	public String getStckModDate() {
		return stckModDate;
	}
	public void setStckModDate(String stckModDate) {
		this.stckModDate = stckModDate;
	}
	public String getStckDesc() {
		return stckDesc;
	}
	public void setStckDesc(String stckDesc) {
		this.stckDesc = stckDesc;
	}
	public String getParts_partSeq() {
		return parts_partSeq;
	}
	public void setParts_partSeq(String parts_partSeq) {
		this.parts_partSeq = parts_partSeq;
	}
	public String getProduct_prdtSeq() {
		return product_prdtSeq;
	}
	public void setProduct_prdtSeq(String product_prdtSeq) {
		this.product_prdtSeq = product_prdtSeq;
	}
	public String getManufacture_mafaSeq() {
		return manufacture_mafaSeq;
	}
	public void setManufacture_mafaSeq(String manufacture_mafaSeq) {
		this.manufacture_mafaSeq = manufacture_mafaSeq;
	}
	public String getDelivery_deliSeq() {
		return delivery_deliSeq;
	}
	public void setDelivery_deliSeq(String delivery_deliSeq) {
		this.delivery_deliSeq = delivery_deliSeq;
	}
	public String getIncoming_incoSeq() {
		return incoming_incoSeq;
	}
	public void setIncoming_incoSeq(String incoming_incoSeq) {
		this.incoming_incoSeq = incoming_incoSeq;
	}
	public String getPrdtName() {
		return prdtName;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
}
