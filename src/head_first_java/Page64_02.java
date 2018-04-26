package head_first_java;

class Page64_02 {
	String name;

	public static void main(String[] args) {
		Page64_02[] h = new Page64_02[3]; // *
		int z = 0;

		while (z < 4) { // * ArrayIndexOutOfBoundsException
			z++;
			h[z] = new Page64_02();
			h[z].name = "Bioble";
			if (z == 1) {
				h[z].name = "Bieber";
			}
			if (z == 2) {
				h[z].name = "Justin";
			}
		}

		System.out.println(h[z].name + "is a good Hobbit name");

	}

}
