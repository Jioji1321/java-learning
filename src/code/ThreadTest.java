package code;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();

		System.out.println("主进程ID：" + Thread.currentThread().getId());
		MyThread1 mt1 = new MyThread1("thread1");
		mt1.start();// 它的作用是启动一个新线程。
		/**
		 * 通过start()方法来启动的新线程，处于就绪（可运行）状态，并没有运行，一旦得到cpu时间片，
		 * 就开始执行相应线程的run()方法，这里方法run()称为线程体，它包含了要执行的这个线程的内容，
		 * run方法运行结束，此线程随即终止。start()不能被重复调用。用start方法来启动线程，真正实现了多线程运行，
		 * 即无需等待某个线程的run方法体代码执行完毕就直接继续执行下面的代码。这里无需等待run方法执行完毕， 即可继续执行下面的代码，即进行了线程切换。
		 * 
		 */

		MyThread1 mt2 = new MyThread1("thread2");
		mt2.run();
		/**
		 * 通过run()方法调用不会创建新的线程 run()就和普通的成员方法一样，可以被重复调用。
		 * 如果直接调用run方法，并不会启动新线程！程序中依然只有主线程这一个线程，
		 * 其程序执行路径还是只有一条，还是要顺序执行，还是要等待run方法体执行完毕后才可继续执行下面的代码，这样就没有达到多线程的目的。
		 * 
		 */

	}

}

class MyThread extends Thread {
	private static int i = 0;

	public MyThread() {
		i++;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("主动创建的第" + i + "个线程");
	}
}

class MyThread1 extends Thread {
	private String name;

	public MyThread1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("name: " + name + " 子进程ID：" + Thread.currentThread().getId());
	}

}
