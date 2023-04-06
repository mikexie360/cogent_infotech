package com.cogent.spring.springjdbc.book;

import java.sql.ResultSet;
import java.sql.*;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setId(rs.getInt("id"));
		book.setTitle(rs.getString("title"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getFloat("price"));
		return book;
	}
	
}
