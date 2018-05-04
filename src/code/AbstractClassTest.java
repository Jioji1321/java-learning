package code;

abstract class AbstractClassTest {
	public String name;
	private String address;
	
	abstract String say();
	abstract void sayWords();
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
