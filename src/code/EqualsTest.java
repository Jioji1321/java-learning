package code;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 1;
		System.out.println(a == b);

		String stra = "abc";
		String strb = "abc";
		String strc = "ABC";

		System.out.println(stra == strb);
		System.out.println(stra.equals(strb));

		/**
		 * 
		 * 这就涉及到了内存中的常量池，常量池属于方法区的一部分，当运行到s1创建对象时，如果常量池中没有，
		 * 就在常量池中创建一个对象”abc”,第二次创建的时候，就直接使用，所以两次创建的对象其实是同一个对象，
		 * 它们的地址值相等。
		 * 
		 */
		
		System.out.println(stra == strc);
		System.out.println(stra.equals(strc));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
