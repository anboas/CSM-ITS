package Ch20_BasicLL;

public class DemoLL02_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node myList01 = new Node("Bob");
		System.out.println("\n**************  Printing the Bob Node");
		DisplayNode(myList01);

		// head points to the first element of the list(at this point)
		Node head = myList01;

		System.out.println("\n**************  Printing the head Node");
		DisplayNode(head);

		System.out
				.println("\n**************  Printing the next node reference");
		System.out.println(myList01.nextNode);

		myList01.nextNode = new Node("Carol");
		System.out.println("\n**************  Printing the Carol Node");
		DisplayNode(myList01.nextNode);
		
		myList01.nextNode.nextNode = new Node("Debby");
		System.out.println("\n**************  Printing the Debby Node");
		DisplayNode(myList01.nextNode.nextNode);

		Node p = new Node("Allan", myList01);
		System.out.println("\n**************  Printing the p Node");
		DisplayNode(p);
		System.out.println("\n**************  Printing the p.nextNode Node");
		DisplayNode(p.nextNode);
		// Reset head
		head = p;

		Node h = head;
		Node b = h.nextNode;
		Node c = b.nextNode;
		Node d = c.nextNode;
		System.out.println(h + "            " + b + "       " + c
				+ "              " + d);

		System.out.println("\n****    ANOTHER WAY TO LOOK AT IT\n\n");
		Node moveIt = head;
		System.out.println(moveIt.value);
		moveIt = moveIt.nextNode;
		System.out.println(moveIt.value);
		moveIt = moveIt.nextNode;
		System.out.println(moveIt.value);
		moveIt = moveIt.nextNode;
		System.out.println(moveIt.value);

	}

	public static void DisplayNode(Node thisList) {

		System.out
				.println("\nPrinting the value of the node " + thisList.value);

		System.out.println("Printing the node reference    " + thisList + "\n");

	}

}
