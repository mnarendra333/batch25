<%@page import="com.pragim.SrpingMVCCrudOperations.model.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  

<!-- jstl to provides the conditions loops in the form tags -->
<center><font size="30">Employee Mgt System</font></center>
<br>
<br>
<br>
<table class="table table-hover">
<c:forEach var="emp" items="${empList}">
		<tr>
			<td><input type="checkbox" name="" value=""></input></td>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.sal}</td>
			<td>${emp.addr}</td>
			<td><a href="deleteemp/${emp.id}" class="glyphicon glyphicon-trash"></a></td>
			<td><a href="editempform/${emp.id}" class="glyphicon glyphicon-edit"></a></td>
		
		</tr>
		
			
</c:forEach>


</table>

<br><br>
<a href="addempform" class="btn btn-primary">AddEmployee</a>