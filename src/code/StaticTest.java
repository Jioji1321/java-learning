package code;

public class StaticTest {

	static int i;
	
	public int test(int i) {
		i++;
		return i;
		
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		StaticTest test = new StaticTest();
		System.out.println(test.test(i));
		System.out.println(test.test(i));
	}
	
	

}
