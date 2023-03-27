package pkg;

import java.util.Scanner;

class Arithmetic{
	public void division(int x, int y) throws ArithmeticException, Exception {
		int z = x/y;
		System.out.println(z);
	}
}
class MyException extends Exception {
	
}


public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			new Arithmetic().division(500, 0);
//		} catch (ArrayIndexOutOfBoundsException e){
//			System.out.println("Array Index out of bounds exception");
//		} catch (NumberFormatException e) {
//			System.out.println("Number format exception!");
//		}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("Will always be executed");
		}
		System.out.println("After catch");
		
	}

}
