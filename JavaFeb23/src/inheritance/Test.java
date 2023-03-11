package inheritance;

public class Test implements InterfaceDemo{
	


	public static void main(String[] args) {
//		Test obj = new Test();
//		obj.makeSound();
		
		ConstructorDemo obj1 = new ConstructorDemo("Celine", 1);
	
		System.out.println(obj1.getName());
		System.out.println(obj1.getRollNo());
	}

	public void makeSound() {
		
		System.out.println("Please sing a sweet song");
	}
	
}
