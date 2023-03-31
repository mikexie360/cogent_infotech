package gl.itp.hyd65.cs65.Mike;

public class Greeter {
	String name;
	public Greeter(String name) {
		this.name = name;
	}
	public String sayHello() {
		return "Hello " + name;
	}
	public String sayGoodBye() {
		return "Goodbye " + name;
	}
}
