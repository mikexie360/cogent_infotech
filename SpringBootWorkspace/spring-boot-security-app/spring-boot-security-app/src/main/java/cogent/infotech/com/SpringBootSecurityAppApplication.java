package cogent.infotech.com;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.*;
import cogent.infotech.com.repository.BookRepository;
import cogent.infotech.com.repository.UserRepository;


@SpringBootApplication
public class SpringBootSecurityAppApplication {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAppApplication.class, args);
		

	}
	
	@PostConstruct
	public void initUser() {
		List<User> users = new ArrayList<>();
		users.add(new User(101,"mike","password","mike@gmail.com"));
		users.add(new User(102,"john","password","john@gmail.com"));
		users.add(new User(103,"Robert","password","john@gmail.com"));
		userRepo.saveAll(users);
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(1,"java",100d));
		books.add(new Book(2,"cpp",150d));
		books.add(new Book(3,"python",200d));
		bookRepo.saveAll(books);
	}

}
