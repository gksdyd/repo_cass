package com.cass.demo.module.code;

import java.util.ArrayList;
import java.util.List;


public class CodeDto {

	private String codeSeq;
	private String codeName;
	private String codeNameEng;
	private String codeNum;
	private Integer codeUseNy;
	private Integer codeOrder;
	private String codeDesc;
	private String codeRegDate;
	private String codeModDate;
	private Integer codeDelNy;
	private String codegroup_cdgrSeq;
	private String cdgrSeq;
	private String cdgrName;
	
//	for cache
	public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();
//	-----
	public String getCodeSeq() {
		return codeSeq;
	}
	public void setCodeSeq(String codeSeq) {
		this.codeSeq = codeSeq;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getCodeNameEng() {
		return codeNameEng;
	}
	public void setCodeNameEng(String codeNameEng) {
		this.codeNameEng = codeNameEng;
	}
	public String getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(String codeNum) {
		this.codeNum = codeNum;
	}
	public Integer getCodeUseNy() {
		return codeUseNy;
	}
	public void setCodeUseNy(Integer codeUseNy) {
		this.codeUseNy = codeUseNy;
	}
	public Integer getCodeOrder() {
		return codeOrder;
	}
	public void setCodeOrder(Integer codeOrder) {
		this.codeOrder = codeOrder;
	}
	public String getCodeDesc() {
		return codeDesc;
	}
	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}
	public String getCodeRegDate() {
		return codeRegDate;
	}
	public void setCodeRegDate(String codeRegDate) {
		this.codeRegDate = codeRegDate;
	}
	public String getCodeModDate() {
		return codeModDate;
	}
	public void setCodeModDate(String codeModDate) {
		this.codeModDate = codeModDate;
	}
	public Integer getCodeDelNy() {
		return codeDelNy;
	}
	public void setCodeDelNy(Integer codeDelNy) {
		this.codeDelNy = codeDelNy;
	}
	public String getCodegroup_cdgrSeq() {
		return codegroup_cdgrSeq;
	}
	public void setCodegroup_cdgrSeq(String codegroup_cdgrSeq) {
		this.codegroup_cdgrSeq = codegroup_cdgrSeq;
	}
	public static List<CodeDto> getCachedCodeArrayList() {
		return cachedCodeArrayList;
	}
	
	
	public String getCdgrSeq() {
		return cdgrSeq;
	}
	public void setCdgrSeq(String cdgrSeq) {
		this.cdgrSeq = cdgrSeq;
	}
	public String getCdgrName() {
		return cdgrName;
	}
	public void setCdgrName(String cdgrName) {
		this.cdgrName = cdgrName;
	}
	public static void setCachedCodeArrayList(List<CodeDto> cachedCodeArrayList) {
		CodeDto.cachedCodeArrayList = cachedCodeArrayList;
	}
	
}
