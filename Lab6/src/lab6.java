/***********************
 * Name: Armando Dollia*
 * Date: 10/07/2014	   *
 ***********************/
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class lab6 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel input, output;
	private JTextField inputBox, outputBox;
	private JButton check, clear;
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
		
		//set enter key to check
		EnterButtonHandler enterHandler = new EnterButtonHandler();
		inputBox.addKeyListener(enterHandler);
		
		//exit button
		clear = new JButton("Clear");
		ClearButtonHandler clearHandler = new ClearButtonHandler();
		clear.addActionListener(clearHandler);
		
		//add elements to window
		window.add(input);
		window.add(inputBox);
		window.add(output);
		window.add(outputBox);
		window.add(check);
		window.add(clear);
		
		//set window size and visibility
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//create enter button class
	public class EnterButtonHandler implements KeyListener{
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				check.doClick();
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}

	//create check button class
	public class CheckButtonHandler implements ActionListener{
		public boolean IsNumeric(){
			try{
			Integer.parseInt(inputBox.getText());
			} catch (NumberFormatException x){
				return false;
			}
			return true;
		}
		public void actionPerformed(ActionEvent e){
			//String word = inputBox.getText();
			//Integer number = Integer.parseInt(inputBox.getText());
			palindromeHelper test = new palindromeHelper();
			boolean isPalindrome = false;
			if(IsNumeric()){
				Integer number = Integer.parseInt(inputBox.getText());
				if(test.palindrome(number)){
					isPalindrome = true;
				}
			}
			else{
				String word = inputBox.getText();
				if(test.palindrome(word)){
					isPalindrome = true;
				}
			}
			
			outputBox.setText(isPalindrome ? "Yes!" : "No" );
			
		}
	}
	
	//clear button class
	public class ClearButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			inputBox.setText("");
			outputBox.setText("");
			inputBox.requestFocusInWindow();
		}
	}
	public static void main(String[] args) {
		new lab6();

	}

}
