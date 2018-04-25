package new_coder;

public class Kengbi10 {

	private static int i = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kengbi10 kb = new Kengbi10();
		kb.i++;
		Kengbi10 kb2 = new Kengbi10();
		kb2.i++;
		kb = new Kengbi10();
		kb.i++;
		Kengbi10.i--;

		System.out.println("i =" + i);
	}

}
