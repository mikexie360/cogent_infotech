package pkg2;

interface myInterface{
	public static void m1() {
		System.out.println("This is static method");
	}
	public default void m2() {
		System.out.println("inside m2");
	}
}


public class Main implements myInterface{

	public void m1() {
		System.out.println("Inside Main");
	}
	
	public void m3() {
		System.out.println("Asdf");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface.m1(); // valid
		Main m = new Main();
		m.m2(); // invalid
	}

}
