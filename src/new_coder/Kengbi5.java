package new_coder;

class Two {
	Byte x; // 基本类型初始值为0，包装类初始值为null
}

public class Kengbi5 {
	public static void main(String[] args) {
		Kengbi5 kb = new Kengbi5();
		kb.start();
	}

	void start() {
		Two t = new Two();
		System.out.print(t.x + " ");
		Two t2 = fix(t);
		System.out.println(t.x + " " + t2.x);
	}

	Two fix(Two tt) {
		tt.x = 42;
		return tt;
	}
}
