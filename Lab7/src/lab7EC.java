/***********************
 * Name: Armando Dollia*
 * Date: 10/23/2014	   *
 ***********************/

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class lab7EC extends JFrame implements ItemListener, ActionListener{

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 500, HEIGHT = 600;
	private static final String SMALL="Small", MEDIUM="Medium", LARGE="Large", THIN="Thin", TOSSED="Tossed", PAN="Pan";
	private static String name, line, orderFinal;
	private JCheckBox pepperoniB, sausageB, tomatoB, greenPepperB, olivesB, mushroomsB, cheeseB;
	private JRadioButton smallR, mediumR, largeR;
	private JRadioButton thinR, tossedR, panR;
	private JLabel title, boxTitle, topping, size, crust;
	private JTextArea order;
	private JButton submit, clear;
	private List<JCheckBox> toppings = null;
	private ButtonGroup sizes, crusts;
	private String pizzaToppings = "Toppings: ", pizzaSize = "Pizza Size: ", pizzaCrust = "Crust Type: ", cost;
	private Integer counter = 0;
	private Double total, sizePrice = 0.0;


	
	
	
	public lab7EC(){
		//set the layout
		setTitle("Pizza Ordering");
		Container pane = getContentPane();
		pane.setSize(1000, 1000);
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
//		title.setFont(getFont().deriveFont(22f)); //change font size
		title.setForeground(Color.BLUE); //change font color
		topping.setLocation(15, 50);
		topping.setSize(100,20);
		topping.setForeground(Color.BLUE);
		size.setLocation(155, 50);
		size.setSize(80,20);
		size.setForeground(Color.BLUE);
		crust.setLocation(305,50);
		crust.setSize(80,20);
		crust.setForeground(Color.BLUE);
		boxTitle.setLocation(10, 290);
		boxTitle.setSize(80, 20);
		boxTitle.setForeground(Color.BLUE);
		

		//create text area
		order = new JTextArea(5,300);
		order.setLocation(10, 320);
		order.setSize(500, 100);
		order.setEditable(false);
		
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
		smallR = new JRadioButton("Small: $6.50", false);
		smallR.setActionCommand(SMALL);
		mediumR = new JRadioButton("Medium: $8.50", false);
		mediumR.setActionCommand(MEDIUM);
		largeR = new JRadioButton("Large: $10.00", false);
		largeR.setActionCommand(LARGE);
		thinR = new JRadioButton("Thin Crust", false);
		thinR.setActionCommand(THIN);
		tossedR = new JRadioButton("Hand Tossed", false);
		tossedR.setActionCommand(TOSSED);
		panR = new JRadioButton("Pan Pizza", false);
		panR.setActionCommand(PAN);
		
		//group the size radio buttons
		sizes = new ButtonGroup();
		sizes.add(smallR);
		sizes.add(mediumR);
		sizes.add(largeR);
		
		//group the crust radio buttons
		crusts = new ButtonGroup();
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
		SubmitHandler submitHandler = new SubmitHandler();
		submit.addActionListener(submitHandler);
		submit.setLocation(150, 170);
		submit.setSize(230,30);
		
		//create and instantiate clear button
		clear = new JButton("Clear Order");
		ClearHandler clearHandler = new ClearHandler();
		clear.addActionListener(clearHandler);
		clear.setLocation(150, 220);
		clear.setSize(230, 30);
		
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
		pane.add(clear);
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
		
		//set window size and visibility
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent e){
		refreshOrderText();		
	}
	
	public void actionPerformed(ActionEvent e) {
		refreshOrderText();		
	}

	private void refreshOrderText() {
		
		pizzaSize = "Pizza Size: ";
		pizzaCrust = "Crust Type: ";

		//check the size radio button selection
		if(sizes.getSelection() != null){
			if(sizes.getSelection().getActionCommand() == SMALL){
				pizzaSize += "Small";
					sizePrice = 6.50;
			}
			else if(sizes.getSelection().getActionCommand() == MEDIUM){
				pizzaSize += "Medium";
				sizePrice = 8.50;
			}
			else if( sizes.getSelection().getActionCommand() == LARGE){
				pizzaSize += "Large";
				sizePrice = 10.00;
			}
		}
		

		//check the crust radio button selection
		if(crusts.getSelection() != null){
			if (crusts.getSelection().getActionCommand() == THIN){
				pizzaCrust += "Thin Crust";
			}
			else if (crusts.getSelection().getActionCommand() == TOSSED){
				pizzaCrust += "Hand Tossed";
			}
			else if (crusts.getSelection().getActionCommand() == PAN){
				pizzaCrust += "Pan Pizza";
			}
		}
		
		//reset counter and pizza toppings
		pizzaToppings = "Toppings: ";
		counter = 0;
		
		//get the topping selections
		for(int i = 0; i < toppings.size(); i++){
			if(toppings.get(i).isSelected()){
				pizzaToppings += ( counter>0 ? ", " : "") + toppings.get(i).getText();
				counter++;
			}
			
		}

		total = (sizePrice+(counter*1.50));
		cost = String.format("Price: $%.2f", total);
		orderFinal = String.format("Name:" + name + "\n" + pizzaSize + "\n" + pizzaCrust + "\n" + pizzaToppings + "\n");
		order.setText(pizzaSize + "\n" + pizzaCrust + "\n" + pizzaToppings + "\n" + cost);
	}

	//create submit button class
	public class SubmitHandler implements ActionListener{
		

		
		public void actionPerformed(ActionEvent e){
			PrintWriter outFile = null;
			try {
				outFile = new PrintWriter(new FileWriter("Pizza_Order_Database.txt"));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if (crusts.getSelection() != null && sizes.getSelection() != null){
				outFile.println(orderFinal);
				
				order.setText(pizzaSize + "\n" + pizzaCrust + "\n" + pizzaToppings + "\n" + cost + "\n" + "Order Submitted!");
			}
			else{
				JOptionPane.showMessageDialog(null, "Please select a size and a crust");
				//reset counter and pizza toppings
				pizzaToppings = "Toppings: ";
				pizzaSize = "Pizza Size: ";
				pizzaCrust = "Crust Type: ";
				counter = 0;
				}
			outFile.close();
		}
		
	}
	
	//create clear button class
	public class ClearHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			crusts.clearSelection();
			sizes.clearSelection();
			for(int i = 0; i < toppings.size(); i++){
				if(toppings.get(i).isSelected()){
					toppings.get(i).setSelected(false);
					}				
			}
			order.setText("");
		}
	}


	public static void main(String[] args) throws IOException{
		BufferedReader inFile = new BufferedReader(new FileReader("Pizza_Order_Database.txt"));
		PrintWriter outFile = new PrintWriter("Pizza_Order_Database.txt");
		
		name = JOptionPane.showInputDialog(null, "What is your name?");
		while ((line = inFile.readLine()) != null){
			if (line.substring(0, line.indexOf(':')).equals("Name")){
				if (name.equals(line.substring(line.indexOf(':')+1, line.length()-1))){
					JOptionPane.showMessageDialog(null, "Exists");
				}
			}
		}
		
		new lab7EC();
		
		inFile.close();
		outFile.close();
	}
}
