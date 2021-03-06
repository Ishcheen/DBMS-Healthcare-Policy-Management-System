<%@ page import="java.sql.*,java.io.*,java.util.*" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles.css" />
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Agent Dashboard - DBMS - Group 11</title>
	
</head>
<body>
	<div class="main-container">
		<aside class="sidebar">
			<div class="sidebar-header">
				<!-- <a href="agent-dashboard.html"><h4>insure to ensure - DBMS project</h4></a> -->
				<img src="logo.svg" alt="logo" class="logo">
			</div>
			<ul class="policy-tabs">
				<h2>Policies</h2>
				<div class="policy-btn">
					<li>
						<button class="policy-tabs-btn" id="tab-btn"><i class="fas fa-shield-alt" style="color: rgb(66, 192, 241); padding-right: 0.75rem;"></i> diabetes safe</button>
					</li>
					<li>
						<button class="policy-tabs-btn" id="tab-btn"><i class="fas fa-shield-alt" style="color: rgb(66, 192, 241); padding-right: 0.75rem;"></i> super surplus top-up</button>
					</li>
					<li>
						<button class="policy-tabs-btn" id="tab-btn"><i class="fas fa-shield-alt" style="color: rgb(66, 192, 241); padding-right: 0.75rem;"></i> cardiac care platinum</button>
					</li>
					<li>
						<button class="policy-tabs-btn" id="tab-btn"><i class="fas fa-shield-alt" style="color: rgb(66, 192, 241); padding-right: 0.75rem;"></i> star comprehensive</button>
					</li>
					<li>
						<button class="policy-tabs-btn" id="tab-btn"><i class="fas fa-shield-alt" style="color: rgb(66, 192, 241); padding-right: 0.75rem;"></i> senior citizen red carpet</button>
					</li>
				</div>
			</ul>
			<ul class="policy-tabs aside-footer">
				<li>
					<button class="policy-tabs-btn" id="my-clients"><i class="fas fa-users" style="color: rgb(66, 192, 241); padding-right: 0.5rem;"></i> My Clients</button>
				</li>
				<li>
					<button class="policy-tabs-btn"><i class="fas fa-sign-out-alt" style="color: rgb(66, 192, 241); padding-right: 0.5rem;"></i> Sign Out</button>
				</li>
			</ul>
    	</aside>
		<div class="right-content" id="policy-data">
			<main>
				<h1 class="typewrite" data-period="2000" data-type='[ "Welcome Agent!" ]'><span class="wrap"></span></h1>
				<script src="typewrite.js"></script>
			</main>
		</div>
	</div>
	<script src="policy-tabs.js"></script>
	<script type="text/javascript">
	 var myClients=document.getElementById("my-clients");
	 myClients.addEventListener("click",function(){
		content.innerHTML=`<h2 style="text-align: center;">My Clients</h2>
		<div class="divider" style="width: 10%; margin-bottom: 2rem;"></div>
		<div class="table-wrapper">
			<table>
				<tr>
					<th>S.no.</th>
					<th>Ref. Code</th>
					<th>Policy ID</th>
					<th>Name</th>
					<th>Agent Name</th>
				</tr>
				<tr>
					<td>1</td>
					<td>123456</td>
					<td>2</td>
					<td>Harsh Parwal</td>
					<td>Ishita Jain</td>
				</tr>
				<tr>
					<td>2</td>
					<td>654321</td>
					<td>4</td>
					<td>Vibhore Jain</td>
					<td>Shaily Bhaiya</td>
				</tr>
			</table>
		</div>`;
	}
	</script>
</body>
</html>