package com.cg.agent.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.agent.bean.InsuredBean;
import com.cg.agent.bean.PolicyQuestionBean;
import com.cg.agent.exception.InsuredException;

public interface IAgentDao {
	
	public String insertInsuredDetails(InsuredBean insuredBean) throws ClassNotFoundException, IOException, SQLException;
	public PolicyQuestionBean getPolicyQuestions(String BusinessSegment) throws SQLException, ClassNotFoundException, IOException;
	public List<InsuredBean> retriveAll(int agentId) throws InsuredException, ClassNotFoundException, IOException, SQLException;
}
