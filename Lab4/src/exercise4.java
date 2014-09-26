/***********************
 * Name: Armando Dollia*
 * Date: 09/23/2014	   *
 ***********************/
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class exercise4 {

	public static void main(String[] args) 
	{
		String sex, output, repeat = "Y";
		double weight, wrist, waist, hip, forearm, fat;
		
		while(repeat.equals("Y"))
		{
			sex = JOptionPane.showInputDialog("Are you Male or Female?").toUpperCase().substring(0,1);

			if(sex.equals("F"))
			{
				//Create text fields and set width
				JTextField weightField = new JTextField(5);
				JTextField wristField = new JTextField(5);
				JTextField waistField = new JTextField(5);
				JTextField  hipField = new JTextField(5);
				JTextField forearmField = new JTextField(5);
				JPanel measurePanel = new JPanel(); //Create window and store it into an object
				
				measurePanel.add(new JLabel("Weight in lbs"));
				measurePanel.add(weightField);
				measurePanel.add(Box.createHorizontalStrut(5));
				measurePanel.add(new JLabel("Wrist"));
				measurePanel.add(wristField);
				measurePanel.add(Box.createHorizontalStrut(5));
				measurePanel.add(new JLabel("Waist"));
				measurePanel.add(waistField);
				measurePanel.add(Box.createHorizontalStrut(5));
				measurePanel.add(new JLabel("Hip"));
				measurePanel.add(hipField);
				measurePanel.add(Box.createHorizontalStrut(5));
				measurePanel.add(new JLabel("Forearm"));
				measurePanel.add(forearmField);
				measurePanel.add(Box.createHorizontalStrut(5));
				
				int result = JOptionPane.showConfirmDialog(null, measurePanel, 
			               "Please Enter Measurements", JOptionPane.OK_CANCEL_OPTION);
				
				weight = Double.parseDouble(weightField.getText());
				wrist = Double.parseDouble(wristField.getText());
				waist = Double.parseDouble(waistField.getText());
				hip = Double.parseDouble(hipField.getText());
				forearm = Double.parseDouble(forearmField.getText());
				//weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
				//wrist = Double.parseDouble(JOptionPane.showInputDialog("Enter your wrist measurement at its fullest point"));
				//waist = Double.parseDouble(JOptionPane.showInputDialog("Enter your waist measurement at the navel"));
				//hip = Double.parseDouble(JOptionPane.showInputDialog("Enter your hip measurement at its fullest point"));
				//forearm = Double.parseDouble(JOptionPane.showInputDialog("Enter your forearm measurement at its fullest point"));
				
				fat = ((weight-(((weight*.732)+8.987)+(wrist/3.14)-(waist*.157)-(hip*.249)+(forearm*.434)))*100)/weight;
				output = String.format("Your body fat percentage is: %.2f%%", fat);
				JOptionPane.showMessageDialog(null, output, "Body Fat", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JTextField weightField = new JTextField(5);
				JTextField waistField = new JTextField(5);
				JPanel measurePanel = new JPanel();
				measurePanel.add(new JLabel("Weight in lbs"));
				measurePanel.add(weightField);
				measurePanel.add(Box.createHorizontalStrut(5));
				measurePanel.add(new JLabel("Waist"));
				measurePanel.add(waistField);
				measurePanel.add(Box.createHorizontalStrut(5));
				
				int result = JOptionPane.showConfirmDialog(null, measurePanel, 
			               "Please Enter Measurements", JOptionPane.OK_CANCEL_OPTION);
				
				weight = Double.parseDouble(weightField.getText());
				waist = Double.parseDouble(waistField.getText());
				
				//weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
				//waist = Double.parseDouble(JOptionPane.showInputDialog("Enter your waist measurement at the navel"));
				fat = ((weight-(((weight*1.082)+94.42)-(waist*4.15)))*100)/weight;
				output = String.format("Your body fat percentage is: %.2f%%", fat);
				JOptionPane.showMessageDialog(null, output, "Body Fat", JOptionPane.INFORMATION_MESSAGE);
			}
			repeat = JOptionPane.showInputDialog("Do you want to try again?");
			repeat = repeat.toUpperCase();
			repeat = repeat.substring(0,1);
		}
	}

}