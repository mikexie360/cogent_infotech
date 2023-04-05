package cogent.infotech.com.lc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new 
				ClassPathXmlApplicationContext("cogent/infotech/com/lc/config.xml");
		Patient p = (Patient)ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();
		
		
		
	}

}
