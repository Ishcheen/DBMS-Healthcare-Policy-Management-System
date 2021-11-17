package com.dbms.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationContext;

import com.dbms.project.PostgreSqlJDBC;
import com.dbms.project.Policy;
import com.dbms.project.*;

//import com.dbms.project.User;

/**
 * Servlet implementation class ExtractPolicy
 */
@WebServlet("/ExtractPolicy")
public class ExtractPolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExtractPolicy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		Date dob = null;
		try {
			dob = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		String pan_no=request.getParameter("pan_no");
		String aadhar_no=request.getParameter("aadhar_no");
		String key=request.getParameter("key");
		PolicyHolder user = (PolicyHolder)request.getServletContext().getAttribute("user");
		insert(firstname,lastname,address,dob,age,gender,email,phone,pan_no,aadhar_no,user.getPolicyHolderId());
		
    	//RequestDispatcher req = request.getRequestDispatcher("RegisterNext.jsp");
		   
		ArrayList<Policy> policyOutput=searchPolicy(key);
	    request.setAttribute("policyData", policyOutput);
	    ArrayList<Agent> agentOutput=searchAgent(key);
	    request.setAttribute("agentData", agentOutput);
	    ArrayList<Claimant> claimantOutput=searchClaimant(user.getPolicyHolderId());
	    request.setAttribute("claimantData", claimantOutput);
	    request.setAttribute("name",user.getFirstname());
	    
		RequestDispatcher req = request.getRequestDispatcher("user-dashboard.jsp");
		req.forward(request, response);      
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public static ArrayList<Policy> searchPolicy(String value) {
		PostgreSqlJDBC obj_connection=new PostgreSqlJDBC();
		Connection connection=obj_connection.connect();
		PreparedStatement p= null;
		ResultSet rs=null;
		ArrayList<Policy> list = new ArrayList<Policy>();
		try {
			
			String sql="select * from policy where policy_id= '"+value.substring(0, 3)+"'";
			p=connection.prepareStatement(sql);
			rs=p.executeQuery();
			while(rs.next()) {
                
				Policy temp=new Policy();
                temp.setPolicyId(rs.getInt("policy_id"));
                temp.setPolicyname(rs.getString("policy_name"));
                temp.setTenure(rs.getString("tenure"));
                temp.setPremiumAmt(rs.getInt("premium_amount"));
                list.add(temp);
               
            }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public static ArrayList<Claimant> searchClaimant(int value) {
		PostgreSqlJDBC obj_connection=new PostgreSqlJDBC();
		Connection connection=obj_connection.connect();
		PreparedStatement p= null;
		ResultSet rs=null;
		ArrayList<Claimant> list = new ArrayList<Claimant>();
		try {
			
			String sql="select * from claimant where policyholder_id= '"+value+"'";
			p=connection.prepareStatement(sql);
			rs=p.executeQuery();
			while(rs.next()) {
                
				Claimant temp=new Claimant();
                temp.setClaimantId(rs.getInt("claimant_id"));
                temp.setFirstname(rs.getString("firstname"));
                temp.setLastname(rs.getString("lastname"));
                temp.setPhoneNo(rs.getString("phone_no"));
                temp.setEmail(rs.getString("email"));
                temp.setAddress(rs.getString("address"));
                list.add(temp);
               
            }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public static ArrayList<Agent> searchAgent(String value) {
		PostgreSqlJDBC obj_connection=new PostgreSqlJDBC();
		Connection connection=obj_connection.connect();
		PreparedStatement p= null;
		ResultSet rs=null;
		ArrayList<Agent> list = new ArrayList<Agent>();
		try {
			
			String sql="select * from agent where agent_id= '"+value.substring(3, 6)+"'";
			p=connection.prepareStatement(sql);
			rs=p.executeQuery();
			while(rs.next()) {
                
				Agent temp=new Agent();
                temp.setAgentId(rs.getInt("agent_id"));
                temp.setFirstname(rs.getString("firstname"));
                temp.setLastname(rs.getString("lastname"));
                temp.setPhoneNo(rs.getString("phone_no"));
                temp.setEmail(rs.getString("email"));
                list.add(temp);
               
            }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public static void insert(String firstname, String lastname, String address,Date dob,int age, String gender, String email, String phone, String pan_no, String aadhar_no,int policyholder_id) {
		PostgreSqlJDBC obj_connection=new PostgreSqlJDBC();
		Connection connection=obj_connection.connect();
		PreparedStatement statement= null;
		try {
			
			String query="insert into claimant(firstname,lastname,address,dob,age, gender, email, phone_no,pan_no,aadhar_no,policyholder_id) values(?,?,?,?,?,?,?,?,?,?,?)";
			statement=connection.prepareStatement(query);
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
			statement.setInt(11, policyholder_id);
	
			int j= statement.executeUpdate();
			System.out.println(j);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
