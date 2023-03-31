
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Book b1 = new Book();
		//b1.getUserInputScanner();
		//System.out.println(b1.toString());
		
		
		Book bookArray[] = new Book[3];
		for (int i = 0; i<bookArray.length; i++){
			Book b = new Book();
			b.getUserInputScanner();
			bookArray[i] = b;
		}
		
		for(int i=0; i<bookArray.length; i++){
			System.out.println(bookArray[i].toString());
		}
	}

}
