package com.monst3r.Repository;

import org.springframework.data.repository.CrudRepository;

import com.monst3r.Entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);
}
