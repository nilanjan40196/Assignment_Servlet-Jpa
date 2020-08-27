package com.capg.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	
	@Id
	private int libraryId;
	
	private String libraryName;
	
	@OneToMany(mappedBy = "library")
	private List<Book> books;
	
	
	public Library(int libraryId, String libraryName, List<Book> books) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.books = books;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public Library() {
		super();
	}

	public Library(String libraryName, List<Book> books) {
		super();
		this.libraryName = libraryName;
		this.books = books;
	}
	
	

}
