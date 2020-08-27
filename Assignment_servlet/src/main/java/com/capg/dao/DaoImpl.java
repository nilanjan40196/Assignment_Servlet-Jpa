package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capg.models.Book;
import com.capg.models.Library;

public class DaoImpl implements IDao{
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa-servlet");
	private static EntityManager em = emf.createEntityManager();
	
	public void addBook(Book b) {
		em.getTransaction().begin();
		
		em.persist(b);
		
		em.getTransaction().commit();
	}
	
	public Library getLibrary(String libName) {
		EntityManager em1 = emf.createEntityManager();
		
		TypedQuery<Library> query = em1.createQuery("SELECT l FROM Library l", Library.class);
		List<Library> libs = query.getResultList();
		
		for(Library l : libs ) {
			if(l.getLibraryName().equals(libName)) {
				return l;
			}
		}
		return null;
	}
	
	public Book findBook(int bookId) {
		return em.find(Book.class,bookId);
	}

	public void deleteBook(int bookId) {
		em.getTransaction().begin();
		Book b = findBook(bookId);
		em.remove(b);
		
		em.getTransaction().commit();
	}
	
	public List<Book> getAllBooks(){
		EntityManager em1 = emf.createEntityManager();
		TypedQuery<Book> que = em.createQuery("SELECT b FROM Book b", Book.class);
		List<Book> books = que.getResultList();
		em1.close();
		return books;
	}
	
	public Book updateBookDetails(int id,String bname,String auth,String pub) {
		Book b = findBook(id);
		
		em.getTransaction().begin();
		
		if(bname.length()!=0) {
			b.setBookName(bname);
		}
		if(auth.length()!=0) {
			b.setAuthor(auth);
		}
		if(pub.length()!=0) {
			b.setPublisher(pub);
		}
		
		em.getTransaction().commit();
		return b;
	}
}
