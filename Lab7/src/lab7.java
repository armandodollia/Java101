/***********************
 * Name: Armando Dollia*
 * Date: 10/23/2014	   *
 ***********************/

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class lab7 extends JApplet implements ItemListener, ActionListener{

	private static final long serialVersionUID = 1L;
	private JCheckBox pepperoniB, sausageB, tomatoB, greenPepperB, olivesB, mushroomsB, cheeseB;
	private JRadioButton smallR, mediumR, largeR;
	private JRadioButton thinR, tossedR, panR;
	private JLabel title, boxTitle, topping, size, crust;
	private JTextArea order;
	private JButton submit;
	private List<JCheckBox> toppings = null;
	
	public void init(){
		//set the layout
		Container pane = getContentPane();
		pane.setLayout(null);
		
		//create labels
		title = new JLabel("Welcome to the Jungle (Pizza Shop)", SwingConstants.LEFT);
		boxTitle = new JLabel("Your Order:", SwingConstants.LEFT);
		topping = new JLabel("Toppings: $1.50", SwingConstants.LEFT);
		size = new JLabel("Pizza Size", SwingConstants.LEFT);
		crust = new JLabel("Pizza Type", SwingConstants.LEFT);
		
		//title labels
		title.setLocation(10, 1);
		title.setSize(500, 40);
		title.setFont(getFont().deriveFont(22f)); //change font size
		title.setForeground(Color.BLUE); //change font color
		topping.setLocation(15, 50);
		topping.setSize(100,20);
		size.setLocation(155, 50);
		size.setSize(80,20);
		crust.setLocation(305,50);
		crust.setSize(80,20);
		boxTitle.setLocation(10, 290);
		boxTitle.setSize(80, 20);
		

		//create text area
		order = new JTextArea(5,300);
		order.setLocation(10, 320);
		order.setSize(450, 100);
		
		//create check boxes
		pepperoniB = new JCheckBox("Pepperoni", false);
		sausageB = new JCheckBox("Sausage", false);
		tomatoB = new JCheckBox("Tomato", false);
		greenPepperB = new JCheckBox("Green Pepper", false);
		olivesB = new JCheckBox("Olives", false);
		mushroomsB = new JCheckBox("Mushrooms", false);
		cheeseB = new JCheckBox("Extra Cheese", false);
		
		//set location for check box
		pepperoniB.setLocation(10, 80);
		pepperoniB.setSize(100, 20);
		sausageB.setLocation(10, 110);
		sausageB.setSize(100, 20);
		tomatoB.setLocation(10, 140);
		tomatoB.setSize(100, 20);
		greenPepperB.setLocation(10, 170);
		greenPepperB.setSize(120, 20);
		olivesB.setLocation(10, 200);
		olivesB.setSize(100, 20);
		mushroomsB.setLocation(10, 230);
		mushroomsB.setSize(100, 20);
		cheeseB.setLocation(10, 260);
		cheeseB.setSize(120, 20);
		
		//create radio buttons
		smallR = new JRadioButton("Small: $6.50",false);
		mediumR = new JRadioButton("Medium: $8.50",true);
		largeR = new JRadioButton("Large: $10.00",false);
		thinR = new JRadioButton("Thin Crust", false);
		tossedR = new JRadioButton("Hand Tossed", true);
		panR = new JRadioButton("Pan Pizza", false);
		
		//group the size radio buttons
		ButtonGroup sizes = new ButtonGroup();
		sizes.add(smallR);
		sizes.add(mediumR);
		sizes.add(largeR);
		
		//group the crust radio buttons
		ButtonGroup crusts = new ButtonGroup();
		crusts.add(thinR);
		crusts.add(tossedR);
		crusts.add(panR);
		
		//group the topping check boxes
		toppings = new ArrayList<JCheckBox>();
		toppings.add(pepperoniB);
		toppings.add(greenPepperB);
		toppings.add(cheeseB);
		toppings.add(olivesB);
		toppings.add(sausageB);
		toppings.add(tomatoB);
		toppings.add(mushroomsB);
		
		
		//set location for radio buttons
		smallR.setLocation(150, 80);
		smallR.setSize(120, 18);
		mediumR.setLocation(150, 110);
		mediumR.setSize(120, 18);
		largeR.setLocation(150, 140);
		largeR.setSize(120, 18);
		thinR.setLocation(300, 80);
		thinR.setSize(120, 18);
		tossedR.setLocation(300, 110);
		tossedR.setSize(120, 18);
		panR.setLocation(300, 140);
		panR.setSize(120, 18);
		
		//create and instantiate submit button
		submit = new JButton("Submit Order");
		SubmitHandler orderHandler = new SubmitHandler();
		submit.addActionListener(orderHandler);
		submit.setLocation(150, 170);
		submit.setSize(200,30);
		
		//place elements in window
		pane.add(title);
		pane.add(pepperoniB);
		pane.add(sausageB);
		pane.add(tomatoB);
		pane.add(greenPepperB);
		pane.add(olivesB);
		pane.add(mushroomsB);
		pane.add(cheeseB);
		pane.add(smallR);
		pane.add(mediumR);
		pane.add(largeR);
		pane.add(thinR);
		pane.add(tossedR);
		pane.add(panR);
		pane.add(boxTitle);
		pane.add(order);
		pane.add(submit);
		pane.add(topping);
		pane.add(size);
		pane.add(crust);
		
		//add item listeners
		pepperoniB.addItemListener(this);
		sausageB.addItemListener(this);
		tomatoB.addItemListener(this);
		greenPepperB.addItemListener(this);
		olivesB.addItemListener(this);
		mushroomsB.addItemListener(this);
		cheeseB.addItemListener(this);
		
		//add action listeners
		smallR.addActionListener(this);
		mediumR.addActionListener(this);
		largeR.addActionListener(this);
		thinR.addActionListener(this);
		tossedR.addActionListener(this);
		panR.addActionListener(this);
		
		
		//pane.setBackground(Color.blue);
	}

	public void itemStateChanged(ItemEvent e){
		refreshOrderText();		
	}
	
	public void actionPerformed(ActionEvent e) {
		refreshOrderText();		
	}

	private void refreshOrderText() {
		String orderText = "Toppings: ";
		Integer counter = 0;
		for(int i = 0; i < toppings.size(); i++){
			if(toppings.get(i).isSelected()){
				orderText += ( counter>0 ? ", " : "") + toppings.get(i).getText();
				counter++;
			}
				
		}
		
		
		order.setText(orderText);
	}

	//create submit button class
	public class SubmitHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			order.setText("it works!");
		}
		
	}


}

