package pkg;
@FunctionalInterface
interface MyInterface1 {
	public void square(int x);
}



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface1 m1 =(s)->{ 
			System.out.println(s*s);
		};
		
		m1.square(5);
	
	}

}
