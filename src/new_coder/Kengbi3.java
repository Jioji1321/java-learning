package new_coder;

public class Kengbi3 {
	static int i = 5;
	
	static {
		i = 10;
	}

	public static void main(String[] args) {
		System.out.println("i = " + i);
	}

	static {
		i /= 3;
	}

}
