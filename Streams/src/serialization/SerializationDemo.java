package serialization;
import java.io.*;
public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("c://streams//Emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1,"John",1000, 112);
			oos.writeObject(emp);
			System.out.println("Object Serialized");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
