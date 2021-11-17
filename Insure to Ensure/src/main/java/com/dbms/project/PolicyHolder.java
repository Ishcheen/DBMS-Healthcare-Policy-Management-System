package com.dbms.project;

public class PolicyHolder {
	private String firstname;
	private String lastname;
	private String address,phone_no;
	private int policyholder_id;
	public int getPolicyHolderId() {  
		return policyholder_id;  
	}  
	public void setPolicyHolderId(int id) {  
		 this.policyholder_id=id;
	}  
	public String getFirstname() {  
		return firstname;  
	}  
	public void setFirstname(String firstname) {  
		this.firstname = firstname;  
	}  
	public String getLastname() {  
		return lastname;  
	}  
	public void setLastname(String lastname) {  
		this.lastname = lastname;  
	}  
	public String getAddress() {  
		return address;  
	}  
	public void setAddress(String address) {  
		this.address = address;  
	}  
	public String getPhone() {  
		return phone_no;  
	}  
	public void setPhone(String phone) {  
		this.phone_no = phone;  
	}  		  
}
