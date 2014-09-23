//Name: Armando Dollia
//Date: 09/02/2014

import java.util.Scanner;
public class Income {

	private static Scanner console;

	public static void main(String[] args) 
	{
		//This program calculates how much money will be placed on a savings bond based on monthly spendings
		//Declare and initialize variables
		double weeks, hours, payRate, taxRate, pctAccessories, pctSupplies, pctInvested, parentContrib, totalParentContrib, leftoverMoney, totalInvest;
		double preTax, postTax, tax, accessories, supplies, invested, total;
		console = new Scanner(System.in);
		
		//Prompt user for values and store them in memory
		System.out.println("How many weeks are you working? ");
		weeks = console.nextDouble();
		System.out.println("How many hours a week do you work? ");
		hours = console.nextDouble();
		System.out.println("How much money do you make hourly? ");
		payRate = console.nextDouble();
		System.out.println("What percent tax do you pay? ");
		taxRate = console.nextDouble();
		System.out.println("What percentage of your wages are you spending on clothes and accessories? ");
		pctAccessories = console.nextDouble();
		System.out.println("What percentage of your wages are you spending on school supplies? ");
		pctSupplies = console.nextDouble();
		System.out.println("What percentage of the remaining money are you investing? ");
		pctInvested = console.nextDouble();
		System.out.println("How many dollars are your parents contributing to every dollar you invest? ");
		parentContrib = console.nextDouble();
		
		//Calculate post tax income
		preTax = weeks * hours * payRate;
		tax = (preTax * taxRate / 100);
		postTax = preTax - tax;
		
		//Calculate money spent on each category
		accessories = postTax * pctAccessories / 100.0;
		supplies = postTax * pctSupplies / 100.0;
		
		//recalculate leftover cash and store the value
		total = postTax - (accessories + supplies);
		
		//Calculate money invested
		invested = total * pctInvested / 100.0;
		
		//Calculate leftover money
		leftoverMoney = total - invested;
		
		//Calculate Parent Contributions
		totalParentContrib = invested * parentContrib;
		
		//Calculate total Investment
		totalInvest = invested + totalParentContrib;
		
		//Output Values
		System.out.println("You made $" + preTax + " before tax.");
		System.out.println("You made $" + postTax + " after tax.");
		System.out.println("You spent $" + accessories + " on clothes and accessories.");
		System.out.println("You spent $" + supplies + " on school supplies.");
		System.out.println("You spent $" + invested + " on savings bonds.");
		System.out.println("Your parents spent $" + totalParentContrib + " on additional savings bonds for you.");
		System.out.println("Your total investment ammount is $" + totalInvest);
		System.out.println("You have $" + leftoverMoney + " leftover.");
	}

}
