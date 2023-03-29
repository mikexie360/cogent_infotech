import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.lang.Math;


public class BookManagementDAO implements BookManagement {
	Scanner sc = new Scanner(System.in);

	@Override
	public void create(List<Book> list) {
		
		System.out.println("Enter the book id");
		int id = sc.nextInt();
		System.out.println("Enter the book name");
		String name = sc.next();
		System.out.println("Enter the book price");
		float price = sc.nextFloat();
		Book b = new Book(id,name,price);

		list.add(b);
	}
	@Override
	public void find(List<Book> list) {
		System.out.println("0->back");
		System.out.println("1->Search by id");
		System.out.println("2->Search by name");
		System.out.println("3->Search by price");
		
		switch(sc.nextInt()) {
		case 0:
			return;
		case 1:
			System.out.println("Enter book id");
			int id = sc.nextInt();
			for (int i=0; i<list.size();i++) {
				if (list.get(i).id == id) {
					list.get(i).printBook();
				}
			}
			break;
		case 2:
			System.out.println("Enter book name");
			String name = sc.next();
			for (int i=0; i<list.size();i++) {
				if (list.get(i).name.equals(name)) {
					list.get(i).printBook();
				}
			}
			break;
		case 3:
			System.out.println("Enter book price");
			float price = sc.nextFloat();
			for (int i=0; i<list.size();i++) {
				if (Math.abs(list.get(i).price - price) <= .01) {
					list.get(i).printBook();
				}
			}
			break;
		}
	}
	@Override
	public void update(List<Book> b) {
		System.out.println("Enter Book id to update");
		int id = sc.nextInt();
		System.out.println("Enter new Book id");
		int newid = sc.nextInt();
		System.out.println("Enter new Book name");
		String name = sc.next();
		System.out.println("Enter new Book price");
		float price = sc.nextFloat();
		
		//get first matching id
		int index = -1;
		for (int i = 0; i <b.size(); i++) {
			if (b.get(i).id == id) {
				index = i;
				break;
			}
		}
		
		b.set(index, new Book(newid, name,price));
		

	}
	@Override
	public void delete(List<Book> b) {
		System.out.println("Enter Book id to delete");
		int id = sc.nextInt();
		// get first matching id
		int index = -1;
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).id == id) {
				index = i;
				break;
			}
		}
		b.remove(index);
	}
	@Override
	public void print(List<Book> b) {
		for (int i = 0; i<b.size();i++) {
			b.get(i).printBook();
		}
	}

}
