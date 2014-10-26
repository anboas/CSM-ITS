package assignment04;

import java.text.DecimalFormat;


public class ANB_RainFall {

	private double[] rain; // Stores input data in new array

	/**
	 * Default Constructor
	 * 
	 * @param r
	 *            inputData holder
	 */
	public ANB_RainFall(double r[]) {
		rain = new double[r.length];
		int i = 0;

		for (i = 0; i < r.length; i++)
			rain[i] = r[i];
	}

	/**
	 * getTotalRainFall
	 * 
	 * @return total rainfall for the year
	 */
	public double getTotalRainFall() {
		double sum = 0;
		int i = 0;

		for (i = 0; i < rain.length; i++) {
			sum = sum + rain[i];
		}
		return sum;
	}

	/**
	 * getAverageRainFall Method
	 * 
	 * @return average rainfall for the year
	 */
	public double getAverageRainFall() {
		double sum = 0;
		int i = 0;

		for (i = 0; i < rain.length; i++) {
			sum = sum + rain[i];
		}
		double average = sum / rain.length;
		return average;
	}

	/**
	 * getHighestMonth
	 * 
	 * @return Returns highest month value
	 */
	public int getHighestMonth() {
		double highestRain = rain[0];
		int month = 0;

		for (int i = 0; i < rain.length; i++) {

			if (rain[i] > highestRain)
				highestRain = rain[i];
			month = i;
		}

		return month - 1;
	}

	/**
	 * getLowestMonth method
	 * 
	 * @return Returns month which has the lowest rainfall
	 */
	public int getLowestMonth() {
		double lowestRain = rain[0];
		int month = 0;

		for (int i = 1; i < rain.length; i++) {
			if (rain[i] < lowestRain) {
				lowestRain = rain[i];
				month = i;
			}
		}
		return month;
	}

	/**
	 * 
	 * @param e
	 *            Month which to request data from
	 * @return data from requested month
	 */
	public double getRainAt(int e) {
		return rain[e];
	}

	/**
	 * toString method - Prints out all data
	 */
	public String toString() {
		DecimalFormat decForm = new DecimalFormat("#0.00");
		String str1 = "\n";
		str1 += "The total rainfall for this year is: "
				+ decForm.format(getTotalRainFall()) + "\n";

		str1 += "The average rainfall for this year is: "
				+ decForm.format(getAverageRainFall()) + "\n";

		str1 += "The month with the highest amount of rain is "
				+ (getHighestMonth() + 1) + " with "
				+ decForm.format(getRainAt(getHighestMonth())) + " inches.\n";

		str1 += "The month with the lowest amount of rain is "
				+ (getLowestMonth() + 1) + " with "
				+ decForm.format(getRainAt(getLowestMonth())) + " inches.\n\n";

		return str1;
	}
}