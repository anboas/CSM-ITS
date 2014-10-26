package assignment01;
import javax.swing.JOptionPane;
import java.text.*;

/**
//***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 30, 2014
'Description:      	Problem Number 13 Chapter 02
'    
'	This program get the charge for a meal from the user computes tax and tip
'	and returns the total tax, tip and amount paid.
'
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P04 
{
	public static void main(String[] args) 
	{
		// Constants
		final double TAX = .0675;
		final double TIP = .15;
		
		// Declarations
		double mealCharge;
		double totalTax;
		double totalTip;
		double totalCharge;
		String userInput;
		DecimalFormat decForm = new DecimalFormat("##.00");	/* Keeps ugly decimals out of our output.
															 * As long as they're not used during calculations, 
															 * it has no affect on our results
															 */
		
		// Gets Meal Charge from user
		userInput = JOptionPane.showInputDialog("How much did the meal cost: ");
		mealCharge = Double.parseDouble(userInput);
		
		// Calculates all appropriate information
		totalTax = TAX * mealCharge;
		totalTip = (totalTax + mealCharge) * TIP;
		totalCharge = mealCharge + totalTip + totalTax;
		System.out.println("Your total meal charge was : " + decForm.format(mealCharge));
		System.out.println("You were taxed: " + decForm.format(totalTax));
		System.out.println("You are being charged a tip of: " + decForm.format(totalTip));
		System.out.println("Your total bill is: " + decForm.format(totalCharge));
	}
}
