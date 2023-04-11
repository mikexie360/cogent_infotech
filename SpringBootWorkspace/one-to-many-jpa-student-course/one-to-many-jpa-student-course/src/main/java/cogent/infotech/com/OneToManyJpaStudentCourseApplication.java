package cogent.infotech.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Course;
import cogent.infotech.com.entity.Student;
import cogent.infotech.com.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import cogent.infotech.com.entity.*;

@SpringBootApplication
public class OneToManyJpaStudentCourseApplication implements CommandLineRunner{

	@Autowired
	StudentRepository studentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyJpaStudentCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student("Mike");
		
		Course c1 = new Course("Java",100);
		Course c2 = new Course("c++",50);
		Course c3 = new Course("python",150);
		
		
		s1.getCourse().add(c1);
		s1.getCourse().add(c2);
		s1.getCourse().add(c3);
		
		studentRepo.save(s1);
		System.out.println("Post is added");
	}

}
