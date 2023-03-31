package polymorphism;

public class Colleague extends Person{
	public Colleague (String personName) {
		super(personName);
	}
	
	@Override
	public void behavior() {
		System.out.println("Has more respect");
	}
	
	@Override
	public void likes() {
		System.out.println("Professional");
	}
}
