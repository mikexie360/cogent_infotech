import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Book> books = new ArrayList<Book>();
		BookManagementDAO manager = new BookManagementDAO();
		
		do {
			System.out.println("--------Menu-----------");
			System.out.println("0-exit");
			System.out.println("1-Add book");
			System.out.println("2-Find book");
			System.out.println("3-Update book");
			System.out.println("4-Delete book");
			System.out.println("5-Print all books");

			switch(sc.nextInt()) {
			case 0:
				System.exit(0);
				break;
			case 1:
				manager.create(books);
				break;
			case 2:
				manager.find(books);
				break;
			case 3:
				manager.update(books);
				break;
			case 4:
				manager.delete(books);
				break;
			case 5:
				manager.print(books);
				break;

			}
		} while(true);
		
	}

}
