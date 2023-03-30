package pkg;

@FunctionalInterface
interface StringCalc{
	public int lengths(String s);
}

public class LengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalc s1 = (String s)->{
			return s.length();
		};
		
		System.out.println(s1.lengths("1234"));
		System.out.println(s1.lengths("12345"));
		System.out.println(s1.lengths("123456"));
		System.out.println(s1.lengths("1234567"));
	
	}

}
