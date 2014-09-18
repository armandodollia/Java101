/***********************
 * Name: Armando Dollia*
 * Date: 09/11/2014	   *
 ***********************/
import java.util.*;
import java.io.*;
public class exercise916 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner inFile = new Scanner(new FileReader("input.txt"));
		PrintWriter outFile = new PrintWriter("output.txt");
		
		String month1, month2, month3;
		String year1, year2, year3, day1, day2, day3;
		
		while(inFile.hasNext())
		{
			month1 = inFile.next();
			day1 = inFile.next();
			year1 = inFile.next();
			month2 = inFile.next();
			day2 = inFile.next();
			year2 = inFile.next();
			month3 = inFile.next();
			day3 = inFile.next();
			year3 = inFile.next();
			
			outFile.println(month1 + " " + month2 + " " + month3);
			//outFile.println(" " + day1 + "     " + day2 + "    " + day3);
			outFile.printf("%2s%5s%5s%n", day1, day2, day3);
			outFile.println(year1 + " " + year2 + " " + year3);
		}

			outFile.close();
			inFile.close();
	}

}
