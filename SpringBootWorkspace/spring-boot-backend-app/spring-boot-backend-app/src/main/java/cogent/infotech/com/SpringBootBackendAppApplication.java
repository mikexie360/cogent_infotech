package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.repository.UserRepository;
import cogent.infotech.com.entity.*;


@SpringBootApplication
public class SpringBootBackendAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendAppApplication.class, args);
	}

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRepo.save(new User("Mike","Xie","mxie360@gmail.com"));
		this.userRepo.save(new User("John","Doe","JD@gmail.com"));
		this.userRepo.save(new User("Anita","Lou","AL@gmail.com"));
		this.userRepo.save(new User("asdf","weqr","mxie360@gmail.com"));
		this.userRepo.save(new User("asdf","qwer","mxie360@gmail.com"));

	}

}
