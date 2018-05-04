package head_first_java;

public class PlayerTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Player.playerCount);
		Player p1 = new Player("Tiger Wood");
		System.out.println(Player.playerCount);
		
		p1.hhh = "HHH";
		
		Player.sayHHH();
		
		p1.sayOOO();
		
		p1.sayHHH(); 
		
		System.out.println(p1.playerCount);
	}

}

class Player{
	static int playerCount = 0;
	private String name;
	public String hhh;
	
	public static final String NAME = "name"; //常量的声明
	
	
	
	public Player(String name) {
		this.name = name;
		playerCount++;
	}
	
	public static void sayHHH() {
		System.out.println("HHH");
	}
	
	public void sayOOO() {
		System.out.println("OOO");
	}
	
	// 非静态函数可以使用静态资源，因为类加载的时候静态资源已经被初始化
	public void saySomething() {
		System.out.println(playerCount);
	}

	// 静态函数无法引用非静态资源，没有加载非静态资源
//	public static void sayNothing() {
//		System.out.println(hhh);
//	}
}
