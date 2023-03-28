package serialization;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StreamBasedProgram {
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
			System.out.println("1-add student");
			System.out.println("2-write to file and exit");


			try {
				fos = new FileOutputStream("c://streams//Student1.ser");
				oos = new ObjectOutputStream(fos);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			switch(sc.nextInt()) {
			case 0: 
				try {

					fos.close();
					oos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
				break;
			case 1: // add student
				System.out.println("Enter student information.\n(Roll no, Name, Age, Address)");

				try {
					stud = new Student(sc.next(),sc.next(),sc.next(),sc.next());
					arr.add(stud);
					oos.writeObject(arr);
				} catch (NullPointerException e) {
					System.out.println("Incorrect data type, giving you null pointer exception!");
				} catch(Exception e) {
					e.printStackTrace();
					System.out.println("Exception!");
				}				
				break;
			case 2: // write to file and exit
				System.out.println("Writing to file and exit");
				try {
					oos.writeObject(arr);
					oos.close();
					fos.close();
					System.exit(0);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
			}
		} while(true);
		
	}
}
