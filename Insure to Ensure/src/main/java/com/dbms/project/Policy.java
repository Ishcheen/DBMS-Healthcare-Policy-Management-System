package com.dbms.project;

public class Policy {
	private String policy_name;
	private String tenure;
	private int policy_id,premium_amount;
	public int getPolicyId() {  
		return policy_id;  
	}  
	public void setPolicyId(int id) {  
		 this.policy_id=id;
	}  
	public String getPolicyName() {  
		return policy_name;  
	}  
	public void setPolicyname(String policy_name) {  
		this.policy_name = policy_name;  
	}  
	public String getTenure() {  
		return tenure;  
	}  
	public void setTenure(String tenure) {  
		this.tenure = tenure;  
	}  
	
	public int getPremiumAmt() {  
		return premium_amount;  
	}  
	public void setPremiumAmt(int premium_amount) {  
		this.premium_amount = premium_amount;  
	}  
	
	
}
