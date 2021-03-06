package assignment04;

/**
 * @author Adam Boas
 */
public class GeneralListType<E> implements GeneralList<E> {
	// Constants for the default capacity and
	// the resizing factor.
	private final int DEFAULT_CAPACITY = 10;
	private final int RESIZE_FACTOR = 2;

	// Private Fields
	private E[] list; // The List
	private int elements; // Number of elements stored

	/**
	 * This constructor creates an empty list of the default capacity.
	 */
	@SuppressWarnings("unchecked")
	public GeneralListType() {
		list = (E[]) (new Object[DEFAULT_CAPACITY]);
		elements = 0;
	}

	@Override
	public void add(E element) {
		// If the list is full, resize it.
		if (elements == list.length) {
			resize();
		}

		// Add str to the end of the list.
		list[elements] = element;

		// Adjust the number of elements.
		elements++;
	}

	@Override
	public void add(int index, E element) {
		// First make sure the index is valid.
		if (index >= elements || index < 0)
			throw new IndexOutOfBoundsException();

		// If the list is full, resize it.
		if (elements == list.length) {
			resize();
		}

		// Shift the elements starting at index
		// to the right one position.
		for (int index2 = elements; index2 > index; index2--)
			list[index2] = list[index2 - 1];

		// Add the new element at index.
		list[index] = element;

		// Adjust the number of elements.
		elements++;
	}

	@Override
	public void clear() {
		for (int index = 0; index < list.length; index++) {
			list[index] = null;
		}
		elements = 0;
	}

	@Override
	public boolean contains(E element) {
		int index = 0; // Index counter
		boolean found = false; // Search flag

		// Step through the list. When the string
		// is found, set found to true and stop.
		while (!found && index < elements) {
			if (list[index].equals(element)) {
				found = true;
			}
			index++;
		}

		// Return the status of the search.
		return found;
	}

	@Override
	public E get(int index) {
		if (index >= elements || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return list[index];
	}

	@Override
	public int indexOf(E element) {
		int index = 0; // Index counter
		boolean found = false; // Search flag

		// Step through the list. When the string
		// is found, set found to true and stop.
		while (!found && index < elements) {
			if (list[index].equals(element)) {
				found = true;
			} else {
				index++;
			}
		}

		// Return the index of element or -1.
		if (!found) {
			index = -1;
		}
		return index;
	}

	@Override
	public boolean isEmpty() {
		return (elements == 0);
	}

	@Override
	public boolean remove(E element) {
		int index = 0; // Index counter
		boolean found = false; // Search flag

		// Perform a sequential search for element. When it is
		// found, remove it and stop searching.
		while (!found && index < elements) {
			if (list[index].equals(element)) {
				list[index] = null;
				found = true;
			}
			index++;
		}

		// If the value was found, shift all subsequent
		// elements toward the front of the list.
		if (found) {
			while (index < elements) {
				list[index - 1] = list[index];
				index++;
			}

			// Adjust the number of elements.
			elements--;
		}

		// Return the status of the search.
		return found;
	}

	@Override
	public E remove(int index) {
		if (index >= elements || index < 0)
			throw new IndexOutOfBoundsException();

		// Save the string, but remove it from the list.
		E temp = list[index];
		list[index] = null;
		index++;

		// Shift all subsequent elements toward
		// the front of the list.
		while (index < elements) {
			list[index - 1] = list[index];
			index++;
		}

		// Adjust the number of elements.
		elements--;

		// Return the string that was removed.
		return temp;
	}

	@Override
	public E set(int index, E element) {
		if (index >= elements || index < 0)
			throw new IndexOutOfBoundsException();

		// Save the existing string at that index.
		E temp = list[index];

		// Replace the string with element.
		list[index] = element;

		// Return the previously stored string.
		return temp;
	}

	@Override
	public int size() {
		return elements;
	}

	/**
	 * Resizes the list to twice its current length.
	 */
	@SuppressWarnings("unchecked")
	private void resize() {
		// Calculate the new length, which is the current
		// length multiplied by the resizing factor.
		int newLength = list.length * RESIZE_FACTOR;

		// Create a new list.
		E[] tempList = (E[]) (new Object[newLength]);

		// Copy the existing elements to the new list.
		for (int index = 0; index < elements; index++)
			tempList[index] = list[index];

		// Replace the existing list with the new one.
		list = tempList;
	}

	/**
	 * Displays the GeneralList
	 */
	public void displayList() {

		for (int index = 0; index < this.size(); index++) {
			System.out.println("Index " + index + ": " + this.get(index));
		}
	}

}
