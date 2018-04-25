package new_coder;

public class Kengbi19 {
	public static Kengbi19 b1 = new Kengbi19();
	public static Kengbi19 b2 = new Kengbi19();
	
	{
		System.out.println("构造块");
	}
	
	static {
		System.out.println("静态块");
	}
	
	public static void main(String[] args) {
		Kengbi19 kb = new Kengbi19();
	}
	
}
