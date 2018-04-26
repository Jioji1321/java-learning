package code;

public class StringBuffer_String_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		System.out.println(str);

		String str2 = str + " World";
		System.out.println("str2 = " + str2);

		System.out.println("str == str2 = " + (str == str2));

		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("sb = " + sb);

		StringBuffer sb2 = sb.append(" World");
		System.out.println("sb2 = " + sb2);

		System.out.println("\"sb == sb\" = " + (sb == sb2));

		// System.out.println(str == sb); // 类型不同无法直接比较
		
		boolean result = (sb.toString() == str);
		System.out.println(result);

		System.out.println("str.equals(sb) = " + str.equals(sb));

		System.out.println("str2.equals(sb2) = " + str2.equals(sb2));
	}

}
