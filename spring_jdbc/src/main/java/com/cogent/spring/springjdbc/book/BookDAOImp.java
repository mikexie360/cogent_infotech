package com.cogent.spring.springjdbc.book;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
@Component("BookDao")
public class BookDAOImp implements BookDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int createBook(Book book) {
		// TODO Auto-generated method stub

		String sql="insert into book values(?,?,?,?)";
		int result= jdbcTemplate.update(sql,book.getId(),book.getTitle(),book.getAuthor()
				,book.getPrice());
		System.out.println("Inserted the book " +book.getTitle());
		return result;
		
	}

	@Override
	public Book readBook(int id) {
		// TODO Auto-generated method stub
		String sql = "Select distinct * from book b where b.id = ? ";
		Book result = (Book)jdbcTemplate.queryForObject(sql, new Object[] {id},new BookMapper());
		return result;
	}

	@Override
	public List<Book> readAllBook() {
		// TODO Auto-generated method stub
		String sql = "Select * from book";
		List<Book> result = (List<Book>)jdbcTemplate.query(sql, new BookMapper());
		return result;
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		String sql = "Update book set book.title=?, book.author=?,book.price=? where book.id = ?";
		int result = jdbcTemplate.update(sql,book.getTitle(),book.getAuthor(),book.getPrice(),book.getId());
		System.out.println("Updated the book " + book.getTitle());
		return result;
	}

	@Override
	public int deleteBook(Book book) {
		// TODO Auto-generated method stub
		String sql = "Delete from book where book.id = ?";
		int result = jdbcTemplate.update(sql, book.getId());
		System.out.println("Deleted the book " +book.getTitle());
		return result;
	}

}
