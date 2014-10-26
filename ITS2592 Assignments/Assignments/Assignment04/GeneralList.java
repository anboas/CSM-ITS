package Assignment04;

/**
 * Taken from Addison Wesley - Starting Out With Java 2nd Edition
 */
public interface GeneralList<E> {
	/**
	 * The add method adds an element to the list.
	 * 
	 * @param element
	 *            The element to add.
	 */
	public void add(E element);

	/**
	 * The add method adds an element at a specific index.
	 * 
	 * @param index
	 *            The added element's position.
	 * @param element
	 *            The element to add.
	 * @exception IndexOutOfBoundsException
	 *                When index is out of bounds.
	 */
	public void add(int index, E element);

	/**
	 * Clears the list of elements.
	 */
	public void clear();

	/**
	 * Searches the list for a specified element.
	 * 
	 * @param element
	 *            The element to search for.
	 * @return True if the list contains the element; False otherwise.
	 */
	public boolean contains(E element);

	/**
	 * Gets an element at a specific position.
	 * 
	 * @param index
	 *            The specified index.
	 * @return The element at index.
	 * @exception IndexOutOfBoundsException
	 *                When index is out of bounds.
	 */
	public E get(int index);

	/**
	 * Gets the index of the first occurrence of the specified element.
	 * 
	 * @param element
	 *            The element to search for.
	 * @return The index of the first occurrence of the element if it exists; -1
	 *         if element is not in the list.
	 */
	public int indexOf(E element);

	/**
	 * Determines whether the list is empty.
	 * 
	 * @return True if the list is empty; False otherwise.
	 */
	public boolean isEmpty();

	/**
	 * Removes a specific element from the list.
	 * 
	 * @param element
	 *            The element to remove.
	 * @return True if the element was found; false otherwise.
	 */
	public boolean remove(E element);

	/**
	 * Removes an element at a specific index.
	 * 
	 * @param index
	 *            The index of the element to remove.
	 * @return The element that was removed.
	 * @exception IndexOutOfBoundsException
	 *                When index is out of bounds.
	 */
	public E remove(int index);

	/**
	 * Replaces the element at a specified index with another element.
	 * 
	 * @param index
	 *            The index of the element to replace.
	 * @param element
	 *            The element to replace it with.
	 * @return The element previously stored at the index.
	 * @exception IndexOutOfBoundsException
	 *                When index is out of bounds.
	 */
	public E set(int index, E element);

	/**
	 * Gets the number of elements in the list.
	 * 
	 * @return The number of elements in the list.
	 */
	public int size();
}
