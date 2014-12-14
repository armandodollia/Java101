import javax.swing.JOptionPane;


public class PyramidDriver {

	public static void main(String[] args) {
		
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
		PyramidMake pyramidMake = new PyramidMake(n);
		JOptionPane.showMessageDialog(null, pyramidMake);

	}

}
