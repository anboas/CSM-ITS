package assignment05;
import java.util.Scanner;

/**
//***********************************************************************
'Project:           Assignment 05
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 12, 2014
'Description:      	Problem Number 01 Chapter 10
'    
'	Write a method that accepts a String object as an argument and displays its contents backward.
'	For instance, if the string argument is "gravity" the method should display *ytivarg*.
'	Demonstrate the method in a program that asks the user to input a string and then passes it
'	to the method.
'
'	This Programming Challenge is Problem 01 of Chapter 09 in the main book.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P03 {
	public static void main(String args[])
	{
		String input;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input a string to reverse: ");
		input = keyboard.nextLine();
		
		backward(input);
		keyboard.close();
	}
	
	public static void backward(String input)
	{
		String backwardString = "";		// Initializes variable
		int stringLength = input.length();	// Gets length of input string
		
		for (int i = stringLength - 1; i >= 0; i--)	// Starts at the end of a string's length and increments down
			backwardString = backwardString + input.charAt(i);	// Returns each character and adds it to itself
		System.out.println("The string in reverse is: " + backwardString);
		
	}
}
