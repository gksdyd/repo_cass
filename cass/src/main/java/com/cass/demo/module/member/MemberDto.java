package com.cass.demo.module.member;

import java.time.LocalDateTime;

public class MemberDto {
	
	private String membSeq = "2";
	private String membID;
	private String membPassword;
	private String membName;
	private LocalDateTime membRegDate;
	private LocalDateTime membModDate;
	private Integer membUseNy;
	private Integer membDelNy;
	public String getMembSeq() {
		return membSeq;
	}
	public void setMembSeq(String membSeq) {
		this.membSeq = membSeq;
	}
	public String getMembID() {
		return membID;
	}
	public void setMembID(String membID) {
		this.membID = membID;
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
	public LocalDateTime getMembRegDate() {
		return membRegDate;
	}
	public void setMembRegDate(LocalDateTime membRegDate) {
		this.membRegDate = membRegDate;
	}
	public LocalDateTime getMembModDate() {
		return membModDate;
	}
	public void setMembModDate(LocalDateTime membModDate) {
		this.membModDate = membModDate;
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
	

}
