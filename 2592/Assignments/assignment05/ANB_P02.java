package assignment05;

/***********************************************************************
'Project: 			Assignment 05
'Programmer: 		Adam Boas
'Company Info:		anboas@gmail.com (240) 561-8173
'Date:				Nov 30, 2014
'Description: 		Deque
'
'
' 	A deque is a list based collection that allows additions and
'	removals to take place at both ends but nowhere else.  A deque
'	supports the operations addFront(x), removeFront(), addRear(x),
'	removeRear(), size() and empty.  Write a class that implements
'	a deque that stores strings using a doubly linked list that you
'	code yourself. Demonstrate all your class operations (print list
'	on console after each operation) with five strings.  Use the
'	strings alpha, beta, gamma, delta and epsilon.
'
' HONOR CODE: I pledge that this program represents my own program code.
' I received help from NO ONE in designing and debugging my program.
'
'
 **********************************************************************/

public class ANB_P02 {

	private static ArrayDeque<String> dequeArray = new ArrayDeque<String>(12);

	public static void main(String[] args) throws Exception {

		dequeArray.addFront("alpha");
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

		dequeArray.addRear("beta");
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

		dequeArray.addRear("gamma");
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

		dequeArray.addRear("delta");
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

		dequeArray.addRear("epsilon");
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

		dequeArray.removeFront();
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

		dequeArray.removeRear();
		System.out.print("\n\nDeque after operation: " + dequeArray.toString());

	}
}
