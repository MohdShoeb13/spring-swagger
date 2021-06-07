package com.spring.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.dao.BookRepository;
import com.spring.app.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	public String saveBook(Book book) {
		repository.save(book);
		return "Book saved with id: " + book.getId();
	}
	
	public Book getBook(int bookId) {
		 Optional<Book> findById = repository.findById(bookId);
		return findById.get();
	}
	
	public List<Book> removeBook(int bookId){
		repository.deleteById(bookId);
		return repository.findAll();
	}

}
