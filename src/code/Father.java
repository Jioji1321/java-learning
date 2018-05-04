package code;

public class Father {
	
	static {
		System.out.println("父类静态代码块");
	}
	
	public Father() {
//		say();
		System.out.println("父类构造函数");
	}
	
	public void say() {
		System.out.println("父类非静态方法");
	}
	
	public void superHero() {
		System.out.println("superhero!");
	}

}
