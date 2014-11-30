package assignment05;
import java.util.Iterator;

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

	private static DoubleLinkListDeque<String> dequeLL = new DoubleLinkListDeque<String>();
	private static Iterator<String> dLLIterator;

	public static void main(String[] args) throws Exception {

		dequeLL.addFront("alpha");
		printList("add front");

		dequeLL.addRear("beta");
		printList("add rear");

		dequeLL.addRear("gamma");
		printList("add rear");

		dequeLL.addRear("delta");
		printList("add rear");

		dequeLL.addRear("epsilon");
		printList("add rear");

		dequeLL.removeFront();
		printList("remove front");

		dequeLL.removeRear();
		printList("remove rear");
	}

	private static void printList(String operation) {
		System.out.println("\nAfter doing " + operation + ", elements in list are:");
		dLLIterator = dequeLL.iterator();
		while (dLLIterator.hasNext()) {
			System.out.println(dLLIterator.next());
		}
	}
}
