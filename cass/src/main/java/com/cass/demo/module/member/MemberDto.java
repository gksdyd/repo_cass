package com.cass.demo.module.member;

public class MemberDto {
	
	private String membSeq = "2";
	private String membId;
	private String membPassword;
	private String membName;
	private String membRegDate;
	private String membModDate;
	private Integer membUseNy;
	private Integer membDelNy;
//	----
	public String getMembSeq() {
		return membSeq;
	}
	public void setMembSeq(String membSeq) {
		this.membSeq = membSeq;
	}
	public String getMembPassword() {
		return membPassword;
	}
	public void setMembPassword(String membPassword) {
		this.membPassword = membPassword;
	}
	public String getMembName() {
		return membName;
	}
	public void setMembName(String membName) {
		this.membName = membName;
	}
	public Integer getMembUseNy() {
		return membUseNy;
	}
	public void setMembUseNy(Integer membUseNy) {
		this.membUseNy = membUseNy;
	}
	public Integer getMembDelNy() {
		return membDelNy;
	}
	public void setMembDelNy(Integer membDelNy) {
		this.membDelNy = membDelNy;
	}
	public String getMembRegDate() {
		return membRegDate;
	}
	public void setMembRegDate(String membRegDate) {
		this.membRegDate = membRegDate;
	}
	public String getMembModDate() {
		return membModDate;
	}
	public void setMembModDate(String membModDate) {
		this.membModDate = membModDate;
	}
	public String getMembId() {
		return membId;
	}
	public void setMembId(String membId) {
		this.membId = membId;
	}
	

}
