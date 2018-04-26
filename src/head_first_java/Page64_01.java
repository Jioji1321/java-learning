package head_first_java;

class Books {
	String title;
	String author;
}

class Page64_01 {
	public static void main(String[] args) {
		Books[] myBooks = new Books[3];

		int x = 0;
		
		//需要创建Books对象,有对象才能够使用其中的属性
		myBooks[0] =new Books();
		myBooks[1] =new Books();
		myBooks[2] =new Books();

		myBooks[0].title = "Thinking in Java"; // NullPointerException
		myBooks[0].author = "Unknown";

		myBooks[1].title = "Head First Java";
		myBooks[1].author = "Unknown";

		myBooks[2].title = "Scala";
		myBooks[2].author = "Unknown";

		while (x < 3) {
			System.out.println(myBooks[x].title + " by " + myBooks[x].author);
			x++;
		}

	}
}
