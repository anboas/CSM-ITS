package assignment01;
import javax.swing.SwingUtilities;

/***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 14, 2014
'Description:      	Problem Number 01 Chapter 13
'    
'	Scrollable Tax Calculator
'
'	Create an application that allows you to enter the amount of a purchase
'	and then displays the amount of sales tax on that purchase. Use a slider
'	to adjust the tax rate between 0 percent and 10 percent.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P01 {
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ScrollableTaxCalculator();
			}
		});

	}
}