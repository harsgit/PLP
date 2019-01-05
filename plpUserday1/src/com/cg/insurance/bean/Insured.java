package com.cg.insurance.bean;

public class Insured {
	
	private String InsuredName;
	private String InsuredStreet;
	private String InsuredCity;
	private String InsuredState;
	private int InsuredZip;
	private String BusinessSegment;
	private double AccountNumber;
	private int AgentId;
	
	
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public String getInsuredStreet() {
		return InsuredStreet;
	}
	public void setInsuredStreet(String insuredStreet) {
		InsuredStreet = insuredStreet;
	}
	public String getInsuredCity() {
		return InsuredCity;
	}
	public void setInsuredCity(String insuredCity) {
		InsuredCity = insuredCity;
	}
	public String getInsuredState() {
		return InsuredState;
	}
	public void setInsuredState(String insuredState) {
		InsuredState = insuredState;
	}
	public int getInsuredZip() {
		return InsuredZip;
	}
	public void setInsuredZip(int insuredZip) {
		InsuredZip = insuredZip;
	}
	public String getBusinessSegment() {
		return BusinessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		BusinessSegment = businessSegment;
	}
	public double getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	
	@Override
	public String toString() {
		return "Insured [InsuredName=" + InsuredName + ", InsuredStreet=" + InsuredStreet + ", InsuredCity="
				+ InsuredCity + ", InsuredState=" + InsuredState + ", InsuredZip=" + InsuredZip + ", BusinessSegment="
				+ BusinessSegment + ", AccountNumber=" + AccountNumber + ", AgentId=" + AgentId + "]";
	}
}
