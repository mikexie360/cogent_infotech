package Seven;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private List<String> names;

	public Student() {
		names = new ArrayList<String>();
	}
	public void setName(String name) {
		names.add(name);
	}
	public void searchName(String name) {
		if (names.contains(name)) {
			System.out.println(name +" Student exists");
		} else {
			System.out.println(name +" Student does not exist");
		}
	}
	public void searchName(int n) {
		try {
			System.out.println(names.get(n));
		} catch (Exception e) {
			System.out.println("Could not find name");
		}
	}
	public void printNames() {
		System.out.println(names);
	}
	public void removeName(String stuName) {
		names.remove(stuName);
	}
}
