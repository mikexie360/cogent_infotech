package Multithreading;
import java.util.*;
public class JoinDemo extends Thread{

	static int n,sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of 'N' numbers: ");
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();
		
		long start = System.currentTimeMillis();

		JoinDemo jd = new JoinDemo();
		jd.start();
		JoinDemo jd1 = new JoinDemo();
		jd1.start();
		
		try {
			jd.join();
			jd1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of first " +JoinDemo.n+" Number is "+JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("The total time taken is: " +(end-start)/1000 + " Seconds ");
	}
	@Override
	public void run() {
		for (int i = 1; i<=JoinDemo.n;i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
