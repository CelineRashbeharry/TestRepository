package encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		obj.pinNumber = 3456;
		obj.drawMoney(12345678, 3456, 1000);
		

		
		
		
		// Unchecked exceptions
		int [] number = {5, 9, 2, 78};
		System.out.println(number [4]);
		
		int a = 5, result;
		result = 5/0;
		System.out.println (result);
		
		
		
		
		
		
		
		
	}

}
