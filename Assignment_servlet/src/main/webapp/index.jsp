<html>
<body>
<h2>Welcome</h2>
<br><br><br>
<a href = "AddBook.jsp">Add Book
</a><br><br><br>
<a href = "updateBook.jsp">Update Book</a>
<br><br><br>
<a href = "findBook.jsp">Find Book</a>
<br><br><br>
<a href = "deleteBook.jsp">Delete Book</a>

<%@ page import=" javax.persistence.EntityManager,
 javax.persistence.EntityManagerFactory,
 javax.persistence.Persistence"
	
 %>
<!--
<%!
public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa-servlet");
public static EntityManager em = emf.createEntityManager();
%>
-->


</body>
</html>
