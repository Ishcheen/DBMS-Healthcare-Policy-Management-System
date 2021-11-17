package com.dbms.project;

public class Agent {
	private String firstname;
	private String lastname,phone_no,email;
	private int agent_id;
	public int getAgentId() {  
		return agent_id;  
	}  
	public void setAgentId(int id) {  
		 this.agent_id=id;
	}  
	public String getAgentName() {  
		return firstname+" "+lastname;  
	}  
	public void setFirstname(String firstname) {  
		this.firstname = firstname;  
	}  
	public void setLastname(String lastname) {  
		this.lastname = lastname;  
	}  
	public String getPhoneNo() {  
		return phone_no;  
	}  
	public void setPhoneNo(String phone_no) {  
		this.phone_no = phone_no;  
	}  
	
	public String getEmail() {  
		return email;  
	}  
	public void setEmail(String email) {  
		this.email = email;  
	}  
	
	
}
