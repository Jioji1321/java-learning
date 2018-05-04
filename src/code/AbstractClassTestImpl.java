package code;

public class AbstractClassTestImpl extends AbstractClassTest {

	@Override
	String say() {
		// TODO Auto-generated method stub
		System.out.println("abstract say");
		return null;
	}

	@Override
	void sayWords() {
		// TODO Auto-generated method stub
		System.out.println("abstract sayWords");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassTest a = new AbstractClassTestImpl();
		a.say();
		a.sayWords();
	}

}
