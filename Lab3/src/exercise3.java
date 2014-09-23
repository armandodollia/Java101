/***********************
 * Name: Armando Dollia*
 * Date: 09/11/2014	   *
 ***********************/
import java.util.*;
import java.io.*;
public class exercise3 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner inFile = new Scanner(new FileReader("Lab3_input.txt"));
		PrintWriter outFile = new PrintWriter("Lab3_Exercise_output_10yr.txt");
		
		//Declare variables
		String dollar = "$", increase = "Increase", year = "Year ", lastName = "Last Name", firstName = "First Name";
		double salary, pctRaise, salaryNew, salaryOld;
		
		//print and format header
		outFile.printf("%-12s%-15s", firstName, lastName);
		for(int t=1; t<=10; t++)
		{
		outFile.printf("%-14s%-16s", year+t, increase);
		}
		outFile.println();
		
		//set up while loop for employee name and base salary
		while(inFile.hasNext()) //condition checks to see if there is anything in the input file
		{
			
			//Read information from input file
			lastName = inFile.next();
			firstName = inFile.next();
			salary = inFile.nextDouble();
			pctRaise = inFile.nextDouble();
			salaryNew = salary;
			outFile.printf("%-12s%-15s", firstName, lastName);

			int i=0;
			while(i<=9)
			{
				salaryOld = salaryNew;
				salaryNew = salary * Math.pow(1 + pctRaise / 100,i);
				//Write file
				outFile.printf("%s%-13.2f%s%-15.2f", dollar, salaryNew, dollar, (salaryNew - salaryOld));
				i++;
				}

		outFile.println();
		//Close input/output methods

		}
		outFile.close();
		inFile.close();
	}
}
