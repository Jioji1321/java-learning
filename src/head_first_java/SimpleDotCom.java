package head_first_java;

import java.util.ArrayList;

public class SimpleDotCom {
	private int[] locationCells;

	private ArrayList<Integer> localCells;

	private int numOfHit = 0;

	public void setLocationCells(int[] loc) {
		locationCells = loc;
	}

	public void setLocalCells(ArrayList<Integer> localCells) {
		this.localCells = localCells;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHit++;
				break;
			}
		}

		if (numOfHit == locationCells.length) {
			result = "kill";
		}

		System.out.println(result);
		return result;
	}

	public String checkUrself(String userInput) {
		int index = localCells.indexOf(Integer.parseInt(userInput));
		String res = "miss";

		if (index >= 0) {
			localCells.remove(index);

			if (localCells.isEmpty()) {
				res = "kill";
			} else {
				res = "hit";
			}
		}
		System.out.println(res);
		return res;

	}
}
