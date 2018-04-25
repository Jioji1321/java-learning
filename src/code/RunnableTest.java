package code;

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("主进程id：" + Thread.currentThread().getId());
		MyRunnable mr = new MyRunnable();
		Thread thread = new Thread(mr);
		thread.start();
	}

}

class MyRunnable implements Runnable {

	public MyRunnable() {
		
	}

	@Override
	public void run() {
		System.out.println("子线程id：" + Thread.currentThread().getId());
	}

}