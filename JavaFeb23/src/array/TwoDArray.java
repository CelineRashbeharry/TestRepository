package array;

public class TwoDArray {

	public static void main(String[] args) {

		int [][] my2DArray = new int [2][3];

		my2DArray [0][0] = 2;
		my2DArray [0][1] = 3;
		my2DArray [0][2] = 4;
		

		my2DArray [1][0] = 5;
		my2DArray [1][1] = 6;
		my2DArray [1][2] = 7;

		System.out.println(my2DArray [1][1]);
		System.out.println("Length of 2D Array.");
		
		int lengthFirstArray = my2DArray.length;
		int length2ndArray = my2DArray[0].length;
		
		System.out.println(lengthFirstArray);
		System.out.println(length2ndArray);
		
		System.out.println("Capturing all the values from a 2D.");
		
		
		for (int i=0; i<my2DArray.length; i++)
		{
			for (int j=0; j<my2DArray[0].length; j++) {
				System.out.println(my2DArray[i][j]);
			}
		}

	}

}
