package assignment01;
import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 29, 2014
'Description:      	Problem Number 12 Chapter 02
'    
'	This program manipulates an inputed string returning amount of characters,
'	rewrites in upper case and lower case and prints the first character in the string
'
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P03 
{
	public static void main(String[] args) 
	{
		// Declarations
		String userInput;
		
		// Gets the user input
		userInput = JOptionPane.showInputDialog("Enter the name of your favorite City:");
		
		// Prints all necessary requirements
		System.out.println(userInput.length());			//Prints string length
		System.out.println(userInput.toLowerCase());	//Converts to lower case
		System.out.println(userInput.toUpperCase());	//Converts to upper case
		System.out.println(userInput.substring(0,1));	//Prints first character in string
	}

}
