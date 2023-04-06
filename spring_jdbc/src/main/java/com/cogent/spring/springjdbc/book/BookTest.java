package com.cogent.spring.springjdbc.book;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cogent/spring/springjdbc/book/config.xml");
		BookDAO Dao = (BookDAOImp) ctx.getBean("BookDao");
		Book book = null;
		List<Book> books = null;
		int id;
		String title;
		String author;
		float price;
		
		while(true) {
			System.out.println("-------------Menu---------------");
			System.out.println("0-Exit");
			System.out.println("1-Create book");
			System.out.println("2-Read Single Book");
			System.out.println("3-Read All Books");
			System.out.println("4-Update Book");
			System.out.println("5-Delete Book");
			System.out.println("Please enter your choice");
		
			switch(sc.nextInt()) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("Creating a book");
				System.out.println("Enter the book id");
				id = sc.nextInt();
				System.out.println("Enter the book title");
				title = sc.next();
				System.out.println("Enter the book author");
				author = sc.next();
				System.out.println("Enter the book price");
				price = sc.nextFloat();
				
				book = new Book(id,title,author,price);
				Dao.createBook(book);
				Dao.readBook(id);
				break;
			case 2:
				System.out.println("Enter id of book to read");
				System.out.println("Enter the book id");
				id = sc.nextInt();
				book = Dao.readBook(id);
				System.out.println("Book id: " + book.getId());
				System.out.println("Book title: " + book.getTitle());
				System.out.println("Book author: " + book.getAuthor());
				System.out.println("Book price: " + book.getPrice());
				System.out.println("");
				break;
			case 3:
				System.out.println("Reading all books");
				books = Dao.readAllBook();
				for(int index = 0; index<books.size();index++) {
					System.out.println("Book id: " + books.get(index).getId());
					System.out.println("Book title: " + books.get(index).getTitle());
					System.out.println("Book author: " + books.get(index).getAuthor());
					System.out.println("Book price: " + books.get(index).getPrice());
					System.out.println("");
				}
				break;
			case 4:
				System.out.println("Updating a book");
				System.out.println("Enter book id");
				id = sc.nextInt();
				System.out.println("Enter the book title");
				title = sc.next();
				System.out.println("Enter the book author");
				author = sc.next();
				System.out.println("Enter the book price");
				price = sc.nextFloat();
				book = new Book(id,title,author,price);
				Dao.updateBook(book);
				Dao.readBook(book.getId());
				break;
			case 5:
				System.out.println("Deleting book");
				System.out.println("Enter book id");
				id = sc.nextInt();
				book = new Book();
				book.setId(id);
				Dao.deleteBook(book);
				break;
			}
		}
		
	}

}
