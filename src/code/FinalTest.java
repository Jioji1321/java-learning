package code;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i;
		
		i = 50;
		
		System.out.println(i);
		
		/*i = 100; // Final修饰的基本类型变量不能够被重新定义
		
		System.out.println(i);*/
		
		final String str;
		
		str = "Hello World";
		
		System.out.println(str);
		
		/*str += " , Goodbye Hell";
		
		System.out.println(str);*/
		
		/*str = "Goodbye Hell";
		
		System.out.println(str);*/

	}

}
