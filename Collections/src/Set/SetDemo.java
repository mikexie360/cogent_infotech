package Set;

import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();
		
		Set<Integer> set = new TreeSet<Integer>(); 
	
		
		set.add(100);
		set.add(500);
		set.add(140);
		set.add(30);
		set.add(100);
		
		System.out.println(set);
		
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (Integer in: set) {
			System.out.println(in);
		}
	}

}
