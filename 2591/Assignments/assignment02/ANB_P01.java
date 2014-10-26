package assignment02;
import javax.swing.JOptionPane;
import java.text.*;
/**
//***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 31, 2014
'Description:      	Problem Number 6 Chapter 03
'    
'   This program takes a user input in seconds.
'	The program then evaluates how many days, hours, minutes and remaining
'	seconds there are in the input.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NAME OR NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P01
{
   public static void main(String[] args)
   {
	   // Constants
	   final double DAY 	= 86400;
	   final double HOUR 	= 3600;
	   final double MINUTE 	= 60;
	   
	   // Variables
	   double seconds;			// User's input
	   double minute;		
	   double hour;			
	   double day;
	   String userInput;		// User's input fetch
	   
	   // Formatting and user input
	   DecimalFormat decForm = new DecimalFormat("##0.00");
	   userInput = JOptionPane.showInputDialog("Enter the number of seconds. ");
	   seconds = Double.parseDouble(userInput);
	   
	   // Formulas - Must be assigned after user has input seconds value
	   day 		= seconds / DAY;
	   hour 	= seconds / HOUR;
	   minute 	= seconds / MINUTE;
	   
	   // Output
	   if (seconds > 86400)
	   {System.out.println("There are " + decForm.format(day) + " days in " + decForm.format(seconds) + " seconds."); 
		  JOptionPane.showMessageDialog(null, "There are " + decForm.format(day) + " days in " + decForm.format(seconds) + " seconds.");}
	   else if (seconds > 3600)
	   {System.out.println("There are " + decForm.format(hour) + " hours in " + decForm.format(seconds) + " seconds.");
		   JOptionPane.showMessageDialog(null, "There are " + decForm.format(hour) + " hours in " + decForm.format(seconds) + " seconds.");}
	   else if (seconds > 60)
	   {System.out.println("There are " + decForm.format(minute) + " minutes in " + decForm.format(seconds) + " seconds.");
		   JOptionPane.showMessageDialog(null, "There are " + decForm.format(minute) + " minutes in " + decForm.format(seconds) + " seconds.");}
	   else
	   {System.out.println("You only put in " + decForm.format(seconds) + " seconds, try a higher amount!");}
   }
}