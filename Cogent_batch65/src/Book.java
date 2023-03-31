import java.util.Scanner;


public class Book {
	int number;
	String name;
	double price;
	String authorName;
	
	
	
	public Book() {
		super();
		this.number = 1004;
		this.name = "Java jump start";
		this.price = 10;
		this.authorName = "John";
	}

	public Book(int number, String name, double price, String authorName) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.authorName = authorName;
	}
	
	public void getUserInputScanner(){
		System.out.println("Enter the book Number: ");
		Scanner sc1 = new Scanner(System.in);
		this.number = sc1.nextInt();
		System.out.println("Enter the book Name: ");
		Scanner sc2 = new Scanner(System.in);
		this.name = sc2.nextLine();
		System.out.println("Enter the book Price: ");
		Scanner sc3 = new Scanner(System.in);
		this.price = sc3.nextDouble();
		System.out.println("Enter the book Author Name: ");
		Scanner sc4 = new Scanner(System.in);
		this.authorName = sc4.nextLine();
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	@Override
	public String toString() {
		return "Book"
				+ "\n number=" + number 
				+ "\n name=" + name 
				+ "\n price=" + price
				+ "\n authorName=" + authorName;
	}
	
	
	
	
}
