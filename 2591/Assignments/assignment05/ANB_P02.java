package assignment05;
import java.util.Scanner;

/**
//***********************************************************************
'Project:           Assignment 05
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 12, 2014
'Description:      	Problem Number 04 Chapter 09
'    
'	Make a LandTract class that has two fields: one for the tract's length and one for the width.
'	The class should have a method that returns the tract's area, as well as an equals method
'	and a toString method. Demonstrate the class in a program that asks the user to enter the
'	dimensions for two tracts of land. The program should display the area of each tract of land
'	and indicate whether the tracts are of equal size.
'
'	This Programming Challenge is Problem 04 of Chapter 08 in the main book.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P02 {

	public static void main(String args[]) {
		
		double length;	// Input for length
		double width;	// Input for width
		
		//Scanner to retrieve input
		Scanner keyboard = new Scanner(System.in);
		
		// Tract Dimensions
		System.out.println("Tract 1:");
		System.out.print("Enter the length of tract 1: ");
		length = keyboard.nextDouble();
		System.out.print("Enter the width of tract 1: ");
		width = keyboard.nextDouble();
		ANB_LandTract tract1 = new ANB_LandTract(length, width);	//Creates object
		
		System.out.println("Tract 2:");
		System.out.print("Enter the length of tract 2: ");
		length = keyboard.nextDouble();
		System.out.print("Enter the width of tract 2: ");
		width = keyboard.nextDouble();
		ANB_LandTract tract2 = new ANB_LandTract(length, width);	//Creates object
		
		//Calls objects toString menthods
		System.out.println("Tract 1:");
		System.out.println(tract1);
		System.out.println("Tract 2:");
		System.out.println(tract2);
		
		//Checks tract dimension equivelency
		if (tract1.equals(tract2))
		{
			System.out.println("\nThe tracts are the same size.");
		} else {
			System.out.println("\nThe tracts are not the same size.");
		}
		keyboard.close();
	}
}
