package cogent.infotech.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	private String bookName;
	private float bookPrice;
	
	
	
	public Book() {
		super();
	}

	public Book(String bookName, float bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public Book(long bookId, String bookName, float bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
}
