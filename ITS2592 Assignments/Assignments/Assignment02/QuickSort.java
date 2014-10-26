package Assignment02;

import java.util.ArrayList;

public class QuickSort {

	public static void quickSort(ArrayList<String> array) {
		doQuickSort(array, 0, array.size() - 1);
	}

	private static void doQuickSort(ArrayList<String> array, int start, int end) {
		int pivotPoint;

		if (start < end) {
			pivotPoint = partition(array, start, end);
			doQuickSort(array, start, pivotPoint - 1);
			doQuickSort(array, pivotPoint + 1, end);
		}
	}

	private static int partition(ArrayList<String> array, int start, int end) {
		String pivotValue;
		int endOfLeftList;
		int mid;

		mid = (start + end) / 2;
		swap(array, start, mid);
		pivotValue = array.get(start);
		endOfLeftList = start;

		for (int scan = start + 1; scan <= end; scan++) {
			if (array.get(scan).compareTo(pivotValue) < 0) {
				endOfLeftList++;
				swap(array, endOfLeftList, scan);
			}
		}

		swap(array, start, endOfLeftList);

		return endOfLeftList;
	}

	/**
	 * Swap two elements in an array list
	 * 
	 * @param array
	 *            ArrayList
	 * @param a
	 *            Index of element 1
	 * @param b
	 *            Index of element 2
	 */
	private static void swap(ArrayList<String> array, int a, int b) {
		String temp;

		temp = array.get(a);
		array.set(a, array.get(b));
		array.set(b, temp);
	}

	/**
	 * ObjectInsertionSort for ArrayList
	 * 
	 * @param array
	 *            ArrayList
	 */
	public static void ObjectInsertionSort(ArrayList<String> array) {
		for (int index = 1; index < array.size(); index++) {
			String unsortedValue = array.get(index);
			int scan = index;

			while (scan > 0 && unsortedValue.compareTo(array.get(scan - 1)) < 0) {
				array.set(scan, array.get(scan - 1));
				scan--;
			}
			array.set(scan, unsortedValue);
		}

	}
}
