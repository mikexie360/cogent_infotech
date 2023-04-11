package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.service.BookService;
import cogent.infotech.com.entity.Book;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		//return bookService.fetchBooks();
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	@PostMapping("/books")
	public Book addBook( @RequestBody  Book book) {
		return bookService.save(book);
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return bookService.saveOrUpdate(book);
	}
	
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		bookService.deleteBookById(id);
	}

	
	
}
