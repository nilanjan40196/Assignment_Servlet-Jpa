package com.capg.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	private String Author;
	private String publisher;
	
	@ManyToOne
	private Library library;
	
	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	
	

	public Book(int bookId, String bookName, String author, String publisher, Library library) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		Author = author;
		this.publisher = publisher;
		this.library = library;
	}

	public Book() {
		super();
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return Author;
	}
	
	
	
	
	
}
