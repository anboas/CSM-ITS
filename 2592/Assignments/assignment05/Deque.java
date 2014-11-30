package assignment05;

import java.util.Iterator;

public class Deque<E> implements Iterable<E> {

	private int size; // Size of Deque list
	private Node front; // First node in the list
	private Node rear; // Last node in the list

	private class Node {
		E element;
		Node next;
		Node prev;
	}

	public boolean isEmpty() {
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

		Node tempFront = front;
		front = front.next;

		// Adjust node pointers
		if (front == null) {
			rear = null;
		} else {
			front.prev = null;
		}

		size++;

		return tempFront.element;
	}

	public void addRear(E element) {

	}

	public E removeRear() {

		return null;
	}



	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



}
