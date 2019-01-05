package com.cg.agent.bean;

public class InsuredBean {
	String insuredName;
	String insuredStreet;
	String insuredCity;
	String insuredState;
	int insuredZip;
	
	int policyNumber;
	String policyPremium;
	String businessSegment;
	long accountNumber;

	String userName;
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredStreet() {
		return insuredStreet;
	}
	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}
	public String getInsuredCity() {
		return insuredCity;
	}
	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}
	public String getInsuredState() {
		return insuredState;
	}
	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}
	public int getInsuredZip() {
		return insuredZip;
	}
	public void setInsuredZip(int insuredZip) {
		this.insuredZip = insuredZip;
	}
	public String getBusinessSegment() {
		return businessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyPremium() {
		return policyPremium;
	}
	public void setPolicyPremium(String policyPremium) {
		this.policyPremium = policyPremium;
	}
	@Override
	public String toString() {
		return "InsuredBean [insuredName=" + insuredName + ", insuredStreet=" + insuredStreet + ", insuredCity="
				+ insuredCity + ", insuredState=" + insuredState + ", insuredZip=" + insuredZip + ", businessSegment="
				+ businessSegment + ", accountNumber=" + accountNumber + ", userName=" + userName + "]";
	}
	
	}
	
	
	


