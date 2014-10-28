package midterm;

import java.util.Set;

public class FileSearchUtilities {
	/**
	 * Perform binary search on a Comparable Array
	 * 
	 * @param array
	 * @param value
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int binarySearch(Comparable[] array, String value) {
		int first;
		int last;
		int middle;
		int position;
		int searchPerm = 0;
		boolean found;

		value = value.toUpperCase();
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;

		while (!found && first <= last) {
			middle = (first + last) / 2;
			if (array[middle].equals(value)) {
				found = true;
				position = middle;
				searchPerm++;
			} else if (array[middle].compareTo(value) > 0) {
				last = middle - 1;
				searchPerm++;
			} else {
				first = middle + 1;
				searchPerm++;
			}
		}
		if (found) {
			System.out.println("\nFound " + value + " after " + searchPerm
					+ " perumtations at " + position + ".");
		} else {
			System.out.println("\nDid not find " + value + " after "
					+ searchPerm + " perumtations.");
		}

		return position;
	}

	/**
	 * Perform a sequential search on a Set on a generic type
	 * 
	 * @param currentSet
	 * @param value
	 * @return
	 */
	public static boolean hashSearch(Set<String> currentSet, String value) {
		boolean found = false;

		if (currentSet.contains(value)) {
			found = true;
		}

		if (found) {
			System.out.println("FOUND: " + value);
		}
		return found;
	}
}
