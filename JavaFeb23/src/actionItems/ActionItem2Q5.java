package actionItems;

public class ActionItem2Q5 {

	public static void main(String[] args) {
		
		// Using FOR LOOP
		
		int num = 15, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
        	sum += i;
        }

        System.out.println("Sum = " + sum);
        
        
        //Using WHILE LOOP
        
        int num2 = 15, i = 1, sum2 = 0;

        while(i <= num2)
        {
            sum2 += i;
            i++;
        }

        System.out.println("Sum = " + sum2);
        
        // Using DO WHILE LOOP
        
        int sum3 = 0;
        int a = 0;
       
        do {
            sum3 += a;
            a++;
        } while (a <= 15);
       
        System.out.println("Sum = " + sum3);
		
		
	

	}

}
