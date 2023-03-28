package serialization;

import java.io.Serializable;

public class Student implements Serializable{
	int rollNumber;
	String name;
	int age;
	String address;
	public Student(int rollNumber, String name, int age, String address) throws BlankException {
		super();
		try {
			this.rollNumber = rollNumber;
			this.name = name;
			this.age = age;
			this.address = address;
		} catch (Exception e) {
			System.out.println("Incorrect datatype");
		}
		if (this.name.equals("") || this.address.equals("")) {
			throw new BlankException("Cannot have empty name or address.");
		}
	}
	public Student(String rollNumber, String name, String age, String address) throws BlankException {
		super();
		try {
			this.rollNumber = Integer.parseInt(rollNumber);
			this.name = name;
			this.age = Integer.parseInt(age);
			this.address = address;
		} catch (Exception e) {
			System.out.println("Incorrect datatype");
		}
		if (this.name.equals("") || this.address.equals("")) {
			throw new BlankException("Cannot have empty name or address.");
		}
	}
	
}
