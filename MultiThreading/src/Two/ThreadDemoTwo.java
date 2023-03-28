package Two;

import Two.MyThread;

public class ThreadDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread r1 = new MyThread();
		MyThread r2 = new MyThread();
		
		Thread m1 = new Thread(r1);
		Thread m2 = new Thread(r2);
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);

		m1.start();
		m2.start();
		
		
	}

}
