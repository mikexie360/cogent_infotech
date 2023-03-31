package pkg;

class Student {
	private static int age;
	Student(int age) {
		this.age = age;
	}
	
	public static void setAge(int newage) {
		age = newage;
	}
	
	public static int getAge() {
		return age;
	}
}

public class StaticDemo {
	
	private static int age;
	static {
		age = 20;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	static {
		age = 20;
	}
	public int getAge() {
		return this.age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.age);
		StaticDemo st1 = new StaticDemo();
		st1.setAge(40);
		StaticDemo st2 = new StaticDemo();
		System.out.println(st2.getAge());
		
	}

}
