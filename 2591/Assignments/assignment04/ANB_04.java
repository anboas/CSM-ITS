package assignment04;

import java.io.IOException;
/**
//***********************************************************************
'Project:           Assignment 04
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 1, 2014
'Description:      	Problem Number 01 Chapter 08
'    
'	This program takes an array of doubles from a file and manipulates 
'	it in order	to print out the average, highest, lowest, and total value of the 
'	elements in the array	-- It then prints the array backwards 
'	in a desired amount of columns
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_04 {
	public static void main(String[] args) throws IOException {
		// Creates a new instance with the given filename
		ANB_Analyzer numAnalyzer = new ANB_Analyzer("Ch08_P11_Input.txt");

		// Calls the toString method to print out relevant data
		System.out.println(numAnalyzer.toString());

		// Prints out the values of the array in 5 columns
		numAnalyzer.printArray(5);
	}

}
