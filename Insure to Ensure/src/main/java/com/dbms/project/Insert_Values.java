package com.dbms.project;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.dbms.project.PostgreSqlJDBC;

public class Insert_Values {
	public static PolicyHolder insert(String firstname, String lastname, String address,Date dob,int age, String gender, String email, String phone, String pan_no, String aadhar_no,String password,String confirmPassword) {
		PostgreSqlJDBC obj_connection=new PostgreSqlJDBC();
		Connection connection=obj_connection.connect();
		PreparedStatement statement= null;
		try {
			
			String query="insert into policyholder(firstname,lastname,address,dob,age, gender, email, phone_no,pan_no,aadhar_no,password,confirm) values(?,?,?,?,?,?,?,?,?,?,?,?) returning policyholder_id";
			statement=connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, firstname);
			statement.setString(2, lastname);
			statement.setString(3, address);
			statement.setDate(4, new java.sql.Date(dob.getTime()));
			statement.setInt(5, age);
			statement.setString(6, gender);
			statement.setString(7, email);
			statement.setString(8, phone);
			statement.setString(9, pan_no);
			statement.setString(10, aadhar_no);
			statement.setString(11, password);
			statement.setString(12, confirmPassword);
	
			int j= statement.executeUpdate();
			PolicyHolder user=new PolicyHolder();
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()){
			  int primaryKey = rs.getInt(1);
			  user.setPolicyHolderId(primaryKey);
			  user.setFirstname(firstname);
			}
			System.out.println(j);
			return user;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
