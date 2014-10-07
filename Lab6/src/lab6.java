import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class lab6 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel input, output;
	private JTextField inputBox, outputBox;
	private JButton check, exit;
	private static final int width = 500;
	private static final int height = 200;
	
	public lab6(){
		//set the layout
		setTitle("Palindrome Checker");
		Container window = getContentPane();
		window.setLayout(new GridLayout(3,2));
		
		//create label field
		input = new JLabel("What would you like to check? ", SwingConstants.RIGHT);
		output = new JLabel("Is it a palindrome? ", SwingConstants.RIGHT);
		
		//text fields
		inputBox = new JTextField(10);
		outputBox = new JTextField(10);
		
		//check button
		check = new JButton("Check");
		CheckButtonHandler checkHandler = new CheckButtonHandler();
		check.addActionListener(checkHandler);
		
		//exit button
		exit = new JButton("Exit");
		ExitButtonHandler exitHandler = new ExitButtonHandler();
		exit.addActionListener(exitHandler);
		
		//add elements to window
		window.add(input);
		window.add(inputBox);
		window.add(output);
		window.add(outputBox);
		window.add(check);
		window.add(exit);
		
		//set window size and visibility
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//create check button class
	public class CheckButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			String word = inputBox.getText();
			palindromeHelper test = new palindromeHelper(word);
			
			if(test.getTest()){
				outputBox.setText("Yes");
			}
			else{
				outputBox.setText("No");
			}
		}
	}
	
	//exit button class
	public class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		
		new lab6();

	}

}
