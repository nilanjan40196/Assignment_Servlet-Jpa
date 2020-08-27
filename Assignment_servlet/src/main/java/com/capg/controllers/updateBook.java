package com.capg.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.dao.DaoImpl;
import com.capg.models.Book;

/**
 * Servlet implementation class updateBook
 */
public class updateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		PrintWriter out = response.getWriter();
    		response.setContentType("text/html");
    		
    		DaoImpl dao = new DaoImpl();
    		
    		
    		int bId = Integer.parseInt(request.getParameter("ubId"));
    		String newBname = request.getParameter("ubName");
    		String newBauth = request.getParameter("uAuth");
    		String newBpub = request.getParameter("uPub");
    		
    		Book book = dao.findBook(bId);
    		
    	     out.println("<html>");
    		 out.println("<body>");
    			
    		 	out.println("----------------Before Update----------------- ");out.print("<br>");out.print("<br>");
    		 	out.println("Book Name : " +book.getBookName());out.print("<br>");
    		 	out.println("Book Author : "+book.getAuthor());out.print("<br>");
    		 	out.println("Book Publisher Name : "+book.getPublisher());out.print("<br>");
    		 
    		Book upbook = dao.updateBookDetails(bId,newBname,newBauth,newBpub);
    		 	
    			out.println("----------------After Update----------------- ");out.print("<br>");out.print("<br>");
    			out.println("Book Name : " +upbook.getBookName());out.print("<br>");
    			out.println("Book Author : "+upbook.getAuthor());out.print("<br>");
    			out.println("Book Publisher Name : "+upbook.getPublisher());out.print("<br>");
    			
    		out.println("</html>");
    		out.println("</body>");
	}

}
