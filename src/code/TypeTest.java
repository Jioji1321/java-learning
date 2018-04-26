package code;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 1;
		int b = 2;
		long c = 3;
		
		calculate(a, b);
		
		//输入的参数类型与方法的参数列表不同，报编译错误
//		calculate(b, c);
//		calculate(a, c);
	}

	static int calculate(int a, int b) {
		return a + b;
	}

}
