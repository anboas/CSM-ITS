package Ch22_Queues;
/**
 * The LinkedQueueDemo class demonstrates the use of the LinkedQueue class.
 */

public class LinkedQueueDemo {
	public static void main(String[] args) {
		LinkedQueue queue = new LinkedQueue();

		// Add 6 names
		String[] names = { "Alfonso", "Bob", "Carol", "Deborah", "Harry", "Max" };
		System.out.println("Adding names: ");
		for (String s : names) {
			System.out.print(s + " ");
			queue.enqueue(s);
		}

		System.out.println("\nState of queue is: ");
		System.out.println(queue);

		// Remove 2 names
		System.out.println("\nRemoving 2 names.");
		queue.dequeue();
		queue.dequeue();
		System.out.println("State of queue is: ");
		System.out.println(queue);

		// Add another name
		System.out.println("\nAdding the name Elaine:");
		queue.enqueue("Elaine");
		System.out.println("State of queue is: ");
		System.out.println(queue);

		// Add another name
		System.out.println("\nAdding the name Alice:");
		queue.enqueue("Alice");
		System.out.println("State of queue is: ");
		System.out.println(queue);

		// Remove 2 names
		System.out.println("\nRemoving 2 names.");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//queue.dequeue();
		//queue.dequeue();
		System.out.println("State of queue is: ");
		System.out.println(queue);

		// Remove 3 names
		System.out.println("\nRemoving 3 names.");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println("State of queue is: ");
		System.out.println(queue);

		// Add another name
		System.out.println("\nAdding the name Jean:");
		queue.enqueue("Jean");
		System.out.println("State of queue is: ");
		System.out.println(queue);

	}
}