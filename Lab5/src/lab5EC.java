/***********************
 * Name: Armando Dollia*
 * Date: 10/02/2014	   *
 ***********************/
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class lab5EC extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel narrowSide, wideSide, maxLength;
	private JTextField narrowInput, wideInput, maxOutput;
	private JButton calculate, exit;
	private static final int width = 500;
	private static final int height = 300;
	
	public lab5EC(){
		//set the layout
		setTitle("Max pipe length");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 2));
		
		//create label field
		narrowSide = new JLabel("Width of narrow hallway: ", SwingConstants.RIGHT);
		wideSide = new JLabel("Width of wide hallway: ", SwingConstants.RIGHT);
		maxLength = new JLabel("Maximum length of the pipe: ", SwingConstants.RIGHT);

		//text field
		narrowInput = new JTextField(10);
		wideInput = new JTextField(10);
		maxOutput = new JTextField(10);
		
		//calculate button
		calculate = new JButton("Calculate");
		CalculateButtonHandler calcHandler = new CalculateButtonHandler();
		calculate.addActionListener(calcHandler);
		
		//exit button
		exit = new JButton("Exit");
		exitButtonHandler exitHandler = new exitButtonHandler();
		exit.addActionListener(exitHandler);
		
		//add panes
		pane.add(narrowSide);
		pane.add(narrowInput);
		pane.add(wideSide);
		pane.add(wideInput);
		pane.add(maxLength);
		pane.add(maxOutput);
		pane.add(calculate);
		pane.add(exit);
		
		//set window size and visibility
		setSize(width, height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//create calculate button class
	public class CalculateButtonHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			double narrow, wide, max, theta;
			//store the input
			narrow = Double.parseDouble(narrowInput.getText());
			wide = Double.parseDouble(wideInput.getText());
			
			//calculate
			theta = Math.atan(narrow / wide);
			max = ((wide / Math.sin(theta)) + (narrow / Math.cos(theta)));
			
			//print to the output window
			maxOutput.setText("" + max);
		}
	}
		//begin exit button class
		public class exitButtonHandler implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}

	public static void main(String[] args) {
		new lab5EC();

	}

}
