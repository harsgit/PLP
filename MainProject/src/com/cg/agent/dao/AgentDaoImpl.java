package com.cg.agent.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.cg.agent.bean.InsuredBean;
import com.cg.agent.bean.PolicyQuestionBean;
import com.cg.agent.exception.InsuredException;
import com.cg.agent.util.DBConnection;

public class AgentDaoImpl implements IAgentDao{

	@Override
	public String insertInsuredDetails(InsuredBean insuredBean) throws ClassNotFoundException, IOException, SQLException {
	Connection con=DBConnection.getConnection();
	PreparedStatement pst=null;
    String returnS="Succesfully inserted";
	
	

	try {
	
	 pst=con.prepareStatement("insert into account values(?,?,?,?,?,?,?,?,0)");
	 pst.setLong(1,insuredBean.getAccountNumber());
	 pst.setString(2,insuredBean.getInsuredName());
	 pst.setString(3,insuredBean.getInsuredStreet());
	 pst.setString(4,insuredBean.getInsuredCity());
	 pst.setString(5,insuredBean.getInsuredState());
	 pst.setInt(6,insuredBean.getInsuredZip());
	 pst.setString(7,insuredBean.getBusinessSegment());
	// if(insuredBean.getBusinessSegment()=="BusinessAuto")
	//return 1;
	 
	 //questions
	 //questions
	 //questions
	 //questions
	 pst.setString(8,insuredBean.getUserName());
	// pst.setInt(9,bean.getAgentId());
    pst.executeUpdate();

	}catch(SQLException sql)
	{
		System.out.println(sql);
	}
	
		return insuredBean.getBusinessSegment();
	

	}

	@Override
	public PolicyQuestionBean getPolicyQuestions(String BusinessSegment) throws SQLException, ClassNotFoundException, IOException {
		PolicyQuestionBean policyQuestionBean = null;
		Connection connection = DBConnection.getConnection();
		

		ResultSet resultset = null;
		//Statement st = connection.createStatement();
		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement("select pol_ques_id,Bus_Seg_Id,Pol_Ques_Desc,Pol_Ques_Ans1,Pol_Ques_Ans2,Pol_Ques_Ans3 from policyQuestion where bus_seg_id=?");
		preparedStatement.setString(1, BusinessSegment);
		resultset=preparedStatement.executeQuery();
		
		while (resultset.next()) {
			policyQuestionBean = new PolicyQuestionBean();
		
			policyQuestionBean.setQuesId(resultset.getString(1));
			
			policyQuestionBean.setBusSeqId(resultset.getString(2));
			policyQuestionBean.setPolQuesDesc(resultset.getString(3));
			
			policyQuestionBean.setPolQuesAns1(resultset.getString(4));
			
			
			policyQuestionBean.setPolQuesAns2(resultset.getString(5));
			policyQuestionBean.setPolQuesAns3(resultset.getString(6));
			
			return policyQuestionBean;
		
		}
	/*	if(enquiryBean  != null)
		{
			//logger.info("Record Found Successfully");
			return enquiryBean;
		}
		else
		{
			//logger.info("Record not Found");
			return null;
		}*/
		
		
		

// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<InsuredBean> retriveAll(int agentId) throws InsuredException, ClassNotFoundException, IOException, SQLException {
		Connection con=DBConnection.getConnection();
		
		
		PreparedStatement ps=null;
		ResultSet resultset = null;
		//InsuredBean bean=null;
		int count=0;
		
		List<InsuredBean> insuredList=new ArrayList<InsuredBean>();
		try
		{
			ps=con.prepareStatement(" select * from account a   inner join policy p  on a.accountnumber=p.accountnumber where a.agentId=?");
			//ps=con.prepareStatement("select * from account a ,policy p where agentId=? ");
			ps.setInt(1, agentId);
			resultset=ps.executeQuery();
			System.out.println("outside");
			//System.out.println(resultset.next());
		while(resultset.next())
		{
		
		
			InsuredBean bean=new InsuredBean();
				bean.setInsuredName(resultset.getString(2));
				bean.setInsuredStreet(resultset.getString(3));
				bean.setInsuredCity(resultset.getString(4));
				
				bean.setInsuredState(resultset.getString(5));
				bean.setInsuredZip(resultset.getInt(6));
				bean.setBusinessSegment(resultset.getString(7));
				bean.setAccountNumber(resultset.getLong(1));
				bean.setUserName(resultset.getString(8));
		        bean.setPolicyNumber(resultset.getInt(10));
		        bean.setPolicyPremium(resultset.getString(11));
	
				
				insuredList.add(bean);
				System.out.println("In loop");
				count++;
		}		
			
		} catch (SQLException sqlException) {
			//logger.error(sqlException.getMessage());
			throw new InsuredException("Tehnical problem occured. Refer log");
		}
		
		finally
		{
			try 
			{
				resultset.close();
				ps.close();
				con.close();
			} 
			catch (SQLException e) 
			{
				//logger.error(e.getMessage());
				throw new InsuredException("Error in closing db connection");

			}
		}
		
		if( count == 0)
			return null;
		else
			return insuredList;
	}
}

		
	



