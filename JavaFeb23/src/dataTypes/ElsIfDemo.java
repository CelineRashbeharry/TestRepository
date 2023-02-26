package dataTypes;

public class ElsIfDemo {

	public static void main(String[] args) {
		
		
		/*
		 * Else if Syntax:
		 * 
		 * if (condition)
		 * {code to be executed
		 * } else if (condition)
		 * {
		 * Code to be executed
		 * } else
		 * {
		 * Code to be executed 
		 * }
		 * 
		 */

		int age = 16;
		
		if (age >= 18 && age <=80) {
			System.out.println("it is time to get married");
		} else if (age > 80 && age <=129)
		{
			System.out.println("pray you are in good health");
		}
		else
		{
			System.out.println("you are too young");
		}
		
		
	}

}
