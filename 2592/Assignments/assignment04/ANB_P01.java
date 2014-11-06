package assignment04;

import java.util.Scanner;

/***********************************************************************
'Project: 			Assignment 04
'Programmer: 		Adam Boas
'Company Info:		anboas@gmail.com (240) 561-8173
'Date:				Oct 26, 2014
'Description: 		Problem Number 01 Chapter 19
'
' Your Own Array-Based List Class
'
' 	Write your own array-based list class from scratch, using generics. You can either
'	implement the GeneralList interface shown in this  chapter, or write your
'	own interface. Either way, be sure to implement all of the common list operations.
'
' HONOR CODE: I pledge that this program represents my own program code.
' I received help from NO ONE in designing and debugging my program.
'
'
 **********************************************************************/

public class ANB_P01 {

	public static void main(String[] args)
	{
		// Create a StringListType object.
		GeneralListType myGeneralList = new GeneralListType();

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a line of input.
		System.out.println("Enter a series of words:");
		String input = keyboard.nextLine();

		// Tokenize the GeneralList.
		Object[] tokens = input.split(" ");

		// Add each of the tokens to the list.
		for (Object s : tokens)
			myGeneralList.add(s);

		// Display the list.
		System.out.println("\nHere are the words you entered:");
		displayList(myGeneralList);

		// Remove the first and last elements.
		myGeneralList.remove(0);
		myGeneralList.remove(myGeneralList.size() - 1);

		// Display the list.
		System.out.println("\nNow with the first and last removed:");
		displayList(myGeneralList);

		// Add new elements to the beginning and end of the list.
		myGeneralList.add(0, "dog");
		myGeneralList.add("cat");

		// Display the list.
		System.out.println("\nNow with new first and last elements:");
		displayList(myGeneralList);

		keyboard.close();
	}

	/**
	 * Displays the elements in a GeneralList
	 * @param list
	 */
	public static void displayList(GeneralList<?> list)
	{
		for (int index = 0; index < list.size(); index++)
		{
			System.out.println("Index " + index + ": " +
					list.get(index));
		}
	}
}
