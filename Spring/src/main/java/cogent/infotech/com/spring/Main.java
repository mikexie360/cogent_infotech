package cogent.infotech.com.spring;

import org.springframework.context.support.*;

//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;



import cogent.infotech.com.spring.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new 
				ClassPathXmlApplicationContext("cogent/infotech/com/spring/config.xml");
		Employee e = (Employee)ctx.getBean("employee");
		System.out.println(e);
		ctx.registerShutdownHook();
		
	}

}
