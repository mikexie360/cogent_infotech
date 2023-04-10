package cogent.infotech.com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import cogent.infotech.com.entity.Book;


@Service
public interface BookService {
	public Book save(Book item);
	public List<Book> fetchBooks();
	public Book getBookById(int id);
	public List<Book> getAllBooks();
	public Book saveOrUpdate(Book book);
	public void deleteBookById(int id);
}
