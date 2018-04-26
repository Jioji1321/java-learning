package head_first_java;

public class Page89_02 {

	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("12:00");
		String str = c.getTime();
		System.out.println(str);

	}

}

class Clock {
	String time;

	public void setTime(String time) {
		this.time = time;
	}

	public String getTime() {
		return time;
	}

}
