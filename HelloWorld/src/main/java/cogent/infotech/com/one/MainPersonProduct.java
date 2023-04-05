package cogent.infotech.com.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cogent.infotech.com.spring.BeanConfiguration;

public class MainPersonProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurations.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(cogent.infotech.com.one.BeanConfiguration.class);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext( );
		Person per = (Person)context.getBean("person",Person.class);
		System.out.println(per.getName());
		System.out.println(per.getAge());
		System.out.println(per.getId());
	
		Product pro = (Product)context.getBean("product");
		System.out.println(pro.getpId());
		System.out.println(pro.getpName());
		System.out.println(pro.getpPrice());
	}

}
