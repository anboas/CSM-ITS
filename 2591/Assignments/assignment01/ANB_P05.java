package assignment01;
/**
//***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 30, 2014
'Description:      	Problem Number 14 Chapter 02
'    
'	This program calculates the amount paid for the stock without commission
'	as well as the amount of commission and the total amount paid.
'
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P05 
{
	public static void main(String[] args) 
	{
		// Constants
		final double comRate = .02;
		
		// Declarations and Calculations
		double shares = 600;
		double price = 21.77;
		double totalPrice 	= shares * price;
		double comPaid 		= totalPrice * comRate;
		double totalPaid 	= comPaid + totalPrice;
	
		// Prints our values for user
		System.out.println("The total cost for the shares is:       " + totalPrice);
		System.out.println("The amount of commission you will pay:  " + comPaid);
		System.out.println("The total amount you will pay is:       " + totalPaid);
		
	}
}
