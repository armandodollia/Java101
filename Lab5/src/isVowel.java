import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class isVowel extends JFrame{
	private JLabel character;
	private JTextField charInput;
	private JButton finder, exit;
	private static final int width = 500;
	private static final int height = 200;
	
	public isVowel(){
		setTitle("Vowel Detector");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(2, 2));
		//create label field
		character = new JLabel("Type in some characters: ", SwingConstants.RIGHT);
		//create text field
		charInput = new JTextField(10);
		//create calculate button
		finder = new JButton("Give me the Vowels!");
		CalculateButtonHandler calcHandler = new CalculateButtonHandler();
		finder.addActionListener(calcHandler);
		exit = new JButton("Exit");
		
		pane.add(character);
		pane.add(charInput);
		pane.add(finder);
		pane.add(exit);
		
		setSize(width,height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		isVowel window = new isVowel();
		

	}

}
