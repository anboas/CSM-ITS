package assignment05;

import java.util.Iterator;

public class Deque<E> implements Iterable<E> {

	private int size; // Size of Deque list
	private Node front; // First node in the list
	private Node rear; // Last node in the list

	/**
	 * Node default constructor
	 */
	private class Node {
		E element;
		Node next;
		Node prev;
	}

	/**
	 * Deque default constructor
	 */
	public Deque() {

	}

	/**
	 * Checks if front node has a null value
	 * @return True if deque is empty
	 */
	public boolean empty() {
		return front == null;
	}

	/**
	 * Returns size of deque LL
	 * @return int
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Adds an element to the front of the deque
	 * @param element
	 * @throws Exception
	 */
	public void addFront(E element) throws Exception {
		if (element == null) {
			throw new Exception("Cannot insert null element");
		}

		Node newFront = new Node();
		newFront.element = element;

		// Adjust node pointers
		if (front != null) {
			newFront.next = front;
			front.prev = newFront;
		}
		front = newFront;

		// Loop back if rear is null
		if (rear == null) {
			rear = front;
		}
		size++;
	}

	/**
	 * Removes the front element of the deque
	 * @return
	 * @throws Exception
	 */
	public E removeFront() throws Exception {
		if (front == null) {
			throw new Exception("Cannot remove a null element");
		}

		Node oldFront = front;
		front = front.next;

		// Adjust node pointers
		if (front == null) {
			rear = null;
		} else {
			front.prev = null;
		}

		size--;

		return oldFront.element;
	}

	/**
	 * Adds an element to the rear of the deque
	 * @param element
	 * @throws Exception
	 */
	public void addRear(E element) throws Exception {
		if (element == null) {
			throw new Exception("Cannot insert null element");
		}

		Node newRear = new Node();
		newRear.element = element;

		// Adjust node pointers
		if (rear != null) {
			newRear.prev = rear;
			rear.next = newRear;
		}
		rear = newRear;

		// Loop back if front is null
		if (front == null) {
			front = rear;
		}

		size++;
	}

	/**
	 * Removes an element from the rear of the deque
	 * @return
	 * @throws Exception
	 */
	public E removeRear() throws Exception {
		if (rear == null) {
			throw new Exception("Cannot remove a null element");
		}

		Node oldRear = rear;
		rear = oldRear.prev;

		// Adjust node pointers
		if (rear == null) {
			rear = null;
		} else {
			rear.next = null;
		}

		size--;

		return oldRear.element;
	}

	@Override
	/**
	 * Default constructor for deque iterator
	 */
	public Iterator<E> iterator() {
		return new elementIterator();
	}

	/**
	 * Iterator for deque
	 */
	private class elementIterator implements Iterator<E> {

		private Node currNode; // Current node to evaluate

		public elementIterator() {
			currNode = front;
		}

		@Override
		public boolean hasNext() {
			return currNode != null;
		}

		@Override
		public E next() {
			if (currNode == null) {
				try {
					throw new Exception("Null element");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			E e = currNode.element;
			currNode = currNode.next;

			return e;
		}

		@Override
		public void remove() {
			try {
				throw new Exception("Unhandled method.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
