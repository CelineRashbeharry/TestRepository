package methodDemo;

public class TestCalculator {

	public static void main(String[] args) {


		// created an object of calculator class
		
		Calculator calc = new Calculator();
		
		System.out.println("Addition of a and b is: " +calc.doAdd(25, 12));

		System.out.println("Subtraction of a and b is: " +calc.doSub(25, 12));
		
		
		
		
		System.out.println(calc.concatStr("Hello", "I am learning Java!"));
		
		TestCalculator obj = new TestCalculator();
		System.out.println(obj.doMul(54, 95));
		System.out.println(doDiv(34, 7));
		obj.sound();
		obj.dogSound();
		System.out.println(Calculator.do3Mul(4, 722, 67));
		
		
		
	}
	
	public int doMul (int a, int b) {
		
		int c = a * b;
		System.out.println(" I am doing acition in duMul class");
		return c;
		
	}

	public static double doDiv(int a, int b) {
		double c = a/b;
		return c;
		
	}
	
	
	public void sound () {
		System.out.println("Ths is a generic sound");
		
		

	}
	
	
	public void dogSound() {
		sound();
		System.out.println("This is also a dog sound");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
