package new_coder;

public class Kengbi8 {
	
	static Boolean foo(char c) {
		System.out.println(c);
		return true;
	}
	
	public static void main(String[] args) {
		int i = 0;
		for(foo('A');(foo('B') && i<2); foo('C')) {
			i++;
			foo('D');
		}
	}
}



// ABDCBDCB