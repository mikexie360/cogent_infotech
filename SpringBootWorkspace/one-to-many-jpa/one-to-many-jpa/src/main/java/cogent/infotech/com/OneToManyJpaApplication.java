package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.repository.PostRepository;
import cogent.infotech.com.entity.*;
@SpringBootApplication
public class OneToManyJpaApplication implements CommandLineRunner {

	@Autowired
	PostRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(OneToManyJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post post = new Post("Cogent Infotech","Cogent Infotech is IT company");
	
		Comment comment1 = new Comment("Good IT company");
		Comment comment2 = new Comment("Its also a university known as Cogent University");
		Comment comment3 = new Comment("Informative");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		repo.save(post);
		System.out.println("Post is added");
	
	}
	
}
