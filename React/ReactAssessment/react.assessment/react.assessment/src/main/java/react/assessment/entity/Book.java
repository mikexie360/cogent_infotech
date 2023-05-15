package react.assessment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="price")
	private float price;
	public Book(int id, String title, float price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public Book(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	
	
}
