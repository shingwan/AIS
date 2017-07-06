package com.test.ex.Adto;

import java.sql.Date;

public class ADto {
	int aId;
	int aNumber;
	String aName, aContentM, aContentG, aStetas, aSpace, aDay, aSkill, aYoken, aSangryu, aEtc, aManager;
	Date aDate;

	public ADto() {

	}
	public ADto(int aId, String aName, String aStetas, String aContentM, String aContentG, String aSpace, String aDay, int aNumber, String aSkill, String aYoken, String aSangryu, String aEtc, String aManager, Date aDate){
		this.aId = aId;
		this.aName = aName;
		this.aStetas = aStetas;
		this.aContentM = aContentM;
		this.aContentG = aContentG;
		this.aSpace = aSpace;
		this.aDay = aDay;
		this.aNumber = aNumber;
		this.aSkill = aSkill;
		this.aYoken = aYoken;
		this.aSangryu = aSangryu;
		this.aEtc = aEtc;
		this.aManager = aManager;
		this.aDate = aDate;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public int getaNumber() {
		return aNumber;
	}
	public void setaNumber(int aNumber) {
		this.aNumber = aNumber;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaStetas() {
		return aStetas;
	}
	public void setaStetas(String aStetas) {
		this.aStetas = aStetas;
	}
	public String getaContentM() {
		return aContentM;
	}
	public void setaContentM(String aContentM) {
		this.aContentM = aContentM;
	}
	public String getaContentG() {
		return aContentG;
	}
	public void setaContentG(String aContentG) {
		this.aContentG = aContentG;
	}
	public String getaSpace() {
		return aSpace;
	}
	public void setaSpace(String aSpace) {
		this.aSpace = aSpace;
	}
	public String getaDay() {
		return aDay;
	}
	public void setaDay(String aDay) {
		this.aDay = aDay;
	}
	public String getaSkill() {
		return aSkill;
	}
	public void setaSkill(String aSkill) {
		this.aSkill = aSkill;
	}
	public String getaYoken() {
		return aYoken;
	}
	public void setaYoken(String aYoken) {
		this.aYoken = aYoken;
	}
	public String getaSangryu() {
		return aSangryu;
	}
	public void setaSangryu(String aSangryu) {
		this.aSangryu = aSangryu;
	}
	public String getaEtc() {
		return aEtc;
	}
	public void setaEtc(String aEtc) {
		this.aEtc = aEtc;
	}
	public String getaManager() {
		return aManager;
	}
	public void setaManager(String aManager) {
		this.aManager = aManager;
	}
	public Date getaDate() {
		return aDate;
	}
	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}
}