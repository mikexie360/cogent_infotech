package cogent.infotech.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/innerbean/config.xml");
		Person p = (Person)ctx.getBean("person");
		Car car = p.getCar();
		Address address = p.getAdd();
		System.out.println("********Address********");
		System.out.println("House no: " + address.getHno());
		System.out.println("Street name: " + address.getStreet());
		System.out.println("City name: " + address.getCity());
		
		System.out.println("****Car*****");
		System.out.println("Car Model: " + car.getModel());
		System.out.println("Car Price: " + car.getPrice());
	}

}
