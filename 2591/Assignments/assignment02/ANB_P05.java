package assignment02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
//***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 31, 2014
'Description:      	Problem Number 06 Chapter 04
'    
'	Write a program with a loop that lets the user enter a series of integers.
'	The user should enter -99 to signal the end of the series. After all the
'	numbers have been entered, the program should display the largest and 
'	smallest entered.
'	
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NAME OR NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P05
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		double largestValue = 0;
		double smallestValue = 0;
		double currentValue = 0;
		String userInputForFileName;
		
		Scanner getValue = new Scanner(System.in);
		
        // Get the name of the file
		System.out.print("Enter the name of the file: ");
		userInputForFileName = getValue.nextLine();
		File file = new File(userInputForFileName);
		Scanner inputFile = new Scanner(file);
		
		//Set default values
		currentValue = inputFile.nextDouble();
		smallestValue = currentValue;
		largestValue = currentValue;     
		
	      while (inputFile.hasNext())
	      {
			currentValue = inputFile.nextDouble();
			if (currentValue < smallestValue)	{smallestValue = currentValue;}
			if (currentValue > largestValue)	{largestValue = currentValue;}
	      }
	      System.out.println("The smallest number is " 	+ smallestValue);
	      System.out.println("The largest number is " 	+ largestValue);
	      getValue.close();
	      inputFile.close();
	}
}