package Person;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pArray = new Person[10];
		
		//Scanner sc = new Scanner(System.in);
		
		
		// make all the persons for the array
		for (int i = 0; i<pArray.length; i++) {
			Person p = new Person();
			p.setName("PersonName" + i);
			p.setAge(i);
			pArray[i]= p;
		}
		
		// find the lowest age
		int minAge = pArray[0].getAge();
		int indexMinAge = 0;
		for (int i = 0; i<pArray.length; i++) {
			if (minAge > pArray[i].getAge()) {
				minAge = pArray[i].getAge();
				indexMinAge = i;
			}
		}
		
		System.out.println("The person name with lowest age is: " + pArray[indexMinAge].getName());
		System.out.println("The person name with age is: " + pArray[indexMinAge].getAge());
	}

}
