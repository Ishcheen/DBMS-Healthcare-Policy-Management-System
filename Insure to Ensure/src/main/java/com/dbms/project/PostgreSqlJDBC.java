package com.dbms.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlJDBC {
	 private  String url = "jdbc:postgresql://localhost:5432/dbms";
	 private  String user = "postgres";
	 private  String password = "Ishita@99";
	 public Connection connect() {
		Connection connection=null;
		 try{
			 connection= DriverManager.getConnection(url, user, password);
			 if(connection!=null) {
				 System.out.println("Opened database successfully");
			 }
			 else {
				 System.out.println("Failed to connect to database");
			 }
		 }catch (SQLException e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
		return connection;
	 }

	public static void main(String[] args) {
		PostgreSqlJDBC sqlConnect=new PostgreSqlJDBC();
		sqlConnect.connect();
	      
	}
}
