package new_coder;

public class Kengbi16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FileAddr = "com.jd.".replaceAll(".", "/") + "Myclass.class";
		String FileAddr1 = "com.jd.".replaceAll("\\.", "/") + "Myclass.class";
		System.out.println(FileAddr);
		System.out.println(FileAddr1);
	}

}

// 由于replaceAll方法的第一个参数是一个正则表达式，而"."在正则表达式中表示任何字符，
// 所以会把前面字符串的所有字符都替换成"/"。如果想替换的只是"."，那么久要写成"\\.".
