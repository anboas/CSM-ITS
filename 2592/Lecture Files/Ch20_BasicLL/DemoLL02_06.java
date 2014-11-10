package Ch20_BasicLL;

 

public class DemoLL02_06 {

	public static void main(String[] args) {
		// Initalize pointers
		Node first = null;
		Node last = null;

		// Create first node
		Node myList01 = new Node("Bob");

		// Update Pointers
		// first points to the first element of the list
		// last points to the last element of the list
		first = myList01;
		last = myList01;

		// head points to the first element of the list(at this point)
		Node head = myList01;
		DisplayLL(last);
		
		// Create new node immediately after the first one
		last.nextNode = new Node("Carol");
		// update pointer
		last = last.nextNode;
		DisplayLL(last);
		
		last.nextNode = new Node("Debby");
		// update pointer
		last = last.nextNode;
		DisplayLL(last);
		

		last.nextNode = new Node("Ellen");
		// update pointer
		last = last.nextNode;
		DisplayLL(last);
		 
		
		System.out.println();
		Node p = new Node("Allan", myList01);
		// Reset head
		head = p;
		first = p;
		

		last.nextNode = new Node("Frank");
		// update pointer
		last = last.nextNode;
		DisplayLL(first);

		// Using the ContainsLL method
		String str1 = (ContainsLL(head, "Allan")) ? "" : " not";
		System.out.println("The word was" + str1 + " found in the list.");
		
		System.out.println("The value is to be inserted at position " + GreaterThanLL(head, "Ex"));
		
	}

	public static void DisplayLL(Node thisList) {
		// Traversing a List
		Node temp = null;
		temp = thisList;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.nextNode;
		}
	}

	/**
	 * 
	 * This method is used to determine if an item is in a linked list.<br/>
	 * ERW  <br/>
	 * 
	 * @param thisList
	 *            head of list to be searched
	 * @param match
	 *            String to search for
	 * @return true - if item is in the list; else false.
	 */
	public static boolean ContainsLL(Node thisList, String match) {

		boolean flag = false;
		// Traversing a List
		Node temp = null;
		temp = thisList;
		while (temp != null) {
			if (match.equals(temp.value)) {
				flag = true;
			}
			temp = temp.nextNode;
		}
		return flag;
	}

	/**
	 * This method is used to determine where a new item should be inserted in a
	 * sorted link list.<br/>
	 * It will maintain alphabetical sort order.<br/>
	 * ERW <br/>
	 * 
	 * @param thisList head of list where the string is to be inserted
	 * @param match String to insert in the list
	 * @return Position to insert the new item in the list (not zero based)
	 */
	
	public static int GreaterThanLL(Node thisList, String match) {

		// Traversing a List
		Node temp = null;
		temp = thisList;
		int result = 1;
		int counter = 0;
		while (temp != null && result > 0) {
			result = match.compareTo(temp.value);
			temp = temp.nextNode;
			counter++;
			// System.out.println("COUNTER IS : " + counter);
		}

		System.out.println("result is " + result + "   ");
		// This takes care of the case where the insertion is to be made at the
		// end of the list
		if (result > 0)
			counter++;
		System.out.println("Location is " + counter);
		return counter;
	}
}
