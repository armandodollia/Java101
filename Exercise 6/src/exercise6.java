import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JOptionPane;


public class exercise6 {

	public static void main(String[] args) throws HeadlessException, ParseException {
		Integer day, dayB, diff;
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyy" , Locale.US);
		final String COLOR = "RED";

		//create and instantiate the Calendar class
		Calendar time = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		
		//ask the user for input and convert to a calendar format
		birthday.setTime(formatter.parse(JOptionPane.showInputDialog("What is your birthdate?")));
		

		
		//store birthday date values in separate integers
		dayB =  birthday.get(Calendar.DAY_OF_YEAR);
		day = time.get(Calendar.DAY_OF_YEAR);

		//figure out the day difference
		diff = dayB - day;
		
		if (diff < 0){
			JOptionPane.showMessageDialog(null, "Your birthday is " + (365+diff) + " days from today");
		}
		else if (diff > 0){
			JOptionPane.showMessageDialog(null, "Your birthday is " + diff + " days from today");
		}
		else if (diff == 0){
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		

	}

}
