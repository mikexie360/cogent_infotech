package pkg;

import java.util.Scanner;

public class BookArray extends Book{
	Book[] books;
	public BookArray(){
		
	}
	
	public void createBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books to enter.");
		int n = sc.nextInt();
		books = new Book[n];
		for ( int i = 0; i<books.length; i++) {
			Book b = new Book();
			System.out.println("Enter the book title.");
			b.setBook_title(sc.next());
			System.out.println("Enter the book Price");
			b.setBook_price(sc.next());
			books[i] = b;
		}
		
	}
	public void showBooks() {
		System.out.println("Book Title \t\tPrice");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getBook_title() +"\t\t\t"+books[i].getBook_price()+"\n");
		}
	}

}
