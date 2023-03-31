

import java.util.Scanner;

public class DayOneOne {
	public static void main(String[] args){
		DayOneOne();
	}
	public static void DayOneOne(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number greater than 1");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++){
			if (i%2 == 0){
				System.out.println(i);
			}
		}
		
	}
}
