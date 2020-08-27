<%@page import="com.capg.models.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.capg.dao.DaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action = "update" method="post">
		Enter Book Id : <input type = "text" name = "ubId">
		<br><br>
		<p style= "color:red;">Enter only those values which you want to update. </p>
		<br><br>
		Enter Book Name : <input type = "text" name = "ubName">
		<br><br>
		Enter Author Name : <input type = "text" name = "uAuth">
		<br><br>
		Enter Publisher Name : <input type = "text" name = "uPub">
		<br><br>
		<input type ="submit" value ="Update">
	</form>
	

	
	
</body>
</html>