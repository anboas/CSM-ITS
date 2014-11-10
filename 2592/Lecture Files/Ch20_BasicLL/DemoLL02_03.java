package Ch20_BasicLL;

public class DemoLL02_03 {
	public static void main(String[] args) {

		Node myList01 = new Node("Bob");
		// head points to the first element of the list(at this point)
		Node head = myList01;
 
		myList01.nextNode = new Node("Carol");
		myList01.nextNode.nextNode = new Node("Debby");
		myList01.nextNode.nextNode.nextNode = new Node("Ellen");
		 
		DisplayLL(head);
		System.out.println();
		Node p = new Node("Allan", myList01);
		// Reset head
		head = p;
		DisplayLL(head);
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
}
