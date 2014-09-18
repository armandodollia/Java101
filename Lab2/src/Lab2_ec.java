/***********************
 * Name: Armando Dollia*
 * Date: 09/04/2014	   *
 ***********************/
import javax.swing.JOptionPane;
//perm1 = number.charAt(0)
//perm1 = number.substring(0,0)
public class Lab2_ec {

	public static void main(String[] args) 
	{
		//Declare variables
		String number, output;
		char num1, num2, num3;
		
		//Prompt user for input
		number = JOptionPane.showInputDialog("Please input a 3 digit integer");
		
		//Parse digits from string
		num1 = number.charAt(0);
		num2 = number.charAt(1);
		num3 = number.charAt(2);
		
		output = "The permutations are:\n" + num1 + num2 + num3 + "\n"
				 + num1 + num3 + num2 + "\n" + num2 + num1 + num3 + "\n"
				 + num2 + num3 + num1 + "\n" + num3 + num1 + num2 + "\n"
				 + num3 + num2 + num1;
		JOptionPane.showMessageDialog(null, output, "String Permutations", JOptionPane.INFORMATION_MESSAGE);
	}

}
