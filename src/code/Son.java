package code;

public class Son extends Father {
	static {
		System.out.println("子类静态代码块");
	}
	
	public Son() {
//		say();
		System.out.println("子类构造函数");
	}
	
	public void say() {
		System.out.println("子类非静态方法");
	}
	
	@Override
	public void superHero() {
		// TODO Auto-generated method stub
		super.superHero();
	}

	public static void main(String[] args) {
		new Son().superHero();
	}
}

