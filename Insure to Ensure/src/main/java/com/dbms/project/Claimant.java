package com.dbms.project;

public class Claimant {
	private String firstname;
	private String lastname,phone_no,email,address;
	private int claimant_id;
	public int getClaimantId() {  
		return claimant_id;  
	}  
	public void setClaimantId(int id) {  
		 this.claimant_id=id;
	}  
	public String getClaimantName() {  
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
	public String getAddress() {  
		return address;  
	}  
	public void setAddress(String address) {  
		this.address = address;  
	}  
	
}
