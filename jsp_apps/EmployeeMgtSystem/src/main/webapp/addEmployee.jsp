<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<form class="form-horizontal" action="getAllEmp">
  <div class="form-group">
    <label class="control-label col-md-2" for="empname">Employee Name:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="empname" placeholder="Enter Employee Name">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-md-2" for="pwd">Department:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="dept" placeholder="Enter Department">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-md-2" for="pwd">Salary:</label>
    <div class="col-md-10">
      <input type="number" class="form-control" name="sal" placeholder="Enter Salary">
    </div>
  </div>
   
   <div class="form-group">
    <label class="control-label col-md-2" for="designation">Designation:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" name="designation" placeholder="Enter Designation">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-md-2" for="pwd">HireDate:</label>
    <div class="col-md-10">
      <input type="date" class="form-control" name="hirdate" placeholder="Enter Hirdate">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-md-offset-2 col-md-10">
      <button type="submit" class="btn btn-default" name="buttonName" value="add">Submit</button>
    </div>
  </div>
</form>
	

</body>
</html>