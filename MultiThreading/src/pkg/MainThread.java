package pkg;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		synchronized (t) {
			System.out.println("Main thread is going to wait");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			System.out.println("Main Thread notified");
			System.out.println(t.total);
		}
	}

}
