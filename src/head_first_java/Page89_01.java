package head_first_java;

public class Page89_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orig = 42;
		Page89_01 p8901 = new Page89_01();
		int y = p8901.go(orig);
		System.out.println("orig = " + orig + " , y = " + y);

	}

	int go(int arg) {
		return arg * 2;
	}

}
