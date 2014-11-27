import javax.swing.JOptionPane;


public class VowelDriver {


	public static void main(String[] args) {
		VowelDetector vowelDetector = new VowelDetector();

		JOptionPane.showMessageDialog(null, "" + vowelDetector.Detector(JOptionPane.showInputDialog("Enter a word").toUpperCase()));
				}


}
