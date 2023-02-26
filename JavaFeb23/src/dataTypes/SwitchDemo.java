package dataTypes;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * Switch Statement Syntax:
		 * 
		 * switch (expression) {
		 * Case Value1:{
		 * 	// Code to be executed
		 * }
		 * Break;
		 * Case Value2: {
		 * 	// Code to be executed
		 * }
		 * Break;
		 * Case Value3:{
		 * 	// Code to be executed
		 * }
		 * Break;
		 * 
		 * Default:
		 * 	//Code to be executed
		 * }
		 */
		
		int dayNumber = 3;
		
		switch (dayNumber) {
		case 1: {
			System.out.println("It's Monday");
		}
		break;
		case 2: {
			System.out.println("It's Tuesday");
		}
		break;
		case 3: {
			System.out.println("It's Wednesday");
		}
		break;
		case 4: {
			System.out.println("It's Thursday");
		}
		break;
		case 5: {
			System.out.println("It's Friday");
		}
		break;
		case 6: {
			System.out.println("It's Saturday");
		}
		break;
		case 7: {
			System.out.println("It's Sunday");
		}
		break;
		
		default:
			System.out.println("Sorry, not a day.");

		}

	}

}
