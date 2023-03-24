import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Product[] products = new Product[10];
		
		ProductDAO pDao = new ProductDAO();
		
		int userInput = 0;
		
		do {
			System.out.println("-------Menu--------");
			System.out.println("1-Create Record");
			System.out.println("2-Read Record");
			System.out.println("3-Update Record");
			System.out.println("4-Delete Record");
			System.out.println("5-Exit");
			
			userInput = sc.nextInt();
			switch(userInput) {
			case 1:
				pDao.create(products);
				break;
			case 2:
				pDao.read(products);
				System.out.println("Read all the records");
				break;
			case 3:
				pDao.update(products);
				break;
			case 4:
				pDao.delete(products);
				break;
			case 5:
				System.out.println("Exited the program");
				System.exit(0);
				break;
			default:
				System.out.println("Select a valid option");
				break;
			}
			
		} while(userInput != 5);
	}

}
