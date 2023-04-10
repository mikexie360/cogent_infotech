package cogent.infotech.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.*;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepo;

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}
	@Override
	public List<Book> fetchBooks() {
		// TODO Auto-generated method stub
		return (List<Book>)bookRepo.findAll();
	}
	
	@Override
	public Book getBookById(int id) {
		return bookRepo.findById((int)id).get();
	}
	@Override
	public List<Book> getAllBooks(){
		return (List<Book>)bookRepo.findAll();
//		List<Book> books = new ArrayList<Book>();
//		bookRepo.findAll().forEach(b -> books.add(b));
//		return books;
	}
	@Override
	public Book saveOrUpdate(Book book) {
		return bookRepo.save(book);
	}
	
	
	@Override
	public void deleteBookById(int id) {
		bookRepo.deleteById(id);
	}
}
