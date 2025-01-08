import java.util.*;

class Average{
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt(); 


		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();		

		System.out.println("Enter the num3: ");
		int num3 = sc.nextInt();	 
		
		// Calculating Average
		double avg = (num1 + num2 + num3)/3; 

		System.out.println("The average is: "+ avg);

		sc.close();
		}
}