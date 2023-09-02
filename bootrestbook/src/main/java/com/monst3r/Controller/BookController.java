package com.monst3r.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.monst3r.Entity.Book;
import com.monst3r.Services.BookServices;

@RestController
public class BookController {
	@Autowired
	private BookServices bookServices;
	
	@GetMapping("/")
	public String home() {
		return "Please Enter valid URL";
	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {		
		return this.bookServices.getAllBook();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookServices.getBookById(id); 
	}
	
	@PostMapping("/books")
	public Book addBooks(@RequestBody Book book) {
		return this.bookServices.addBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	@ResponseBody
	public String deleteBook(@PathVariable("bookId") int bookId) {
		
		this.bookServices.deleteBook(bookId);
		return "book deleted successfully ";
	}
	
	@PutMapping("/books/{bookId}")
	public Book updateBoot(@RequestBody Book book,  @PathVariable("bookId") int bookId) {
		this.bookServices.updateBook(book, bookId);
		return book;
		
	}
}
