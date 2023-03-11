package encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		obj.pinNumber = 3456;
		obj.drawMoney(12345678, 3456, 1000);
		

	}

}
