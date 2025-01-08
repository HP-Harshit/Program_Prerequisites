//Q3 Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula:
//Solution :
import java.util.*;
class Fahrenheit{ //class Fahrenheit
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		int celsius = sc.nextInt(); // 1 input variable for temperature in Celsius 
		float fahrenheit =  (celsius * 9/5) + 32; // conversion to Fahrenheit
		System.out.println("Temperature in Fahrenheit is  "+ fahrenheit); // Temperature in Fahrenheit
		}
}