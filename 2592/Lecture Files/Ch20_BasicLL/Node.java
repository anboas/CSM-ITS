package Ch20_BasicLL;

public class Node {
	// keep fields public for easy access see Horseman comment
	String value;
	Node nextNode;

	public Node(String value, Node nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}

	public Node(String value) {
		this.value = value;
		// Note the use of null in this constructor
		nextNode = null;
	}

}
