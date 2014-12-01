package assignment05;

public class ArrayDeque<E> {

	private static final int MIN_CAPACITY = 8;
	private E[] elements;
	private int head;
	private int tail;

	@SuppressWarnings("unchecked")
	/**
	 * Constructor
	 * @param numElements Number of elements to allocate
	 */
	public ArrayDeque(int numElements) {
		if (numElements < MIN_CAPACITY) {
			int initCapacity = MIN_CAPACITY;
			elements = (E[]) new Object[initCapacity];
		} else {
			elements = (E[]) new Object[numElements];
		}
	}

	/**
	 * Doubles array capacity
	 */
	private void increaseCapacity() {
		int newCap = elements.length << 1;
		int nextTail = elements.length;
		Object[] temp = new Object[newCap];
		System.arraycopy(elements, head, temp, 0, (nextTail - head));
		System.arraycopy(elements, 0, temp, (nextTail - head), head);

		head = 0;
		tail = nextTail;
	}

	/**
	 * Add elements to the top of the deque
	 * @param element
	 */
	public void addFront(E element) {
		if (element == null) {
			throw new NullPointerException();
		}
		elements[head = (head - 1) & (elements.length - 1)] = element;
		if (head == tail) {
			increaseCapacity();
		}
	}

	/**
	 * Remove elements from the top of the deque
	 * @return
	 */
	public E removeFront() {
		int h = head;
		E temp = elements[head];

		elements[h] = null;
		head = (h + 1) & (elements.length - 1);

		if (temp == null) {
			return null;
		} else {
			return temp;
		}
	}

	/**
	 * Add elements to the bottom of the deque
	 * @param element
	 */
	public void addRear(E element) {
		if (element == null) {
			throw new NullPointerException();
		}
		elements[tail] = element;
		if ((tail = (tail + 1) & (elements.length - 1)) == head) {
			increaseCapacity();
		}
	}

	/**
	 * Remove elements from the bottom of the deque
	 * @return
	 */
	public E removeRear() {
		int t = (tail - 1) & (elements.length - 1);
		E temp = elements[t];

		elements[t] = null;
		tail = t;

		if (temp == null) {
			return null;
		} else {
			return temp;
		}
	}

	@Override
	/**
	 * Prints the deque array
	 */
	public String toString() {
		String str = "\n";


		for(int i = 0; i < elements.length; i++) {
			if (elements[i] == null){
			} else {
				str += "\n" + i + " " + elements[i];
			}
		}

		return str;
	}

}
