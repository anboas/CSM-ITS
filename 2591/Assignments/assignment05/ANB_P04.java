package assignment05;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
'	This Programming Challenge is Problem 02 of Chapter 09 in the main book.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P04 {

	public static void main(String args[]) throws IOException
	{
		String input;
		String filename;
		int words = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the name of a file: ");
		filename = keyboard.nextLine();
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext()){			//This can be doen simply by changing 
			input = inputFile.nextLine();		//inputFile.nextLine(); to inputFile.next();	
			words += wordCount(input);			//words += wordCount(input); to words += 1;		
		}
		
		inputFile.close();
		System.out.println("That file has " + words + " words in it.");
		
		keyboard.close();
	}
	/**
	 * wordCount Method
	 * @param str
	 * @return
	 */
	public static int wordCount(String str)
	{
		String delimitor = " ";
		StringTokenizer countWords = new StringTokenizer(str, delimitor);
		
		return countWords.countTokens();
	}
}
