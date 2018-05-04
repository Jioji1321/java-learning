package code;

public class InterfaceTestImpl implements InterfaceTest {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("interfaceTest say");
	}

	@Override
	public String sayWords() {
		// TODO Auto-generated method stub
		System.out.println("interfaceTest sayWords");
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest i = new InterfaceTestImpl();
		i.say();
		i.sayWords();
		
	}


}
