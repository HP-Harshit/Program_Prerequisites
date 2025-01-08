import java.util.*;
class Circle {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of radius: ");
		float radius = sc.nextFloat();
		
		//Calculating area of a circle
		double area =  (3.14*radius*radius);

		System.out.println("Area of Circle: "+ area);
	}
}