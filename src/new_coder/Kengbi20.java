package new_coder;

public class Kengbi20 {
	public static void main(String[] args) {
		Object o = new Object() {
			public boolean equals(Object o) {
				return true;
			}
		};
		
		System.out.println(o.equals("Fred"));
	}
}
