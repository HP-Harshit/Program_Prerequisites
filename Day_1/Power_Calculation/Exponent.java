import java.util.*;
import java.lang.Math;

class Exponent {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base value: ");
		float base =sc.nextFloat();


		System.out.println("Enter the exponent value: ");
        	float expo  = sc.nextFloat();

		// Calculating
		double power = Math.pow(base,expo);

		System.out.println("Exponent : "+ power);

		sc.close();
	}
}