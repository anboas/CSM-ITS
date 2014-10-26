package assignment05;
/**
//***********************************************************************
'Project:           Assignment 05
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 12, 2014
'Description:      	Problem Number 01 Chapter 09
'    
'	This class has three overloaded static methods for calculating the areas of 
'	following geometric shapes:
'		Circle
'		Rectangle
'		Cylinder
'
'	This Programming Challenge is Problem 01 of Chapter 08 in the main book
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
import java.text.DecimalFormat;

public class ANB_P01 {

	public static void main(String args[]) {
		
		DecimalFormat decForm = new DecimalFormat("#0.00");
		
		System.out.println("The area of a circle with a radius of 3.0 is: \n\t"
				+ decForm.format(ANB_Area.getArea(3)));
		System.out
				.println("The area of a rectangle with a length of 7 and a width of 9 is: \n\t"
						+ ANB_Area.getArea(7, 9));
		System.out
				.println("The area of a cylinder with a radius of 2.1 and a height of 8.7 is: \n\t"
						+ decForm.format(ANB_Area.getArea(2.1, 8.7)));
	}
}
