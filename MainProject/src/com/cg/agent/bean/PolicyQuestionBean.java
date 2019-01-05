package com.cg.agent.bean;

public class PolicyQuestionBean {
String quesId;
int polQuesSeq;
String busSeqId;
String polQuesDesc;
String polQuesAns1;
int polQuesAns1Weight;
String polQuesAns2;
int polQuesAns2Weight;
String polQuesAns3;
int polQuesAns3Weight;
public String getQuesId() {
	return quesId;
}
public void setQuesId(String quesId) {
	this.quesId = quesId;
}
public int getPolQuesSeq() {
	return polQuesSeq;
}
public void setPolQuesSeq(int polQuesSeq) {
	this.polQuesSeq = polQuesSeq;
}
public String getBusSeqId() {
	return busSeqId;
}
public void setBusSeqId(String busSeqId) {
	this.busSeqId = busSeqId;
}
public String getPolQuesDesc() {
	return polQuesDesc;
}
public void setPolQuesDesc(String polQuesDesc) {
	this.polQuesDesc = polQuesDesc;
}
public String getPolQuesAns1() {
	return polQuesAns1;
}
public void setPolQuesAns1(String polQuesAns1) {
	this.polQuesAns1 = polQuesAns1;
}
public int getPolQuesAns1Weight() {
	return polQuesAns1Weight;
}
public void setPolQuesAns1Weight(int polQuesAns1Weight) {
	this.polQuesAns1Weight = polQuesAns1Weight;
}
public String getPolQuesAns2() {
	return polQuesAns2;
}
public void setPolQuesAns2(String polQuesAns2) {
	this.polQuesAns2 = polQuesAns2;
}
public int getPolQuesAns2Weight() {
	return polQuesAns2Weight;
}
public void setPolQuesAns2Weight(int polQuesAns2Weight) {
	this.polQuesAns2Weight = polQuesAns2Weight;
}
public String getPolQuesAns3() {
	return polQuesAns3;
}
public void setPolQuesAns3(String polQuesAns3) {
	this.polQuesAns3 = polQuesAns3;
}
public int getPolQuesAns3Weight() {
	return polQuesAns3Weight;
}
public void setPolQuesAns3Weight(int polQuesAns3Weight) {
	this.polQuesAns3Weight = polQuesAns3Weight;
}
@Override
public String toString() {
	return "PolicyQuestionBean [quesId=" + quesId + ", polQuesDesc=" + polQuesDesc + ", polQuesAns1=" + polQuesAns1
			+ ", polQuesAns2=" + polQuesAns2 + ", polQuesAns3=" + polQuesAns3 + "]";
}

}
