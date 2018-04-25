package new_coder;

public class HelloB extends HelloA {

	public HelloB() {
		System.out.println("class HelloB");
	}

	static {
		System.out.println("class HelloB static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloB();
	}

}

class HelloA {
	public HelloA() {
		System.out.println("class HelloA");
	}

	static {
		System.out.println("class HelloA static");
	}
}
