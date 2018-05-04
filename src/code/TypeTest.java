package code;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 1;
		int b = 2;
		long c = 3;

		calculate(a, b);

		// 输入的参数类型与方法的参数列表的类型不同，报编译错误
		// calculate(b, c);
		// calculate(a, c);
		
		int res = char2Int();
		System.out.println(res);    // char 可以转换为 int 类型，输出为该字符的 ASCII 码
	}

	static int calculate(int a, int b) {
		return a + b;
	}

	static int char2Int() {
		char c = 'A';
		return c;
	}

}
