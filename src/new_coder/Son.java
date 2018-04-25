package new_coder;

public class Son extends Base{
	public void method() {
		System.out.println("Son");
	}
	
	public void methodB() {
		System.out.println("SonB");
	}
	
	public static void main(String[] args) {
		Base base = new Son(); //生成的对象是Base类的，不是Son类的
		
		base.method();
		
//		base.methodB(); //Base类中不存在methodB()，编译报错
	}
}
