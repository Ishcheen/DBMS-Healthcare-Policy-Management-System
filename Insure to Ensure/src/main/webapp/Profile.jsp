<%@ page import="java.sql.*,java.io.*,java.util.*" %>
<%@ page import= "com.dbms.project.*" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles.css" />
<HTML>
		
       <HEAD>
       <TITLE>Select Data From a Database</TITLE>
       </HEAD>
       <BODY>
       		<% String username = request.getParameter("firstname"); %>
			<h1>Welcome   <% out.println(username); %></h1>
			<table class="table">
         		<tr bgcolor="00FF7F">
          		<th><b>Policy Name</b></th>
          		<th><b>Premium Amount</b></th>
          		<th><b>Tenure</b></th>
         		</tr> 
				<% 	ArrayList<Policy> list = (ArrayList<Policy>)request.getAttribute("policyData");
					if(list!=null)
					{
	        			for(Policy u:list){
        		%>  
        	 	<tr>
                <td style="color:#fff;"><%=u.getPolicyName()%></td>
                <td><%=u.getPremiumAmt()%></td>
                <td><%=u.getTenure()%></td>
   
            </tr>
            <%}
            	}%>
           </TABLE>
           
           <table class="table">
         		<tr bgcolor="00FF7F">
          		<th><b>Agent Name</b></th>
          		<th><b>Contact No.</b></th>
          		<th><b>Email Id</b></th>
         		</tr> 
				<% 	ArrayList<Agent> list1 = (ArrayList<Agent>)request.getAttribute("agentData");
					if(list1!=null)
					{
	        			for(Agent u:list1){
        		%>  
        	 	<tr>
                <td style="color:#fff;"><%=u.getAgentName()%></td>
                <td><%=u.getPhoneNo()%></td>
                <td><%=u.getEmail()%></td>
   
            </tr>
            <%}
            	}%>
           </TABLE>
         </BODY>
</HTML>