<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>You have registered with following Info::</h3>
FirstName:<%= session.getAttribute("firstName") %><br/>
LastName:<%= session.getAttribute("lastName") %><br/>
</body>
</html>