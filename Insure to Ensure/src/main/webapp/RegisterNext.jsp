<%@ page import = "java.io.*,java.util.*,java.text.SimpleDateFormat" %>
<%@ page import= "com.dbms.project.InsertValNext" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
		<%
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			String address=request.getParameter("address");
			Date dob=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
			String gender=request.getParameter("gender");
			String email=request.getParameter("email");
			int age=Integer.parseInt(request.getParameter("age"));
			String phone=request.getParameter("phone");
			String pan_no=request.getParameter("pan_no");
			String aadhar_no=request.getParameter("aadhar_no");
			
			
			InsertValNext.insert(firstname,lastname,address,dob,age,gender,email,phone,pan_no,aadhar_no);
		%>
</body>
</html>