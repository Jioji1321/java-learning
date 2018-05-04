package head_first_java;

import java.util.ArrayList;

public class DotComBust {
	
	private ArrayList<DotCom> local;
	private GameHelper helper = new GameHelper();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		DotCom one = new DotCom();
		one.setName("one.com");
		DotCom two = new DotCom();
		two.setName("two.com");
		DotCom three = new DotCom();
		three.setName("three.com");
		
		local.add(one);
		local.add(two);
		local.add(three);
		
		System.out.println(".........");
		System.out.println(".........");
		System.out.println(".........");
		
		
		
		
	}

}
