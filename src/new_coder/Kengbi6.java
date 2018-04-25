package new_coder;

public class Kengbi6 {
	public static void main(String[] args) {
		boolean b = true ? false : true == true ? false : true;
		// boolean b = true ? false : (true == true) ? false : true;
		// boolean b = true ? false : false;
		// boolean b = false;

		System.out.println(b);
	}
}

/**
 * == 优先级高于 三目运算符，先判断 true == true，此时返回为 true, 这时表达式为 boolean b =
 * true?false:true?false:true 此时三目运算符从右向左执行,true?false:true，返回false 这时表达
 * 式为boolean b = true?false:false; 结果为：boolean b = false ;
 * 
 * 
 */
