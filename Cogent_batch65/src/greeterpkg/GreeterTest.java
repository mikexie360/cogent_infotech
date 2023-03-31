package greeterpkg;

import gl.itp.hyd65.cs65.Mike.*;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter[] greetArr = new Greeter[args.length];
		for (int i = 0; i <args.length; i++) {
			greetArr[i] = new Greeter(args[i]);
			System.out.println(greetArr[i].sayHello());
		}
		
		
		Advisor advice = new Advisor();
		System.out.println("Advice: " +advice.getAdvice());

		for (int i =args.length-1; i>-1; i--) {
			System.out.println(greetArr[i].sayGoodBye());
			
		}
	}

}
