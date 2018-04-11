package code;

/**
 * 单例模式
 * @author zhouzhiliwen
 * 
 */

class Single {
	
	int id;
	private static Single s = null;
	
	private Single(int id) {
		this.id = id;
	}
	
	public static Single getInstance(int id) {
		if(s == null) {
			s = new Single(id);
		}
		return s;
	} 
}	
	
public class SingleDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s1 = Single.getInstance(5);
		System.out.println(s1);
		
		Single s2 = Single.getInstance(10);
		System.out.println(s2);
		
		
	}
}
	
	

