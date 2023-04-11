package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Passport;
import cogent.infotech.com.entity.Person;
import cogent.infotech.com.repository.PersonRepository;

@SpringBootApplication
public class OneToOneJpaApplication implements CommandLineRunner{
	@Autowired
	PersonRepository personRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneJpaApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		Person person = new Person();
		person.setName("john");
		person.setEmail("john@gmail.com");
		
		Passport passport = new Passport();
		passport.setExpiry("24-07-2024");
		passport.setAddress("New York");
		
		person.setPassport(passport);
	
		personRepo.save(person);
		System.out.println("Person details are saved successfully.");
	}
}
