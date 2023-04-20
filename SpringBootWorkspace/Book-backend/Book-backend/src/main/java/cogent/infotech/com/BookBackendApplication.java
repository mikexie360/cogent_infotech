package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@SpringBootApplication
public class BookBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookBackendApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.bookRepo.save(new Book("java", 10f));
		this.bookRepo.save(new Book("Cpp", 15f));
		this.bookRepo.save(new Book("python", 12f));
		this.bookRepo.save(new Book("html",43f));
		this.bookRepo.save(new Book("perl",21f));

	}

}
