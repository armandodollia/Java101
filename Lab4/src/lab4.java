/***********************
 * Name: Armando Dollia*
 * Date: 09/23/2014	   *
 ***********************/
import javax.swing.JOptionPane;
public class lab4 {

	public static void main(String[] args) 
	{
		String sex, output;
		double weight, wrist, waist, hip, forearm, fat;

		sex = JOptionPane.showInputDialog("Are you Male or Female?");
		sex = sex.toUpperCase();
		sex = sex.substring(0,1);

		if(sex.compareTo("F") == 0)
		{
			weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
			wrist = Double.parseDouble(JOptionPane.showInputDialog("Enter your wrist measurement at its fullest point"));
			waist = Double.parseDouble(JOptionPane.showInputDialog("Enter your waist measurement at the navel"));
			hip = Double.parseDouble(JOptionPane.showInputDialog("Enter your hip measurement at its fullest point"));
			forearm = Double.parseDouble(JOptionPane.showInputDialog("Enter your forearm measurement at its fullest point"));
				
			fat = ((weight-(((weight*.732)+8.987)+(wrist/3.14)-(waist*.157)-(hip*.249)+(forearm*.434)))*100)/weight;
			output = String.format("Your body fat percentage is: %.2f%%", fat);
			JOptionPane.showMessageDialog(null, output, "String Permutations", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
			waist = Double.parseDouble(JOptionPane.showInputDialog("Enter your waist measurement at the navel"));
			fat = ((weight-(((weight*1.082)+94.42)-(waist*4.15)))*100)/weight;
			output = String.format("Your body fat percentage is: %.2f%%", fat);
			JOptionPane.showMessageDialog(null, output, "String Permutations", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}