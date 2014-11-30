package assignment05;

import java.util.Iterator;

public class Deque<E> implements Iterable<E>{

	private int size; // Size of Deque list
	private Node front; // First node in the list
	private Node rear; // Last node in the list

	private class Node {
		E element;
		Node next;
		Node prev;
	}

	public Deque() {

	}

	public boolean empty() {
		return front == null;
	}

	public int getSize() {
		return size;
	}

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

	public void addRear(E element) throws Exception {
		if (element == null) {
			throw new Exception("Cannot insert null element");
		}

		Node newRear = rear;
		rear = newRear.prev;

		// Adjust node pointers
		if(rear != null) {
			newRear.prev = rear;
			rear.next = newRear;
		}
		rear = newRear;

		// Loop back if front is null
		if (front == null ) {
			front = rear;
		}

		size++;
	}

	public E removeRear() throws Exception {
		if (rear == null) {
			throw new Exception("Cannot remove a null element");
		}

		Node oldRear = rear;
		rear = oldRear.prev;

		// Adjust node pointers
		if (rear == null){
			rear = null;
		} else {
			rear.next = null;
		}

		size--;

		return oldRear.element;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();

		// Use p to walk down the linked list
		Node p = front;
		while (p != null) {
			strBuilder.append(p.element + "\n");
			p = p.next;
		}
		return strBuilder.toString();
	}

	@Override
	public Iterator<E> iterator() {
		return new elementIterator();
	}

	private class elementIterator implements Iterator<E> {

		private final Node currNode;

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
			return null;
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
