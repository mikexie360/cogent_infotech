package pkg;

import java.util.function.Supplier;
import java.util.function.Predicate;
public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> randomValue=()->Math.random();
		
		System.out.println(randomValue.get());
		

	}

}
