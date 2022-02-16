<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	int x = 10;
	int y=30;

%>

<!-- scriptlet -->
<%
	Date date = new Date();
	out.println("Todays date : "+date);
%>

<!-- expression -->
<h2 style="">Todays date :</h2><%=date %>
<h2 style="">sum :</h2><%=x+y %>




</body>
</html>