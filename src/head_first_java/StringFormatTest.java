package head_first_java;

public class StringFormatTest {
	public static void main(String[] args) {
		String str = String.format("%,d", 10000000);
		System.out.println(str);

		System.out.println(String.format("%,.4f", 314159.2657));

		System.out.println(String.format("%.2f", 31415.59657));

		double one = 239.171819;
		int two = 796;

		System.out.println(String.format("this is two numbers : %.3f and %d .", one, two));
	}
}
