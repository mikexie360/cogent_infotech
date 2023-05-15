package react.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import react.assessment.entity.Book;
import react.assessment.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;

	public void addBook(Book book) {
		bookRepo.save(book);
	}
	
	public List<Book> getAllBooks() {
		return (List)bookRepo.findAll();
	}

	public void updateBook(Book book) {
		bookRepo.save(book);
	}
	
	public void updateBookById(int id, String title, float price) {
		Book temp = bookRepo.findById(id).get();
		temp.setTitle(title);
		temp.setPrice(price);
		bookRepo.save(temp);
	}
	
	public void deleteBookById(int id) {
		bookRepo.deleteById(id);
	}
	
}
