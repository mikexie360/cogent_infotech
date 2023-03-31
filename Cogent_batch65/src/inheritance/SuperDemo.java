package inheritance;

class A{
	int a;
	public A(int a) {
		this.a = a;
	}
	public void show() {
		System.out.println(a);
	}
}

class B extends A{
	int b;
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	public void show() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		B b = new B(10, 20);
		b.show();
	}

}
