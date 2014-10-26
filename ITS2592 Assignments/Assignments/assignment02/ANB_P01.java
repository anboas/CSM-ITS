package assignment02;

/***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 15, 2014
'Description:      	Problem Number 01 Chapter 16
'    
'	Sorting Objects with the Insertion Sort Algorithm
'
'	The insertionSort method in the IntInsertionSorter class presented 
'	in this chapter sorts an array of int values. Create an 
'	ObjectInsertionSorter class that can sort Comparable objects. 
'	Demonstrate the class in a program that sorts an array of 
'	String objects.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P01 {

	public static void main(String[] args) {
		
		// Strings for sorting
		String[] inputs = { "photograph", "taken", "from", "Houston", "Texas",
				"juxtaposes", "Earth", "oldest", "satellite", "with", "one",
				"of", "its", "youngest" };

		// Display unaltered array
		System.out.println("Original Order: ");
		for (String element : inputs) {
			System.out.println("\t" + element + " ");
		}

		// Sort array
		System.out.println("\n");
		ObjectInsertionSorter.ObjectInsertionSort(inputs);

		// Display altered array
		System.out.println("Sorted Order: ");
		for (String element : inputs) {
			System.out.println("\t" + element + " ");
		}
	}
}
