package cogent.infotech.com.autowiring.annotation.custres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/autowiring/annotation/custres/config.xml");
	

	
		
		Customer cust = (Customer)ctx.getBean("customer");
		Reservation res = cust.getRes();
		
		System.out.println("***********Reservation***********");
		System.out.println("Reservation id: " + res.getId());
		System.out.println("Reservation time: " + res.getTime());
		
	}

}
