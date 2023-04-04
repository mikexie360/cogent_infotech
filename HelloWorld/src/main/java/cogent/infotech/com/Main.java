package cogent.infotech.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student)ctx.getBean("student");
		
		System.out.println(s);
	}

}
