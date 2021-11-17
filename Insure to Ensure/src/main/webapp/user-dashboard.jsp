<%@ page import="java.sql.*,java.io.*,java.util.*" %>
<%@ page import= "com.dbms.project.*" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles.css" />
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>User Dashboard - DBMS - Group 11</title>
	<link rel="stylesheet" href="styles.css">
</head>
<body>
	<nav style="height: auto; position: fixed; top: 0; left: 0; width: 100%;">
		<div class="nav-center" style="max-width: 800px;">
			<a href="index.html"><h4>insure to ensure - DBMS project</h4></a>
			<ul class="nav-links" style="align-items: center;">
				<li style="margin-right: 0.75rem;">
					<a href="#"><i class="fas fa-user" style="padding-right: 0.5rem; color: rgb(66, 192, 241);"></i><%= request.getAttribute("name") %>></a>
				</li>
				<li>
                    <button class="btn btn-hero-nav" id="btn"><i class="fas fa-sign-out-alt" style="color: rgb(66, 192, 241); padding-right: 0.5rem;"></i> Sign Out</button>
				</li>
			</ul>
		</div>
	</nav>
	<main>
		<div class="card-container">
		    <% ArrayList<Policy> list = (ArrayList<Policy>)request.getAttribute("policyData");
					if(list!=null)
					{
	        			for(Policy u:list){
        	%>  
            <div class="card">
                <p><span>Policy Name :</span> <%=u.getPolicyName()%></p>
                <p><span>Premium Amount :</span><%=u.getPremiumAmt()%> PA</p>
                <p><span>Tenure :</span><%=u.getTenure()%></p>
            </div>
            <%}
            	}%>
            <% 	ArrayList<Claimant> list1 = (ArrayList<Claimant>)request.getAttribute("claimantData");
				if(list1!=null)
				{
	       			for(Claimant u:list1){
        	%>  
            <div class="card">
                <p><span>Claimant Name :</span><%=u.getClaimantName()%></p>
                <p><span>Claimant Contact No. :</span><%=u.getPhoneNo()%></p>
                <p><span>Claimant Email :</span><%=u.getEmail()%></p>
                <p><span>Claimant Address :</span><%=u.getAddress()%></p>
            </div>
            <%}
            	}%>
            <% 	ArrayList<Agent> list2 = (ArrayList<Agent>)request.getAttribute("agentData");
					if(list1!=null)
					{
	        			for(Agent u:list2){
        		%>  
            <div class="card">
                <p><span>Agent Name :</span><%=u.getAgentName()%></p>
                <p><span>Agent Contact No. :</span><%=u.getPhoneNo()%></p>
                <p><span>Agent Email :</span><%=u.getEmail()%></p>
            </div>
            <%}
            	}%>
		</div>
	</main>
</body>
</html>