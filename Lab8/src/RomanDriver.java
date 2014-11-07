import javax.swing.JOptionPane;


public class RomanDriver {

	public static void main(String[] args) {
		RomanConverter romanConverter = new RomanConverter();
		romanConverter.DecimanToRoman(Integer.parseInt(JOptionPane.showInputDialog("Please input a Number under 4000")));

		JOptionPane.showMessageDialog(null, romanConverter);
	}

}
