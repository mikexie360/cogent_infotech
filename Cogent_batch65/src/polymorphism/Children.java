package polymorphism;

public class Children extends Parent{
	public Children(String name) {
		super(name);
	}
	
	public void behavior() {
		System.out.println("More love");
	}
	
	@Override
	public void likes() {
		System.out.println("Care");
	}
}
