package pkg;

public class Book {
	String Book_title;
	String Book_price;
	
	public Book() {
	}

	public Book(String book_title, String book_price) {
		super();
		Book_title = book_title;
		Book_price = book_price;
	}

	public String getBook_title() {
		return Book_title;
	}

	public void setBook_title(String book_title) {
		Book_title = book_title;
	}

	public String getBook_price() {
		return Book_price;
	}

	public void setBook_price(String book_price) {
		Book_price = book_price;
	}
	
	
	
}
