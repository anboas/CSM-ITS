package assignment04;

public class GeneralListType implements GeneralList<Object> {
	// Constants for the default capacity and
	// the resizing factor.
	private final int DEFAULT_CAPACITY = 10;
	private final int RESIZE_FACTOR = 2;

	// Private Fields
	private Object[] list; // The List
	private int elements; // Number of elements stored

	/**
	 * This constructor creates an empty list of the default capacity.
	 */
	public GeneralListType() {
		list = new Object[DEFAULT_CAPACITY];
		elements = 0;
	}

	@Override
	public void add(Object element) {
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
	public void add(int index, Object element) {
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
	public boolean contains(Object element) {
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
	public Object get(int index) {
		if (index >= elements || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return list[index];
	}

	@Override
	public int indexOf(Object element) {
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Resizes the list to twice its current length.
	 */
	private void resize() {
		// Calculate the new length, which is the current
		// length multiplied by the resizing factor.
		int newLength = list.length * RESIZE_FACTOR;

		// Create a new list.
		Object[] tempList = new String[newLength];

		// Copy the existing elements to the new list.
		for (int index = 0; index < elements; index++)
			tempList[index] = list[index];

		// Replace the existing list with the new one.
		list = tempList;
	}

}
