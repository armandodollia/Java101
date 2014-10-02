import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class isVowel extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel character, vowels;
	private JTextField charInput, vowelOutput;
	private JButton finder, exit;
	private static final int width = 500;
	private static final int height = 200;
	
	//create the JFrame class
	public isVowel(){
		//set the layout
		setTitle("Vowel Detector");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(3, 2));
		
		//create label field
		character = new JLabel("Type in some characters: ", SwingConstants.RIGHT);
		vowels = new JLabel("The number of vowels is: ", SwingConstants.RIGHT);
		
		//create text field
		charInput = new JTextField(10);
		vowelOutput = new JTextField(10);
		
		//create calculate button
		finder = new JButton("Give me the Vowels!");
		FinderButtonHandler finderHandler = new FinderButtonHandler();
		finder.addActionListener(finderHandler);
		
		//create exit button
		exit = new JButton("Exit");
		ExitButtonHandler exitHandler = new ExitButtonHandler();
		exit.addActionListener(exitHandler);
		
		//add panes
		pane.add(character);
		pane.add(charInput);
		pane.add(vowels);
		pane.add(vowelOutput);
		pane.add(finder);
		pane.add(exit);
		
		//set size of window and display it
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//begin finder button class
	public class FinderButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			int counter = 0;
			String letters = charInput.getText();
			int length = letters.length();
			
			for(int i = 0; i<length; i++){
				String letter = letters.toUpperCase().substring(i, i+1);
				if(letter.equals("A") || letter.equals("E")	|| letter.equals("I") || letter.equals("O")	|| letter.equals("U") || letter.equals("Y")){
					counter++;
				}

				vowelOutput.setText("" + counter);
			}
			
		}
	}
	
	//begin exit button class
	public class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		new isVowel();
		

	}

}
