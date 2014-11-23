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
		Integer number;
		String output;
		Integer num1 = 0, num2 = 0, num3 = 0;
		
		//Prompt user for input
		number = Integer.parseInt(JOptionPane.showInputDialog("Please input a 3 digit integer"));
		
		//Parse digits from string
		for(int i = 1; i <= 3; i++){
			if(i == 1){
				num1 = number % 10;
			}
			else if(i == 2){
				num2 = number % 10;
			}
			else if(i == 3){
				num3 = number % 10;
			}
			number /= 10;
		}
		
		output = "The permutations are:\n" + num1 + num2 + num3 + "\n"
				 + num1 + num3 + num2 + "\n" + num2 + num1 + num3 + "\n"
				 + num2 + num3 + num1 + "\n" + num3 + num1 + num2 + "\n"
				 + num3 + num2 + num1;
		JOptionPane.showMessageDialog(null, output, "String Permutations", JOptionPane.INFORMATION_MESSAGE);
	}

}
