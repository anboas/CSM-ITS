package Ch20_BasicLL;


public class linklist20 {	
	
	// Reference to the first node in the list
	 private Node first = null;

	/**
	 * Constructor. Builds a linked list.
	 */

	public linklist20() {
		// Incrementally build the list
		// Chuck Debby Elaine Free
		first = new Node("xDebgggby");
		/*first.next = new Node("Elajjjjine");
		first.next.next = new Node("Frkkked");
		first = new Node("Chzzuck", first);*/

		 String[] names = { "zBffddob", "mAlffflan" };

		// Use a loop to add all names in the array to the
		// front of the linked list to build the list
		// Allan Bob Chuck Debby Elaine Fred
		for (String s : names)
			first = new Node(s, first);
	}

	

	public void print() {
		Node ref = first;
		while (ref != null) {
			System.out.print(ref.value + " ");
			ref = ref.nextNode;
		}
	}	

	public static void main(String[] args) {
		 
		linklist20  ll20 = new linklist20();
		String str = "The contents of the list are:";
		System.out.println(str);
		ll20.print();
	}

}
