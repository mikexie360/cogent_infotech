package cogent.infotech.com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/autowiring/annotation/config.xml");
	
		Person person = (Person)ctx.getBean("person");
		Car car = person.getCar();
		
		System.out.println("*******Car*******");
		System.out.println("car model: " + car.getModel());
		System.out.println("car price: " + car.getPrice());
		System.out.println(person);
	
		
		Customer cust = (Customer)ctx.getBean("customer");
		Reservation res = cust.getRes();
		
		System.out.println("***********Reservation***********");
		System.out.println("Reservation id: " + res.getId());
		System.out.println("Reservation time: " + res.getTime());
		
	}

}
