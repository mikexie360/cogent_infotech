package One;

public class MyThread extends Thread{
	public MyThread() {
		super();
	}
	@Override
	public void run() {
		System.out.println("Hello World Thread: " + Thread.currentThread().getId());
		for (int i = 0; i< 100; i++)
		{
			System.out.println(Thread.currentThread().getId() +"\t"+ i);
		}
	}
}
