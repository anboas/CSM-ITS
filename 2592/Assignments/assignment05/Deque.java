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

	public void addFront(E element) {

	}

	public E removeFirst() {

		return null;
	}

	public void addRear(E element) {

	}

	public E removeRear() {

		return null;
	}

	public int getSize() {
		return size;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



}
