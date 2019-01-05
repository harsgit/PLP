package com.cg.insurance.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.insurance.bean.Insured;
import com.cg.insurance.bean.PolicyBean;
import com.cg.insurance.bean.PolicyDetailsBean;
import com.cg.insurance.dao.IInsuredDao;
import com.cg.insurance.dao.InsuredDaoImpl;

public class IInsuredImpl implements IInsured{

	IInsuredDao iInsuredDao = null;
	
	@Override
	public List<PolicyBean> viewAllPolicies() throws Exception {
		iInsuredDao = new InsuredDaoImpl();
		List<PolicyBean> list = new ArrayList<>();
		list = iInsuredDao.viewAllPolicies();
		return list;
	}
	
	@Override
	public List<PolicyDetailsBean> viewMyPolicies(String userName) throws Exception {
		iInsuredDao=new InsuredDaoImpl();
		List<PolicyDetailsBean> list1=new ArrayList<>();
		list1=iInsuredDao.viewMyPolicies(userName);
		return list1;
	}

	@Override
	public String newPolicy(Insured insured) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
