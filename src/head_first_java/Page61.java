package head_first_java;

public class Page61 {
	public static void main(String[] args) {
		Dog[] pets = new Dog[10];
		
		pets = new Dog[7];
		
		pets[0] = new Dog();
		pets[1] = new Dog();
		
		System.out.println(pets[0]); //head_first_java.Dog@1eb44e46
		System.out.println(pets[2]); //null
		
		Dog fido = new Dog();
		fido.name = "Fido";
		
		fido.bark();
		fido.eat();
		fido.chaseCat();
		
		pets[0].name = "Black";
		pets[0].call();
		pets[0].bark();
		
		pets[1].age = 3;
		pets[1].age();
		pets[1].chaseCat();
	}
}
