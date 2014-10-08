import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class Fruit extends JFrame implements ActionListener{
    private JLabel intro;
    private JTextField option;
    private JTextArea display;
    private JButton fruity , quit;
    
    
    public Fruit(){ //constructor for the JFrame
        
        intro           = new JLabel ("What is your favorite fruit?" , SwingConstants.RIGHT);
        option          = new JTextField(20);
        display         = new JTextArea( 20 , 10);
        fruity          = new JButton ("Fruity!");
        quit            = new JButton ("Quit");
        setTitle("Fruits 'R Us");
        
        Container c = getContentPane();
        setSize(500,300);
        c.setLayout(null); //null usually means default
        
        fruity.addActionListener(this); //Listen to itself
        quit.addActionListener(this); //Listen to itself
        
        intro.setSize(200,30);
        option.setSize(200, 30);
        display.setSize(400, 50);
        fruity.setSize(150,100);
        quit.setSize(150, 100);
        
        intro.setLocation(10,10);
        option.setLocation(220,10);
        display.setLocation(30,60);
        fruity.setLocation(50,150);
        quit.setLocation(250,150);
        
        c.add(intro);
        c.add(option);
        c.add(display);
        c.add(fruity);
        c.add(quit);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String [] args){
        Fruit my_Fruit = new Fruit(); //instantiating the constructor
                                      //create an instance of a Fruit object
    } 
    public void actionPerformed(ActionEvent e){
        String s;
        if(e.getActionCommand().equals("Fruity!")){
            s = option.getText();
            switch(s){
                case "apple":
                    display.setText("An apple a day keeps the bad bugs away!");
                    break;
                case "banana":
                    display.setText("Bananas are a good source of energy!");
                    break;
                case "peach":
                    display.setText("Peaches and cream!");
                    break;
                    
                default:
                    display.setText("Try another fruit!");
            }
        }
            
        if(e.getActionCommand().equals("Quit")){
            System.exit(0);
        }
    }
} //end of class










