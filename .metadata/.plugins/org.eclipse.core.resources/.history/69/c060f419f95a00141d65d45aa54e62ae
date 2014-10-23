/***********************
 * Name: Armando Dollia*
 * Date: 10/02/2014	   *
 ***********************/
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class lab5EC extends JApplet{

	private static final long serialVersionUID = 1L;
	private JLabel narrowSide, wideSide, maxLength;
	private JTextField narrowInput, wideInput, maxOutput;
	private JButton calculate, exit;
	//private static final int width = 500;
	//private static final int height = 300;
	
	public void init(){
		//set the layout
		//setTitle("Max pipe length"); not needed in JApplet (declared in HTML)
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
		
		/* exit button not needed for JApplet
		exit = new JButton("Exit");
		exitButtonHandler exitHandler = new exitButtonHandler();
		exit.addActionListener(exitHandler); */
		
		//add panes
		pane.add(narrowSide);
		pane.add(narrowInput);
		pane.add(wideSide);
		pane.add(wideInput);
		pane.add(maxLength);
		pane.add(maxOutput);
		pane.add(calculate);
		//pane.add(exit);
		
		//setSize(width, height); Not needed in JApplet (declared in HTML)
		//setVisible(true); Not needed in JApplet
		//setDefaultCloseOperation(EXIT_ON_CLOSE); Not needed in JApplet (handled by browser)
	}
	
	//create calculate button class
	public class CalculateButtonHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			double narrow, wide, max;
			//store the input
			narrow = Double.parseDouble(narrowInput.getText());
			wide = Double.parseDouble(wideInput.getText());
			
			//calculate
			max = Math.pow((Math.pow(narrow, (2.0/3.0)) + Math.pow(wide, (2.0/3.0))), (3.0/2.0));
			
			//print to the output window
			maxOutput.setText("" + max);
		}
	}
		/*begin exit button class (Not needed in JApplet)
		public class exitButtonHandler implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} */
}
