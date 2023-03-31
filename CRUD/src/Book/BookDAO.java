package Book;

import java.util.Scanner;

public class BookDAO {
	Scanner sc = new Scanner(System.in);
	public void create(Book book[], int i) {
		Book b = new Book();
		book[i] = b;
		System.out.println("Please enter the book ISBN: ");
		book[i].setISBN(sc.nextInt());
		System.out.println("Please enter the book name: ");
		book[i].setName(sc.next());
		System.out.println("Please enter the book price: ");
		book[i].setPrice(sc.nextDouble());

	}
	public void read(Book book[]) {
		for(Book b:book) {
			if (b == null) {
				continue;
			}
			System.out.println("Book ISBN is: "+ b.getISBN());
			System.out.println("Book Name is: "+ b.getName());
			System.out.println("Book Price is: "+ b.getPrice());
			System.out.println();

		}
	}
	public void update(Book book[]) {
		Book b = new Book();
		System.out.println("Please enter the book IDBN to update: ");
		int ISBN = sc.nextInt();
		int index = -1;
		for(int i = 0; i<book.length; i++) {
			if (book[i].getISBN() == ISBN) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("book ISBN does not exist in record.\n");
		} else {
			System.out.println("Please enter the updated book ISBN: ");
			book[index].setISBN(sc.nextInt());
			System.out.println("Please enter the updated book Name: ");
			book[index].setName(sc.next());
			System.out.println("Please enter the updated book Price: ");
			book[index].setPrice(sc.nextDouble());
			System.out.println("Record updated.\n ");
		}
		
	}
	public void delete(Book book[]) {
		System.out.println("Please enter the book IDBN to delete: ");
		int ISBN = sc.nextInt();
		int index = -1;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getISBN() == ISBN) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Book ISBN does not exist in record.\n");
		}else {
			book[index] = null;
			System.out.println("Record of book deleted.\n ");
		}
		
	}
}
