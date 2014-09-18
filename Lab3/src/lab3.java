/***********************
 * Name: Armando Dollia*
 * Date: 09/11/2014	   *
 ***********************/
import java.util.*;
import java.io.*;
public class lab3 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner inFile = new Scanner(new FileReader("Lab3_input.txt"));
		PrintWriter outFile = new PrintWriter("Lab3_Exercise_output.txt");
		
		//Declare variables
		String lastName, firstName;
		double salary, pctRaise, salaryFinal;
		
		//set up while loop
		while(inFile.hasNext()) //condition checks to see if there is anything in the input file
		{
		//Read information from input file
		lastName = inFile.next();
		firstName = inFile.next();
		salary = inFile.nextDouble();
		pctRaise = inFile.nextDouble();
		
		//Calculate final salary
		salaryFinal = salary + (salary * pctRaise / 100);
		
		//Write file
		outFile.printf("%s %s %.2f%n", lastName, firstName, salaryFinal);
		}
		
		//Close input/output methods
		outFile.close();
		inFile.close();

	}

}
