package pkg;

import java.util.Scanner;

public class CheckAge {

	public void validateAge(int age) throws InvalidAgeException{
		if(age <= 100 && age>=0) {
			System.out.println("Valid Age");
		} else {
			throw new InvalidAgeException("Age is not valid");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		CheckAge ck = new CheckAge();
		try {
			ck.validateAge(age);
		} catch(InvalidAgeException ia) {
			System.out.println(ia.getMessage());
		}
	}

}
