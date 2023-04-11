package cogent.infotech.com.entity;

import javax.persistence.*;

import javax.persistence.Id;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="up_id")
	private Passport passport;
	
	public Person() {
		//
	}

	public Person(long id, String name, String email, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passport = passport;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
		
}
