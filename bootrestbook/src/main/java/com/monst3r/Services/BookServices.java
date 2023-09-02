package com.monst3r.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monst3r.Entity.Book;
import com.monst3r.Repository.BookRepository;

@Service
public class BookServices {

	@Autowired
	private BookRepository bookRepository;

	// public static List<Book> list = new ArrayList<>();

//	static {
//		list.add(new Book(1, "java program", "james gosline"));
//		list.add(new Book(2, "Think with java", "Marry green"));
//		list.add(new Book(3, "Java for Beginers ", "Richard"));
//	}

	// get all book
	public List<Book> getAllBook() {
		List<Book> books = (List<Book>) this.bookRepository.findAll();
		return books;
	}

	public Book getBookById(int id) {
		Book book = null;
		// book = list.stream().filter(e -> e.getId() == id).findFirst().get();

		book = this.bookRepository.findById(id);
		return book;
	}

	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
//		list.add(b);
		return result;
	}

	public void deleteBook(int bid) {
		//list.stream().filter(e -> e.getId() != bid).collect(Collectors.toList());
		bookRepository.deleteById(bid);

	}

	public void updateBook(Book book, int bid) {

//		list.stream().map(a -> {
//			if (a.getId() == bid) {
//				a.setAuthor(book.getAuthor());
//				a.setTitle(book.getTitle());
//			}
//			return a;
//		}).collect(Collectors.toList());
		
	book.setId(bid);
	bookRepository.save(book);
	

	}

}
