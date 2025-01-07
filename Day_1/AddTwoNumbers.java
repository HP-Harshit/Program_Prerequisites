import java.util.Scanner;

public class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking two numbers as input from the user
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();

		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();

		//Calculating the sum
		int sum = num1+num2;

		System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);

		sc.close();
	}
}