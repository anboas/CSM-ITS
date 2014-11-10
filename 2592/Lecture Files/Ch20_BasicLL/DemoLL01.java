package Ch20_BasicLL;

public class DemoLL01 {

	public static void main(String[] args) {
		// This program demonstrates a list that is empty a list with one item.
		// Node myEmptyList = null;
		Node myList01 = new Node("Bob");
		// head points to the first element of the list(at this point)
		Node head = myList01;
		myList01.value = "XXX";
		myList01.nextNode = new Node("Carol");
		myList01.nextNode.value = "YYY";
		myList01.nextNode.nextNode = new Node("Debby");

		// Adding an element at the head of the list
		// Note two element constructor

		Node p = new Node("Allan", myList01);

		// Reset head
		head = p;

		// ADD A NEW NODE IN THE MIDDLE OF THE LIST

		Node bobName = head.nextNode; // Save pointer to Bob
		Node carolName = bobName.nextNode; // Save pointer to Carol
		// OR
		// Node carolName = head.nextNode.nextNode;

		// ADD BRAD AFTER BOB AND BEFORE CAROL

		bobName.nextNode = new Node("Brad", carolName);

		// YOU COULD HAVE ALSO USED THIS CODE
		// myList01.nextNode = new Node ("Brad", myList01.nextNode);

		// Traversing a List
		DisplayLL(head);
		// try DisplayLL(carolName);

		// Demo head still references first element in list
		System.out.println("\nHead Value: " + head.value);

	}

	public static void DisplayLL(Node thisList)

	{
		// Traversing a List
		Node temp = null;
		temp = thisList;
		System.out.println("\n");
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.nextNode;
		}
		System.out.println("\n");
	}
}
