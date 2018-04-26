package head_first_java;

import java.io.*;

public class GameHelper {
	
	public String getUserInput(String str) {
		String inputLine = null;
		
		System.out.println(str + " ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			inputLine = reader.readLine();
			
			if(inputLine.length() == 0) {
				return null;
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return inputLine;
		
	}

}
