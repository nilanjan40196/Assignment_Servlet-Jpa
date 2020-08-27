package com.capg.dao;

import java.util.List;

import com.capg.models.Book;
import com.capg.models.Library;

public interface IDao {
	
	public void addBook(Book b) ;
	
	public Library getLibrary(String libName);
	
	public Book findBook(int bookId);
	
	public void deleteBook(int bookId);
	
	public List<Book> getAllBooks();
	
	public Book updateBookDetails(int id,String bname,String auth,String pub);

}
