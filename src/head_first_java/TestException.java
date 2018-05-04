package head_first_java;

public class TestException {
	
	public static void main(String[] args) {
		 String test = "no";
		 try {
			System.out.println("start try");
			doRicky(test);
			System.out.println("end try");
		} catch (ScaryException se) {
			// TODO: handle exception
			System.out.println("scary exception");
		}finally {
			System.out.println("finally");
		}
		 
		System.out.println("End of main");
	}
	
	static void doRicky(String test) throws ScaryException{
		System.out.println("start Ricky");
		if("yes".equals(test)) {
			throw new ScaryException();
		}
		System.out.println("end Ricky");
		return;
	}
}
