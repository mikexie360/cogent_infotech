package polymorphism;

public class Wife extends Person {
	public Wife(String personName) {
		super(personName);
	}
	
	@Override
	public void behavior() {
		System.out.println("Has more respect");
	}
	
	@Override
	public void likes() {
		System.out.println("Love");
	}
}
