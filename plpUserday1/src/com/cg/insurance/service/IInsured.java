package com.cg.insurance.service;

import java.util.List;

import com.cg.insurance.bean.Insured;
import com.cg.insurance.bean.PolicyBean;
import com.cg.insurance.bean.PolicyDetailsBean;

public interface IInsured {
	
	public List<PolicyDetailsBean> viewMyPolicies(String userName) throws Exception;
	public List<PolicyBean> viewAllPolicies() throws Exception;
	public String  newPolicy(Insured insured) throws Exception;

}
