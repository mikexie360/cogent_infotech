package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("John");
		list.add("Amit");
	
		System.out.println(list);
		
		ListIterator<String> iter = list.listIterator(); 
	
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
	}
	

}
