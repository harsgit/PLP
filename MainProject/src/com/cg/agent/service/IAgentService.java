package com.cg.agent.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.agent.bean.InsuredBean;
import com.cg.agent.bean.PolicyQuestionBean;
import com.cg.agent.exception.InsuredException;

public interface IAgentService {
	public String insertInsuredDetails(InsuredBean insuredBean) throws ClassNotFoundException, IOException, SQLException;
	public PolicyQuestionBean getPolicyQuestions(String BusinessSegment) throws ClassNotFoundException, SQLException, IOException;
	public List<InsuredBean> retriveAll(int agentId) throws ClassNotFoundException, InsuredException, IOException, SQLException;
	


}
