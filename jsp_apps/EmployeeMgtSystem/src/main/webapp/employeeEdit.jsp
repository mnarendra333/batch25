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
</head>
<body>


<%
Employee emp = (Employee)request.getAttribute("employeeObj");

%>

<form class="form-horizontal" action="getAllEmp">
	<input type="hidden" name="empid" value = <%=emp.getId()%>>
  <div class="form-group">
    <label class="control-label col-md-2" for="empname">Employee Name:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="empname" value = <%=emp.getName() %> placeholder="Enter Employee Name">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-md-2" for="pwd">Department:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="dept" value = <%=emp.getDept() %> placeholder="Enter Department">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-md-2" for="pwd">Salary:</label>
    <div class="col-md-10">
      <input type="number" class="form-control" name="sal" value = <%=emp.getSal() %> placeholder="Enter Salary">
    </div>
  </div>
   
   <div class="form-group">
    <label class="control-label col-md-2" for="designation">Designation:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="designation" value = <%=emp.getDesignation() %> placeholder="Enter Designation">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-md-2" for="pwd">HireDate:</label>
    <div class="col-md-10">
      <input type="date" class="form-control" name="hirdate" value = <%=emp.getHiredate() %> placeholder="Enter Hirdate">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-md-offset-2 col-md-10">
      <button type="submit" class="btn btn-default" name="buttonName" value="update">Update</button>
    </div>
  </div>
</form>
	

</body>
</html>

</body>
</html>