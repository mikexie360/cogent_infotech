package react.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name ="User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="email")
	private String email;
	@Lob
	@Column(name="picture", columnDefinition="BLOB")
	private String picture;
	
	public User(int id, String firstName, String lastName, String email, String picture) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.picture = picture;
	}
	public User(String firstName, String lastName, String email, String picture) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.picture = picture;
	}
	public User() {
		super();
	}
	
	
}
