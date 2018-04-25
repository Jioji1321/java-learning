package new_coder;

public class BufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("A");
		StringBuffer sb2 = new StringBuffer("B");

		operation(sb1, sb2);

		System.out.println(sb1 + " , " + sb2);

	}

	public static void operation(StringBuffer x, StringBuffer y) {
		x.append(y);

		System.out.println(x);

		y = x;

//		System.out.println(y);
	}

}
