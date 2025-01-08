import java.util.*;
class SimpleInterest {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the principal amount: ");
		int principal = sc.nextInt(); 


		System.out.println("Enter the Rate of Interest: ");
        	float rate = sc.nextFloat();		

		System.out.println("Enter the time period : ");
        	int time  = sc.nextInt();	 
		
		// Calculating simple interest
		double si = (principal*rate*time)/100; 

		System.out.println("Simple Interest: "+ si);

		sc.close();
		}
}