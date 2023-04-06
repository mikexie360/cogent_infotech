package com.cogent.spring.springjdbc.book;

import java.util.List;

public interface BookDAO {
	public int createBook(Book book);
	public Book readBook(int id);
	public List<Book> readAllBook();
	public int updateBook(Book book);
	public int deleteBook(Book book);
	

}
