package cogent.infotech.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		Person p = (Person) context.getBean("person",Person.class);
		System.out.println("Person name is: " + p.getName());
		System.out.println("Person age is: " + p.getAge());
	
	}

}
