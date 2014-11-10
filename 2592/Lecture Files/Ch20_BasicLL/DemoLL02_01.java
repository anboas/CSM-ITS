package Ch20_BasicLL;

public class DemoLL02_01 {
	
	public static void main(String[] args) {

		Node myList01 = new Node("Bob");

		System.out.println("\nPrinting the value of the first node");
		System.out.println(myList01.value);

		System.out.println("\nPrinting the node reference ");
		System.out.println(myList01);

		// head points to the first element of the list(at this point)
		Node head = myList01;
		System.out.println("\nPrinting the value of the head");
		System.out.println(head.value);
		System.out.println("\nPrinting the head node reference ");
		System.out.println(head);

		System.out.println("\nPrinting the next node reference ");
		System.out.println(myList01.nextNode);

	}

}
