import java.util.*;
class Cylinder {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of radius: ");
		int radius = sc.nextInt();
		System.out.println("Enter the value of height: ");
        	int height = sc.nextInt(); 

		// Calculating the Volume of Cylinder	
		double volume =  (3.14*radius*radius)*height;

		System.out.println("Volume of Cylinder: "+ volume);
		sc.close();
		}
}