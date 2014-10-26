package assignment04;

import java.text.DecimalFormat;

public class ANB_ArrayOperations {
	public static double getTotal(double[] array) {
		double total = 0;

		for (int i = 0; i < array.length; i++)
			total += array[i];

		return total;
	}

	/**
	 * getAverage
	 * @param array Input the array from the main
	 * @return the average value of the array
	 */
	public static double getAverage(double[] array) {
		return getTotal(array) / (array.length);
	}

	/**
	 * getHighest
	 * @param array Input the array from the main
	 * @return the highest value in the array
	 */
	public static double getHighest(double[] array) {
		double highestValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highestValue)
				highestValue = array[i];
		}
		return highestValue;
	}

	/**
	 * getLowest
	 * @param array Input the array from the main
	 * @return the lowest value in the array
	 */
	public static double getLowest(double[] array) {
		double lowestValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowestValue) {
				lowestValue = array[i];
			}
		}
		return lowestValue;
	}

	/**
	 * 
	 * @param array Input the array from the main
	 * @return the toString method, prints all info
	 */
	public static String toString(double[] array) {
		DecimalFormat decForm = new DecimalFormat("#0.00");
		String str1 = "\n";
		str1 += "There are " + array.length + " elements in the array\n";
		str1 += "The smallest value in the array is: " + decForm.format(getLowest(array))
				+ "\n";
		str1 += "The largest value in the array is: " + decForm.format(getHighest(array))
				+ "\n";
		str1 += "The sum of the values in the array is: " + decForm.format(getTotal(array))
				+ "\n";
		str1 += "The average of the values in the array is: " + decForm.format(getAverage(array))
				+ "\n";
		return str1;
	}

}
