package pkg;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c =(x)->System.out.println(x.toLowerCase());
		
		
		c.accept("COGENT INFOTECH");
	}

}
