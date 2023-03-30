package Three;
import java.util.*;
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("durian");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		System.out.println("First Element: "+ set.first());
		System.out.println("Last Element: "+ set.last());

		System.out.println();
		System.out.println("Size: "+ set.size());
		set.remove("apple");
		System.out.println("Size: "+ set.size());

		
		
		
	}

}
