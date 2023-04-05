package cogent.infotech.com.university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogent.infotech.com.university.University;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/university/config.xml");
		University u1 = (University)ctx.getBean("university");
		System.out.println(u1.hashCode());
	
		University u2 = (University)ctx.getBean("university");
		System.out.println(u2.hashCode());
		
		u1.setId(1);
		System.out.println(u1);
		System.out.println(u2);
		
	}

}
