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
	<form action="delete">
		Enter Book Id : <input type = "text" name ="delbid">
		<br><br>
		<input type ="submit" value="DELETE"> 
	</form>
	
	<%-- <%@
		page import="com.capg.dao.DaoImpl,java.util.*,java.Exception,javax.servlet.ServletException,java.lang.*"
 	%>
	
	<%
		DaoImpl dao = new DaoImpl();
		dao.deleteBook(Integer.parseInt(request.getParameter("delbid")));
		out.println("Book ID "+request.getParameter("delbid")+" deleted. ");
	%> --%>
	
</body>
</html>
