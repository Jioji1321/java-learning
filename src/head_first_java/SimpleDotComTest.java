package head_first_java;

import java.util.ArrayList;

public class SimpleDotComTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameHelper gh = new GameHelper();

		SimpleDotCom sdc = new SimpleDotCom();

		int numOfGuesses = 0;

		// 创建战舰位置
		int firstNum = (int) (Math.random() * 5);
		
		ArrayList<Integer> local = new ArrayList<Integer>();
		int i = 0;
		
		while(i<3) {
			local.add(firstNum++);
			i++;
		}
		
		for(int x : local) {
			System.out.println(x);
		}
		
		sdc.setLocalCells(local);
		
		
		
		
//		int[] location = { firstNum, firstNum + 1, firstNum + 2 };
//		sdc.setLocationCells(location);

		boolean isAlive = true;

		while (isAlive) {
			String userGuess = gh.getUserInput("Please input a place:");
			
//			String result = sdc.checkYourself(userGuess);
			String res = sdc.checkUrself(userGuess);
			
			numOfGuesses++;

//			if ("kill".equals(result)) {
//				isAlive = false;
//				System.out.println("You try " + numOfGuesses + "times.");
//			}
			
			if ("kill".equals(res)) {
				isAlive = false;
				System.out.println("You try " + numOfGuesses + "times.");
			}

		}

	}

}
