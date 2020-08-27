package com.capg.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.dao.DaoImpl;
import com.capg.models.Book;
import com.capg.models.Library;

/**
 * Servlet implementation class AddBook
 */
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DaoImpl dao = new DaoImpl();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Book book = new Book();
		String libname = request.getParameter("library");
		Library library = dao.getLibrary(libname);
		book.setLibrary(library);
		
		book.setBookId(Integer.parseInt(request.getParameter("bid")));
		
		book.setAuthor(request.getParameter("auth"));
		book.setBookName(request.getParameter("bname"));
		book.setPublisher(request.getParameter("pub"));
		
		dao.addBook(book);
		out.println("Book added");
		
	}

}
