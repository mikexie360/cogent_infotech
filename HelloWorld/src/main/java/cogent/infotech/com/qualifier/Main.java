package cogent.infotech.com.qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"cogent/infotech/com/qualifier/config.xml");

		Employee e = (Employee) ctx.getBean("employee");
		//e.setAddress((Address)ctx.getBean("address2"));
		System.out.println(e);
		
		Address a123 = (Address) ctx.getBean("address123");
		System.out.println(a123);
	}
}
