
import java.util.Scanner;

public class TestRectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle[] rect = new Rectangle[5];
		
		for (int i = 0; i<rect.length; i++) {
			Rectangle r = new Rectangle();
			System.out.println("Enter a length");
			r.setLength(sc.nextInt());
			System.out.println("Enter a breadth");
			r.setBreadth(sc.nextInt());
			rect[i] = r;
		}
		
		for (int i = 0; i< rect.length; i++) {
			rect[i].display();
		}
	}
}
