<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="java.util.List,java.util.ArrayList,com.pragim.employeemgtsystem.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript">

function myFunction() {
	  var popup = document.getElementById("myPopup");
	  popup.classList.toggle("show");
	}

</script>

<style type="text/css">
<
meta name ="viewport " content ="width =device-width, initial-scale =1 ">
	<style> /* Popup container - can be anything you want */ .popup {
	position: relative;
	display: inline-block;
	cursor: pointer;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

/* The actual popup */
.popup .popuptext {
	visibility: hidden;
	width: 160px;
	background-color: #555;
	color: #fff;
	text-align: center;
	border-radius: 6px;
	padding: 8px 0;
	position: absolute;
	z-index: 1;
	bottom: 125%;
	left: 50%;
	margin-left: -80px;
}

/* Popup arrow */
.popup .popuptext::after {
	content: "";
	position: absolute;
	top: 100%;
	left: 50%;
	margin-left: -5px;
	border-width: 5px;
	border-style: solid;
	border-color: #555 transparent transparent transparent;
}

/* Toggle this class - hide and show the popup */
.popup .show {
	visibility: visible;
	-webkit-animation: fadeIn 1s;
	animation: fadeIn 1s;
}

/* Add animation (fade in the popup) */
@
-webkit-keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}

}
@
keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}
}
</style>

</style>
</head>
<body>

	<!-- scriptlet for writing java code 
..we need collect the employee data which is present inside the request object -->
	<table class="table table-hover">
		<%
	String msg = (String)request.getAttribute("displayMsg");
		
if(msg!=null){		
%>
		
	<span class="popuptext" id="myPopup"><%=msg %></span>
		
		<%} %>
		<% 
List<Employee> list = (ArrayList<Employee>)request.getAttribute("empList");

if(list!=null && list.size()>0)
{
for(Employee emp : list)
{
%>
		<tr>
			<td><input type="checkbox" name="eid" value=<%=emp.getId() %>></td>
			<td><%=emp.getId() %></td>
			<td><%=emp.getName() %></td>
			<td><%=emp.getDept() %></td>
			<td><%=emp.getSal() %></td>
			<td><%=emp.getDesignation() %></td>
			<td><%=emp.getHiredate() %></td>
			<td><a href="getAllEmp?empid=<%=emp.getId()%>&buttonName=edit"
				onclick="myFunction()" class="glyphicon glyphicon-edit"></a></td>
			<td><a href="getAllEmp?empid=<%=emp.getId()%>&buttonName=delete"
				onclick="myFunction()" class="glyphicon glyphicon-trash"></a></td>
		</tr>
		<%}} %>
	</table>
	<a href="addEmployee.jsp" class="btn btn-primary">AddEmployee</a>
</body>
</html>