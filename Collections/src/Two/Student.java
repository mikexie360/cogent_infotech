package Two;
import java.util.*;

public class Student {
	private HashMap<String,String> empNames = new HashMap<String,String>();
	Scanner sc = new Scanner(System.in);
	
	public void setNames() {
		System.out.println("Enter roll number");
		String rollno = sc.next();
		System.out.println("Enter name to set");
		String name = sc.next();
		empNames.put(rollno, name);
	}
	public void printNames() {
		Collection<String> names = empNames.values();
		System.out.println("Print All Names:");
		System.out.println(names);
	}
	public void getName(String key) {
		System.out.println("Getting name" + empNames.get(key));
	}
	public void printNamesKeySet() {
		Set<String> set = empNames.keySet();
		Collection<String> names = empNames.values();
		System.out.println("Print All Keys and Names");
		for (String str: set) {
			System.out.println("Key: " + str + "\tValue: "+ empNames.get(str));
		}
	}
	
	public void printSize() {
		System.out.println("Size: "+empNames.size());
	}
	public void remove(String key) {
		empNames.remove(key);
	}
	
	
	
}
