<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">


.labelCSS{
	text-align: center;
	font-size: 14px;
}
</style>




</head>
<body>
	<%!
		int x = 10;
		int y=20;
	%>

	Username : <input type="text" name="uname" class="labelCSS"><br> 


	<span><%=x+y %></span><br>

	<%
	
		for(int i=1;i<=10;i++)
		{
			out.println(i);
		}
	
	
	
	%><br>
	Password : <input type="password" name="pwd"> 

</body>
</html>