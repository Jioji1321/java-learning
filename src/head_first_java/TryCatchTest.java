package head_first_java;

public class TryCatchTest {
	public static void main(String[] args) {
		OnPurpose op = new OnPurpose();
		try {
			op.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class OnPurpose {
	int a = 100;
	int b = 0;

	public void start() throws Exception {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			start();
		}
	}

	public void stop() {
		System.out.println("stop!");
	}

	public void fix() {
		System.out.println("fixing...");
	}
}
