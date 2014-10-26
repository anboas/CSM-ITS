package assignment04;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ANB_Analyzer {

	private static double[] numbers;
	private int count;

	/**
	 * Constructor
	 * 
	 * @param filename
	 *            The file input
	 * @throws IOException
	 */
	public ANB_Analyzer(String filename) throws IOException {
		getNumbers(filename);
	}

	/**
	 * Gets the numbers to put into the array
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	private int getNumbers(String filename) throws IOException {

		count = getNumberOfValues(filename);

		File file = new File(filename);
		Scanner inFile = new Scanner(file);

		numbers = new double[count];

		for (int i = 0; i < count; i++) {
			numbers[i] = inFile.nextDouble();
		}
		inFile.close();
		return count;

	}

	/**
	 * Gets the amount of elements in the array
	 * 
	 * @param filename
	 * @return amount of elements in the array
	 * @throws IOException
	 */
	private int getNumberOfValues(String filename) throws IOException {
		File file = new File(filename);
		Scanner inFile = new Scanner(file);

		count = 0;

		while (inFile.hasNext()) {
			inFile.nextDouble();
			count++;
		}
		inFile.close();

		return count;

	}

	/**
	 * Gets the total value of the numbers in the array
	 * 
	 * @param array
	 * @return total value of the numbers in the array
	 */
	public static double getTotal(double[] array) {
		double total = 0;

		for (int i = 0; i < array.length; i++)
			total += array[i];

		return total;
	}

	/**
	 * getAverage
	 * 
	 * @param array
	 *            Input the array from the main
	 * @return the average value of the array
	 */
	public static double getAverage(double[] array) {
		return getTotal(array) / (array.length);
	}

	/**
	 * getHighest
	 * 
	 * @param array
	 *            Input the array from the main
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
	 * 
	 * @param array
	 *            Input the array from the main
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
	 * @param array
	 *            Input the array from the main
	 * @return the toString method, prints all info
	 */
	public String toString() {
		DecimalFormat decForm = new DecimalFormat("#0.00");
		String str1 = "\n";
		str1 += "There are " + numbers.length + " elements in the array\n";
		str1 += "The smallest value in the array is: "
				+ decForm.format(getLowest(numbers)) + "\n";
		str1 += "The largest value in the array is: "
				+ decForm.format(getHighest(numbers)) + "\n";
		str1 += "The sum of the values in the array is: "
				+ decForm.format(getTotal(numbers)) + "\n";
		str1 += "The average of the values in the array is: "
				+ decForm.format(getAverage(numbers)) + "\n";
		return str1;
	}

	/**
	 * Prints the values of the array
	 */
	public void printArray(int columns) {

		System.out.println("The Array elements printed backwards are: \n");
		for (int i = 0; i < numbers.length / 2; i++) {
			if (i % columns == 0 && i > 0) {
				System.out.println();
			}
			System.out.print("\t");
			double temp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = temp;
			System.out.print(numbers[i] + "\t");
		}
	}

}
