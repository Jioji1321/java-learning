package head_first_java;

public class TestBoxing {
	Integer i;
	int j;

	public static void main(String[] args) {
		TestBoxing tb = new TestBoxing();
		tb.go();

	}

	public void go() {
		i = j;
		System.out.println(i);
		System.out.println(j);

	}
}
