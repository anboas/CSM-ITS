package Assignment03;
import java.util.ArrayList;

public class MyList<T extends Number> {

	private ArrayList<T> currentList = new ArrayList<T>();
	private T smallestValue = null;
	private T largestValue = null;

	/**
	 * Returns largest value in ArrayList<T>
	 * @return Largest Value
	 */
	public T largest() {
		largestValue = currentList.get(0);
		for (int i = 0; i < currentList.size() - 1; i++) {
			T currentItem = currentList.get(i);
			if (currentItem.byteValue() > largestValue.byteValue()) {
				largestValue = currentList.get(i);
			}
		}
		return largestValue;
	}

	/**
	 * Returns smallest value in ArrayList<T>
	 * @return Smallest Value
	 */
	public T smallest() {
		smallestValue = currentList.get(0);
		for (int i = 0; i < currentList.size() - 1; i++) {
			T currentItem = currentList.get(i);
			if (currentItem.byteValue() < smallestValue.byteValue()) {
				smallestValue = currentList.get(i);
			}
		}
		return smallestValue;
	}

	/**
	 * Adds to ArrayList<T>
	 * @param addThis Element to add
	 */
	public void add(T addThis) {
		currentList.add(addThis);
	}
}
