package assignment04;
/**
//***********************************************************************
'Project:           Assignment 04
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 1, 2014
'Description:      	Problem Number 01 Chapter 08
'    
'	This program takes an array of doubles and manipulates it in order
'	to print out the average, highest, lowest, and total value of the 
'	elements in the array	
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_03 {
	public static void main(String[] args) {
		double[] doubleArray = { 75.8, 6.1, 40.5, 43.0, 28.8, 17.7, 32.2, 35.3,
				125.4, 43.8, 71.1, 23.2, 28.2 };
		System.out.println("The total is: "
				+ ANB_ArrayOperations.getTotal(doubleArray));
		System.out.println("\n\n\n");
		System.out.println(ANB_ArrayOperations.toString(doubleArray));
	}
}