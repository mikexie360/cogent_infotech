package react.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import react.assessment.entity.Book;
import react.assessment.service.BookService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class BookController {
	@Autowired
	private BookService bookService;
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Book Application !!";
    }
	@PostMapping("/addbook")
	public void addBook(@Validated @RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@PutMapping("/updatebook")
	public void updateBook(@Validated @RequestBody Book book) {
		bookService.updateBook(book);
	}
	@PutMapping("/updatebook/{id}/{title}/{price}")
	public void updateBookById(
								@Validated @PathVariable("id") int id,
								@Validated @PathVariable("title") String title,
								@Validated @PathVariable("price") float price
								) {
		bookService.updateBookById(id, title, price);
	}
	
	

	@DeleteMapping("/deletebook/{id}")
	public void deleteBookById(@Validated @PathVariable("id") int id) {
		bookService.deleteBookById(id);
	}
}
