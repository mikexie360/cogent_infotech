package serialization;

import java.io.*;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("c://streams//Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp=(Employee)obj;
			System.out.println("Emplyee ID:" + emp.id);
			System.out.println("Emplyee Name:" + emp.name);
			System.out.println("Emplyee salary:" + emp.salary);
			System.out.println("Emplyee ssn:" + emp.ssn);
			fis.close();
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
