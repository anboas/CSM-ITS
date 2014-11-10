package Ch20_BasicLL;

public class DemoLL02 {
	/**
	 * Remove a Node
	 */
	public static void main(String[] args) {

		Node myList01 = new Node("Bob");
		// head points to the first element of the list(at this point)
		Node head = myList01;
		myList01.nextNode = new Node("Carol");
		myList01.nextNode.nextNode = new Node("Debby");
		Node p = new Node("Allan", myList01);
		// Reset head
		head = p;
		DisplayLL(head);

		Node b = head.nextNode;
		 
		Node d = b.nextNode.nextNode;
	 
		
		System.out.println(d);
		// REDEFINE WHERE NEXT NODE IS
		// ELIMINATE MIDDLE NODE
		b.nextNode = d;

		DisplayLL(head);

	}

	public static void DisplayLL(Node thisList) {
		// Traversing a List
		Node temp = null;
		temp = thisList;
		System.out.println("\n");
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.nextNode;
		}
	}

}
 
