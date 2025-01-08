import java.util.*;

class Rectangle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Length of Rectangle: ");
		float length =sc.nextFloat();

		System.out.println("Enter the Width of Rectangle: ");
        	float width  = sc.nextFloat();

		// Calculating the Perimeter
		double perimeter =2*(length+width);

		System.out.println("Perimeter of Rectangle: "+ perimeter);

		sc.close();
	}
}