//Date: 08/26/2014
//Name: Armando Dollia
//This is a hello world program it does what every other hello world program does
import java.util.*;
public class lab1 {
	public static void main(String[] args)
	{
		int number1;
		int number2;
		int number3;
		int sum;
		//Creating new Scanner object named console
		Scanner console = new Scanner(System.in);
		System.out.println("Hello CSC 156!!!");
		System.out.print("Enter the first number: ");
		//Request user input for first number using the nextInt() method that parses the next integer input
		number1 = console.nextInt(); 
		System.out.print("Enter the second number: ");
		//Request user input for first number using the nextInt() method that parses the next integer input
		number2 = console.nextInt(); 
		System.out.print("Enter the third number: ");
		//Request user input for first number using the nextInt() method that parses the next integer input
		number3 = console.nextInt();
		sum = number1 + number2 + number3; //Sums all 3 numbers
		System.out.print("The sum of the numbers is " + sum + ".");

	}
}