package pkg;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BookArray books = new BookArray();
		
		int userInput = 0;
		do {
			
			System.out.println("--Book Menu--");
			System.out.println("0->Exit");
			System.out.println("1->Create Books");
			System.out.println("2->Show Books");
			
			userInput = sc.nextInt();
			
			switch(userInput) {
			case 0: 
				System.out.println("Exit");
				System.exit(0);
				break;
			case 1:
				books.createBooks();
				break;
			case 2:
				books.showBooks();
				break;
			}

			
		}while(userInput != 0);
		
		
	}

}
