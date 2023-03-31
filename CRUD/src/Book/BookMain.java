package Book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book book[] = null;
		
		BookDAO dao = new BookDAO();
		int choice = 0;
	
		do {
			
			System.out.println("****************Menu****************");
			System.out.println("0->Exit");
			System.out.println("1->Add book");
			System.out.println("2->Print book");
			System.out.println("3->Update book");
			System.out.println("4->Delete book");
			System.out.println("Please enter your choice.");
			choice = sc.nextInt();
			
			switch(choice) {
			// CREATE
			case 1:
				System.out.println("How many records you want to add?");
				int count=sc.nextInt();
				book = new Book[count];
				for (int i = 0; i<book.length; i++) {
					dao.create(book,i);
				}
				break;
			// READ
			case 2:
				dao.read(book);
				break;
			// UPDATE
			case 3:
				dao.update(book);
				break;
			// DELETE
			case 4:
				dao.delete(book);
				break;
			// EXIT
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("\nIncorrect Input, please select correct input! \n");
				break;
			}

			
			
		}while(choice !=0);		
	}

}
