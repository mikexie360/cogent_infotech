package serialization;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StreamBasedProgramDeserial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Student stud =null;
		ArrayList<Student> arr = new ArrayList<Student>();
		
		do {
			System.out.println("----------Menu----------");
			System.out.println("0-exit");
			System.out.println("1-Deserialize file and print");


			try {
				fis = new FileInputStream("c://streams//Student1.ser");
				ois = new ObjectInputStream(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			switch(sc.nextInt()) {
			case 0: 
				try {

					fis.close();
					ois.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
				break;
			case 1: // print

				try {
					Object obj = ois.readObject();
					arr=(ArrayList<Student>)obj;
					for (int i = 0; i<arr.size();i++) {
						System.out.println("Student roll no: "+ arr.get(i).rollNumber);
						System.out.println("Student Name: "+ arr.get(i).name);
						System.out.println("Student age: "+ arr.get(i).age);
						System.out.println("Student address: "+ arr.get(i).address);
						System.out.println();
					}

				} catch(Exception e) {
					System.out.println("Done printing");
				}		
				
				break;
							}
		} while(true);
		
	}
}
