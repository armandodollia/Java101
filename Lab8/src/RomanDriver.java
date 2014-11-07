import javax.swing.JOptionPane;


public class RomanDriver {

	public static void main(String[] args) {
		
		Integer romanInt = null;
		String roman = null;
		
		RomanConverter romanConverter = new RomanConverter();
		roman = JOptionPane.showInputDialog("Input an Integer or a Roman Numeral for conversion");
		
		try{
			romanInt = Integer.parseInt(roman);
		}
		catch(NumberFormatException x){

		}
		
		if(romanInt != null){
			romanConverter.DecimanToRoman(romanInt);
		}
		else{
			romanConverter.RomanToDecimal(roman);
		}
		
		JOptionPane.showMessageDialog(null, romanConverter);
		
	}
}
