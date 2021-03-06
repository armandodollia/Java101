//Demonstrate the use of the if... and if...then...else statements. (check)
//Give examples of loop construction in C++ or Java code. (check)
//Discuss program input and output from/to files. (check)
//Explain how buffers and arrays are constructed. (check)
//Show the elements and syntax of user-defined functions. (check)
//Discuss how to construct algebraic equations using user-defined variables. (check)
//Explain how Boolean statements are evaluated in conditional statements. (check)

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Graphics;



class multi extends JFrame implements ActionListener, ItemListener{
    private JLabel aL, bL, cL, vL, lyL, fibL, factL, xL, yL;
    private JTextField aTF, bTF, cTF, vTF, lyTF, fibTF, factTF, xTF, yTF;
    private JTextArea solTA, vTA, lyTA, fibTA, factTA, xyTA, avTA;
    private JButton solveB, vowelB, leapB, fibB, factB, xyB, aB, vB;
    private static int WIDTH = 1000;
    private static int HEIGHT = 650;
    private int row = 100;
    private int col = 100;
    private JPanel panel1, panel2;

    public multi(){
	setTitle("OCC CSC Interview Demo by: Ivan Temesvari");
	Container pane = getContentPane();
	setSize(WIDTH,HEIGHT);
	pane.setLayout(null);
	
	//Quadratic Solver
    aL = new JLabel("Enter a value for the coefficient of x\u00B2: ", SwingConstants.RIGHT);
    aTF = new JTextField(10);
	bL = new JLabel("Enter a value for the coefficient of x: ", SwingConstants.RIGHT);
    bTF = new JTextField(10);
	cL = new JLabel("Enter a value for the constant coefficient: ", SwingConstants.RIGHT);
    cTF = new JTextField(10);
	solTA = new JTextArea("Quadratic Solver Solutions here!", row, col);
       
    solveB = new JButton("Solve");
    solveB.addActionListener(this);

    aL.setLocation(10, 10);
    aTF.setLocation(280, 10);
	bL.setLocation(10, 30);
	bTF.setLocation(280, 30);
	cL.setLocation(10, 50);
    cTF.setLocation(280, 50);
	solTA.setLocation(10, 70);
    solveB.setLocation(180, 140);

	aL.setSize(270, 20);
    aTF.setSize(40, 20);
    bL.setSize(270, 20);
    bTF.setSize(40, 20);
    cL.setSize(270, 20);
	cTF.setSize(40, 20);
    solTA.setSize(420, 60);
    solveB.setSize(80, 60);

	solTA.setEditable(false);

    pane.add(aL);
    pane.add(aTF);
    pane.add(bL);
    pane.add(bTF);
    pane.add(cL);
	pane.add(cTF);
	pane.add(solTA);
	pane.add(solveB);

	//Vowel Counter
	vL = new JLabel("Enter a file name to count its vowels:", SwingConstants.RIGHT);
    vTF = new JTextField(40);
	vTA = new JTextArea("Count up the vowels!", row, col);
       
        vowelB = new JButton("Count");
        vowelB.addActionListener(this);

        vL.setLocation(10, 250);
        vTF.setLocation(280, 250);
	vTA.setLocation(90, 270);
	vowelB.setLocation(170, 310);

	vL.setSize(270, 20);
        vTF.setSize(120, 20);
        vTA.setSize(300, 30);
        vowelB.setSize(80, 50);

	vTA.setEditable(false);

	pane.add(vL);
        pane.add(vTF);
	pane.add(vTA);
	pane.add(vowelB);

	//Leap Year
	lyL = new JLabel("Enter a year (after 1582) to check if it is a leap year: ", SwingConstants.RIGHT);
        lyTF = new JTextField(400);
	lyTA = new JTextArea("Check your year!", row, col);
       
        leapB = new JButton("Leap");
        leapB.addActionListener(this);

        lyL.setLocation(400, 10);
        lyTF.setLocation(800, 10);
	lyTA.setLocation(520, 30);
	leapB.setLocation(600, 70);

	lyL.setSize(400, 20);
        lyTF.setSize(60, 20);
        lyTA.setSize(300, 30);
        leapB.setSize(80, 50);

	lyTA.setEditable(false);

	pane.add(lyL);
        pane.add(lyTF);
	pane.add(lyTA);
	pane.add(leapB);

	//Fibonacci Sequence Sum: iterations
	fibL = new JLabel("Find the sum of the sequence of Fibonacci numbers from the first to the nth:", SwingConstants.RIGHT);
        fibTF = new JTextField(600);
	fibTA = new JTextArea("Find the sum!", row, col);
       
        fibB = new JButton("Fibonacci");
        fibB.addActionListener(this);

        fibL.setLocation(300, 150);
        fibTF.setLocation(900, 150);
	fibTA.setLocation(530, 170);
	fibB.setLocation(700, 210);

	fibL.setSize(600, 20);
        fibTF.setSize(60, 20);
        fibTA.setSize(400, 30);
        fibB.setSize(100, 50);

	fibTA.setEditable(false);

	pane.add(fibL);
        pane.add(fibTF);
	pane.add(fibTA);
	pane.add(fibB);

	//Factorial
	factL = new JLabel("Enter an integer for n to compute n-Factorial (n!):", SwingConstants.RIGHT);
        factTF = new JTextField(600);
	factTA = new JTextArea("Find n!", row, col);
       
        factB = new JButton("Factorial");
        factB.addActionListener(this);

        factL.setLocation(420, 300);
        factTF.setLocation(820, 300);
	factTA.setLocation(530, 320);
	factB.setLocation(700, 360);

	factL.setSize(400, 20);
        factTF.setSize(60, 20);
        factTA.setSize(400, 30);
        factB.setSize(100, 50);

	factTA.setEditable(false);

	pane.add(factL);
        pane.add(factTF);
	pane.add(factTA);
	pane.add(factB);

	//if, else if, else
	xL = new JLabel("Enter the first integer:", SwingConstants.RIGHT);
        xTF = new JTextField(30);
	yL = new JLabel("Enter the second integer:", SwingConstants.RIGHT);
        yTF = new JTextField(30);
	xyTA = new JTextArea("Find the bigger number!", row, col);
       
        xyB = new JButton("Big");
        xyB.addActionListener(this);

        xL.setLocation(10, 400);
        xTF.setLocation(240, 400);
	yL.setLocation(10, 420);
        yTF.setLocation(240, 420);
	xyTA.setLocation(30, 450);
	xyB.setLocation(150, 490);

	xL.setSize(200, 20);
        xTF.setSize(30, 20);
	yL.setSize(200, 20);
        yTF.setSize(30, 20);
	xyTA.setSize(400, 30);
        xyB.setSize(100, 50);

	xyTA.setEditable(false);

	pane.add(xL);
	pane.add(xTF);
	pane.add(yL);
        pane.add(yTF);
	pane.add(xyTA);
	pane.add(xyB);


	//Arrays and Vectors 
	avTA = new JTextArea("Click the Array or Vector button to play.", row, col);
       
        aB = new JButton("Array");
        aB.addActionListener(this);

	vB = new JButton("Vector");
	vB.addActionListener(this);
        
	avTA.setLocation(550, 450);
	aB.setLocation(600, 490);
	vB.setLocation(700, 490);
	
	avTA.setSize(400, 30);
        aB.setSize(100, 50);
        vB.setSize(100, 50);

	avTA.setEditable(false);
	
	pane.add(avTA);
	pane.add(aB);
	pane.add(vB);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } //end of the constructor

   
    

    public static void main(String[] args) throws FileNotFoundException{
	multi myInterview = new multi();
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
	//algebraic equations
	//Solve ax^2+bx-c=0
	if(e.getActionCommand().equals("Solve")){
	    solTA.setText("");
	    double a = Double.parseDouble(aTF.getText());
	    double b = Double.parseDouble(bTF.getText());
	    double c = Double.parseDouble(cTF.getText());
	    char D;
	    double x1, x2;
	    double discriminant = Math.pow(b,2) - 4*a*c;
	    if(discriminant < 0){
		x1 = Math.sqrt(-1*discriminant)/(2*a);
		x2 = Math.sqrt(-1*discriminant)/(2*a);
		solTA.setText("The two imaginary quadratic solutions are:\n " + 
			      (-1*b)/(2*a) + " + " + x1 + "i, " + (-1*b)/(2*a) +
			      " - " + x2 + "i.");
	    }
	    else if(discriminant > 0){
		x1 = (-1*b+Math.sqrt(discriminant))/(2*a);
		x2 = (-1*b-Math.sqrt(discriminant))/(2*a);
		solTA.setText("The two real quadratic solutions are:\n " +  x1 + ", " + x2 + ".");
	    }
	    else{
		x1 = (-1*b)/(2*a);
		solTA.setText("The single distinct quadratic solution is:\n " +  x1 + ".");
	    }
	}
	else if(e.getActionCommand().equals("Count")){
	    //program file i/o
	    try{
		File file = new File(vTF.getText());  //try file input.txt
		Scanner inFile = new Scanner(new FileReader(file));
		PrintWriter outFile = new PrintWriter("output.txt");
		
		String s;
		int numVowels = 0;
		while(inFile.hasNext()){
		    s = inFile.nextLine().toLowerCase();  //count up the vowels in the input file
		    for(int i = 0; i < s.length(); i++){
			switch(s.charAt(i)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			    numVowels++; break;
			}
		    }
		}
		vTA.setText("There are " + numVowels + " vowels in the following file: " + file.getName());
		outFile.println("There are " + numVowels + " vowels in the following file: " + file.getName());
		
		inFile.close();
		outFile.close();
	    }
	    catch(FileNotFoundException exp){
	    }
	}
	//boolean statements
	else if(e.getActionCommand().equals("Leap")){
	    int year = Integer.parseInt(lyTF.getText());
	    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		lyTA.setText("The year: " +  year + " is a leap year.");
	    else
		lyTA.setText("The year: " +  year + " is NOT a leap year.");	
	}
	else if(e.getActionCommand().equals("Fibonacci")){
	    //loop construction
	    int fib = Integer.parseInt(fibTF.getText());
	    int[] n = new int[fib];
	    for(int i = 0; i < fib; i++){  //forward iteration
		if(i == 0)
		    n[i] = 1;
		else if(i == 1)
		    n[i] = 1;
		else
		    n[i] = n[i-1] + n[i-2];
	    }
	    int fib_sum = 0;
	    for(int i = fib-1; i >= 0; i--)  //reverse iteration
		fib_sum += n[i];
	    fibTA.setText("The sum of the first " + fib + " numbers in the fibonacci sequence is: " + fib_sum);
	}
	else if(e.getActionCommand().equals("Factorial")){
	    //(recursive) user-defined functions
	    int factorial = Integer.parseInt(factTF.getText());
	    int nFact = nFactorial(factorial);
	    factTA.setText(factorial+ " Factorial (" + factorial + "!) is: " + nFact);
	}
	else if(e.getActionCommand().equals("Big")){
	    //if, else if, else
	    int x, y;
	    x = Integer.parseInt(xTF.getText());
	    y = Integer.parseInt(yTF.getText());
	    if(x < y)
		xyTA.setText(x + " < " + y);
	    else if(x > y)
		xyTA.setText(x + " > " + y);
	    else
		xyTA.setText(x + " = " + y);
	}
	else if(e.getActionCommand().equals("Array")){
	    //arrays of ints as strings
	    String[] string_array = new String[10];
	    for(int i = 0; i < string_array.length; i++){
		string_array[i] = i + ""; //convert an int to a String element
	    }
	    if(string_array[9] instanceof String) //compare two Strings
		avTA.setText("The element at the 9th index of the String array is a String.");	
	}
	else if(e.getActionCommand().equals("Vector")){
	    //supplement arrays with Vectors
	    Vector<String> string_vector = new Vector<String>();
	    for(int i = 0; i < 10; i++){
		string_vector.addElement(i + ""); //convert an int to a String element
	    }
	    if(string_vector.elementAt(9) instanceof String)  //compare two Strings
		avTA.setText("The element at the 9th index of the String vector is a String.");		
	}
    }

    public void itemStateChanged(ItemEvent e){
    }

    static int nFactorial(int n){
	int nFact = 1;
	if(n == 1 || n == 0)
	    return 1;
	else
	    return n * nFactorial(n - 1);
    }
    
}


  
   

  
    
   

 

      