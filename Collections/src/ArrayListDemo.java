
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(new Integer(20));
		a1.add(new Integer(40));
		a1.add(50); // AutoBoxing

		for (int i=10;i<=100;i=i+10) {
			a1.add(i);
		}
		
		System.out.println(a1);
		
		a1.add(2,100);
		
		System.out.println(a1);

		a1.set(3, 300);
		
		System.out.println(a1);
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		
		System.out.println("Second List: " + secondList);
		a1.addAll(4,secondList);
		
		System.out.println(a1);

		if(a1.contains(222)) {
			System.out.println("List has the value");
		} else {
			System.out.println("List does not have value");
		}
		
		a1.remove(3);
		System.out.println(a1);

		
		
		
		
		
		
//		for(Object obj: a1) {
//			String str = obj.toString();
//			int a = Integer.parseInt(str);
//			System.out.print(a);
//		}
//		System.out.println("\n");
//		
//		Iterator<Integer> iter= a1.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.print(iter.next());
//			iter.remove();
//		}
//		System.out.println("\n");
//		
//		System.out.println(a1);
	}

}
