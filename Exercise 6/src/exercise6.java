/***********************
 * Name: Armando Dollia*
 * Date: 10/27/2014	   *
 ***********************/

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JOptionPane;


public class exercise6 {

	public static void main(String[] args) throws HeadlessException, ParseException {
		Integer day, dayB, diff;
		String color, name, firstName, match, outString;
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyy" , Locale.US);
		final String RED = "RED";

		//create and instantiate the Calendar class
		Calendar time = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		
		//ask for input and parse it
		name = JOptionPane.showInputDialog("What is your name?");
		color = JOptionPane.showInputDialog("What is your favorite color?").toUpperCase();
		
		
		if (name.indexOf(' ') != -1){
		firstName = name.substring(0, name.indexOf(' '));
		}
		else{
			firstName = name.substring(0, name.length());
		}
		
		
		//ask the user for input and convert to a calendar format
		birthday.setTime(formatter.parse(JOptionPane.showInputDialog("What is your birthdate?")));
		
		//store birthday date values in separate integers
		dayB =  birthday.get(Calendar.DAY_OF_YEAR);
		day = time.get(Calendar.DAY_OF_YEAR);

		//figure out the day difference
		diff = dayB - day;
		
		//check to see if colors match
		if  (color == RED){
			match = "do";
		}
		else{
			match = "do not";
		}
		
		//create initial part of the out string
		outString = "Hello " + firstName + "!\n" + "We " + match + " prefer the same color.\n";
		
		//check to see if birthday already passed
		if (diff < 0){
			JOptionPane.showMessageDialog(null, outString + "Your birthday is " + (365+diff) + " days from today");
		}
		else if (diff > 0){
			JOptionPane.showMessageDialog(null, outString + "Your birthday is " + diff + " days from today");
		}
		else if (diff == 0){
			JOptionPane.showMessageDialog(null, outString + "Happy Birthday!");
		}
		

	}

}
