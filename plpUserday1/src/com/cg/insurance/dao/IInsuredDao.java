package com.cg.insurance.dao;

import java.util.List;

import com.cg.insurance.bean.Insured;
import com.cg.insurance.bean.PolicyBean;
import com.cg.insurance.bean.PolicyDetailsBean;

public interface IInsuredDao {

	public List<PolicyDetailsBean> viewMyPolicies(String userName) throws Exception;
	public List<PolicyBean> viewAllPolicies() throws Exception;
	public String  newPolicy(Insured insured) throws Exception;

}
