package com.capg.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.dao.DaoImpl;
import com.capg.models.Book;

public class FindBook extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private DaoImpl dao = new DaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Book b = dao.findBook(Integer.parseInt(request.getParameter("getbid")));
		if(b!=null) {
			out.println("Book Id : "+b.getBookId());out.print("<br>");
			out.println("Book Name : "+b.getBookName());out.print("<br>");
			out.println("Author of Book : "+b.getAuthor());out.print("<br>");
			out.println("Publisher of Book : "+b.getPublisher());
		}else {
			out.println("!!!!!!!!!!!!Invalid book-id!!!!!!!!!!!");
		}
	}

}
