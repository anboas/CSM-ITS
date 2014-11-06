package assignment04;

/***********************************************************************
'Project: 			Assignment 04
'Programmer: 		Adam Boas
'Company Info:		anboas@gmail.com (240) 561-8173
'Date:				Oct 26, 2014
'Description: 		Problem Number 01 Chapter 20
'
' Generic Linked Lists
'
' 	Modify the double-linked list class presented in this chapter so it
'	works with generic types. Add the following methods drawn from the
'	java.util.List interface:

'		• void clear(): remove all elements from the list.
'		• E get(int index): return the element at position index in the list.
'		• E set(int index, E element): replace the element at the specified
'			position with the specified element and return the previous element.

'	Test your generic linked list class by processing a list of numbers of
'		type double.
'
' HONOR CODE: I pledge that this program represents my own program code.
' I received help from NO ONE in designing and debugging my program.
'
'	Use Inputs: 23.2, -9.8, 567.32, 2.0, -756.4
'
 **********************************************************************/

public class ANB_P02 {

	public static void main(String[] args) {

		// Create new DLinkedList
		DLinkedList<String> linkedExample = new DLinkedList<String>();

		// Added items to the DLinkedList
		linkedExample.add("String 0");
		linkedExample.add("String 1");
		linkedExample.add("String 2");
		linkedExample.add("String 3");
		linkedExample.add("String 4");

		// DLinkedList after additions
		System.out.println("The linked list is: \n" + linkedExample.toString());

		//		// Clears DLinkedList
		//		linkedExample.clear();
		//
		//		// DLinkedList after clearing
		//		System.out.println("The cleared list: " + linkedExample.toString());

		System.out.println(linkedExample.get(2));
	}

}
