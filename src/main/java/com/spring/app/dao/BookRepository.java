package com.spring.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
