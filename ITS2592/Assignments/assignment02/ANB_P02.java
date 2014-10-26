package assignment02;

/***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 15, 2014
'Description:      	Problem Number 03 Chapter 16
'    
'	Searching for Objects with the Binary Search Algorithm
'
'	The IntBinarySearcher class presented in this chapter searches an int
'	array for a specific value. Create an ObjectBinarySearcher class that 
'	can search an array of Comparable objects. Demonstrate the class in a 
'	program that searches for a String in an array of String objects.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P02 {
	public static void main(String[] args) {

		// Strings for Sorting
		String[] inputs = { "MARY", "PATRICIA", "LINDA", "BARBARA",
				"ELIZABETH", "JENNIFER", "MARIA", "SUSAN", "MARGARET",
				"DOROTHY", "LISA", "NANCY", "KAREN", "BETTY", "HELEN",
				"SANDRA", };
		
		// String to search for within inputs
		String searchTerm = "LISA";
		
		// Integer value of where the string was found in the array
		int searchTermFoundIndex;

		// Display the unaltered array
		System.out.println("\nOriginal Order: ");
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(i + "\t" + inputs[i]);
		}
		
		// Sort array
		ObjectInsertionSorter.ObjectInsertionSort(inputs);

		// Display altered array
		System.out.println("\nSorted Order: ");
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(i + "\t" + inputs[i]);
		}
		
		// Search array for searchTerm and store index from altered array
		searchTermFoundIndex = ObjectBinarySearcher.search(inputs, searchTerm);

		// If the search term was found, inform us, if not, inform us
		if (searchTermFoundIndex >= 0) {
			System.out.println("\n" + searchTerm + " was found at: "
					+ searchTermFoundIndex);
		} else {
			System.out.println("\n" + searchTerm
					+ " was not found in the array.");
		}
	}
}
