package assignment01;
import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 29, 2014
'Description:      	Problem Number 8 Chapter 02
'    
'   This program gets an input from the user, purchase and outputs 
'   count and state sales tax. As well as total purchase value and 
'	total tax of the transaction.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from OR NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P01 
{
	public static void main(String[] args) 
	{
		//constants
		final double stateRate = .04;
		final double countyRate = .02;

		//variables
		double purchase;
		double stateTax;
		double countyTax;
		double totalTax;
		double totalCost;
		String userInput;
		
		//Get Input and convert to double
		userInput = JOptionPane.showInputDialog("Enter the amount of purchase");
		purchase = Double.parseDouble(userInput);
		
		//Calculate our values
		stateTax 	= purchase * stateRate;
		countyTax 	= purchase * countyRate;
		totalTax 	= stateTax + countyTax;
		totalCost 	= totalTax + purchase;
		
		//Output our calculated values
		System.out.println("The original purchase was: " + purchase);
		System.out.println("The state sales tax was:   " + stateTax);
		System.out.println("The county sales tax was:  " + countyTax);
		System.out.println("The total sales tax was:   " + totalTax);
		System.out.println("The total purchase was:    " + totalCost);
	}
}
