package Assignment02;


import java.util.ArrayList;

public class ObjectBinarySearcher {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int search(Comparable[] array, String value) {
		int first;
		int last;
		int middle;
		int position;
		boolean found;

		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;

		while (!found && first <= last) {
			middle = (first + last) / 2;
			if (array[middle].equals(value)) {
				found = true;
				position = middle;
			} else if (array[middle].compareTo(value) > 0) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}
		return position;
	}

	public static int search(ArrayList<String> array, String value) {
		int first;
		int last;
		int middle;
		int position;
		boolean found;

		first = 0;
		last = (array.size() - 1);
		position = -1;
		found = false;

		while (!found && first <= last) {
			middle = (first + last) / 2;
			if (array.get(middle).equals(value)) {
				found = true;
				position = middle;
			} else if ((array.get(middle)).compareTo(value) > 0) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}
		return position;
	}
}
