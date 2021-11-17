<%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page import = "java.io.*,java.util.*,java.text.SimpleDateFormat" %>
<%@ page import= "com.dbms.project.*" %>



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
			ServletContext context=getServletContext();  
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
			String password=request.getParameter("password");
			String confirmPassword=request.getParameter("confirm-password");
			
			
			PolicyHolder user=Insert_Values.insert(firstname,lastname,address,dob,age,gender,email,phone,pan_no,aadhar_no,password,confirmPassword);
			context.setAttribute("user", user);
		%>
		<jsp:forward page="Registration-next.html" /> 

</body>
</html>