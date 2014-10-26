package Assignment02;
import java.util.ArrayList;

public class ObjectInsertionSorter {

	/**
	 * ObjectInsertionSort for Comparable array
	 * @param array Comparable[]
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void ObjectInsertionSort(Comparable[] array) {
		for (int index = 1; index < array.length; index++) {
			Comparable unsortedValue = array[index];
			int scan = index;

			while (scan > 0 && unsortedValue.compareTo(array[scan - 1]) < 0) {
				array[scan] = array[scan - 1];
				scan--;
			}
			array[scan] = unsortedValue;
		}
	}
	
	/**
	 * ObjectInsertionSort for ArrayList
	 * @param array ArrayList
	 */
	public static void ObjectInsertionSort(ArrayList<String> array) {
		for (int index = 1; index < array.size(); index++) {
			String unsortedValue = array.get(index);
			int scan = index;
		
			while (scan > 0 &&  unsortedValue.compareTo(array.get(scan - 1)) < 0) {
				array.set(scan, array.get(scan - 1));
				scan--;
			}
			array.set(scan, unsortedValue);
		}

	}
}
