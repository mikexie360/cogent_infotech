package cogent.infotech.com.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient 
//implements InitializingBean,DisposableBean
{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside setId");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside Init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destroy method");
		
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Inside after property set method");
//		
//	
//	
//	}
}
