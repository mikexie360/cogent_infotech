package One;

public class ThreadDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		m1.setPriority(MyThread.MIN_PRIORITY);
		m2.setPriority(MyThread.MAX_PRIORITY);
		m1.start();
		m2.start();
		
		
	}

}
