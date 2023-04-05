package cogent.infotech.com.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setAge(20);
		p.setName("Mike");
		p.setId(1);
		return p;
	}
	@Bean(name="product")
	public Product getProduct() {
		Product p = new Product();
		p.setpId(1);
		p.setpName("Milk");
		p.setpPrice(10);
		return p;
	}
}
