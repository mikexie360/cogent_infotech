package cogent.infotech.com.annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cogent.infotech.com.annotations")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(cogent.infotech.com.annotations.Main.class);
		ChatService chatService = ctx.getBean(cogent.infotech.com.annotations.ChatService.class);
		
		chatService.chat();
		ctx.close();
	}

}
