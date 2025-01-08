import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        // Convert kilometers to miles
        double miles = kilometers * 0.621371;
        
        System.out.println("The distance in miles is: " + miles);
        
        scanner.close();
    }
}
