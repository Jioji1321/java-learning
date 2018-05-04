package code;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "str";
		StringBuffer sb = new StringBuffer("str");
		
		str1 += "ing";
		sb.append("ing");
		
		System.out.println(str1);
		System.out.println(sb);
		
		
		StringBuffer str2 = new StringBuffer(str1).reverse();
		System.out.println(str2);
		
		String str3 = str2.toString();
		System.out.println(str3 instanceof String);
	}
	
	

}
