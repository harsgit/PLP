package com.cg.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cg.insurance.bean.Insured;
import com.cg.insurance.bean.PolicyBean;
import com.cg.insurance.bean.PolicyDetailsBean;
import com.cg.insurance.util.DBConnection;

public class InsuredDaoImpl implements IInsuredDao {
	
	@Override
	public List<PolicyBean> viewAllPolicies() throws Exception {
		
		Connection con = DBConnection.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = con.prepareStatement("select * from policy");
			resultSet = preparedStatement.executeQuery();
			List<PolicyBean> list = new ArrayList<>();
			while(resultSet.next()) {
				PolicyBean policyBean = new PolicyBean();
				policyBean.setPolicyNumber(resultSet.getLong(1));
				policyBean.setPolicyPremium(resultSet.getInt(2));
				policyBean.setAccountNumber(resultSet.getDouble(3));
				list.add(policyBean);
			}
			return list;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			
		}
		
		return null;
	}


	@Override
	public List<PolicyDetailsBean> viewMyPolicies(String userName) throws Exception {
		
		Connection con1=DBConnection.getConnection();
		PreparedStatement preparedStatement1=null;
		ResultSet resultSet1=null;
		try {
			preparedStatement1=con1.prepareStatement("select * from policyDetails");
			resultSet1=preparedStatement1.executeQuery();
			List<PolicyDetailsBean> list1 = new ArrayList<>();
			
			while(resultSet1.next()) {
				PolicyDetailsBean policyDetailsBean=new PolicyDetailsBean();
				policyDetailsBean.setPolicyNumber(resultSet1.getLong(1));
				policyDetailsBean.setQuestionId(resultSet1.getString(2));
				policyDetailsBean.setAnswer(resultSet1.getString(3));
				list1.add(policyDetailsBean);
				
			}
			return list1;
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
		return null;
	}

	
	@Override
	public String newPolicy(Insured insured) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
