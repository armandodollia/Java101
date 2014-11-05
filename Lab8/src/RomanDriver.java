import javax.swing.JOptionPane;


public class RomanDriver {

	public static void main(String[] args) {
		RomanConverter romanConverter = new RomanConverter();
		romanConverter.RomanToDecimal(JOptionPane.showInputDialog("Please input a Roman Numeral"));

		JOptionPane.showMessageDialog(null, "The roman numeral: " + romanConverter.getRoman() + " equals " + romanConverter.getNumber());
	}

}
