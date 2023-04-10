package com.cogent.infotech;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cogent.infotech.bean.*;
import com.cogent.infotech.bean.Greeting;



@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(HelloWorldApplication.class, args);
		Greeting greeting = ctx.getBean(Greeting.class);
		String msg = greeting.hello();
		System.out.println(msg);
	}

}
