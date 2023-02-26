package actionItems;

public class Loops {

	public static void main(String[] args) {

		var city = "brooklyn";
		
		for(var a = 1; a<=3; a++) {
			System.out.println("I am from " + city);
		}

		System.out.println("---------");
		
		
		int i = 1; 
        while (i < 4) {
            System.out.println("I am from " +city);
            i++;
        }
        
		System.out.println("---------");
		
        int b = 1;
        do {
            System.out.println("I am from " + city);
            b++;
          } while(b <= 3);
		
		
		
		
	}

}
