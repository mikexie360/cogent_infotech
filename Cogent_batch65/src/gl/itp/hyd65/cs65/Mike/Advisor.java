package gl.itp.hyd65.cs65.Mike;

import java.util.Random;

public class Advisor {
	String[] message = new String[5];
	
	public Advisor() {
		message[0] = "Keep it up";
		message[1] = "You are doing good";
		message[2] = "Put in more effort";
		message[3] = "Almost there";
		message[4] = "Never say No";
	}
	
	public String getAdvice() {
		Random rand = new Random();
		int r = rand.nextInt(5);
		return message[r];
	}
}
