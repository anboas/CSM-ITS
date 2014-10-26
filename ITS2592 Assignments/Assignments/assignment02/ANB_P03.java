package assignment02;

/***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 15, 2014
'Description:      	Problem Number 04 Chapter 16
'    
'	Charge Account Validation
'
'	The IntBinarySearcher class presented in this chapter searches an int
'	array for a specific value. Create an ObjectBinarySearcher class that 
'	can search an array of Comparable objects. Demonstrate the class in a 
'	program that searches for a String in an array of String objects.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'************************************************************************/

public class ANB_P03 {
	public static void main(String[] args) {

		int array[] = { 5658845, 8080152, 1005231, 4520125, 4562555, 6545231,
				7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 8451277,
				7825877, 7881200, 1302850, 1250255, 4581002 };

		checkNumber(array, 5658845);	// Should be valid
		checkNumber(array, 1234565);	// Should not be valid

	}

	private static void checkNumber(int[] array, int number) {
		if (SequentialSearch.contains(array, number)) {
			System.out.println(number + "\tIs a valid account number.");
		} else {
			System.out.println(number + "\tIs not a valid account number.");
		}
	}

}
