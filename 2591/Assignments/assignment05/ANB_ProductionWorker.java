package assignment05;
import java.text.DecimalFormat;

public class ANB_ProductionWorker extends ANB_Employee {

	private String shift; // Employee shift
	private double payRate; // Employee pay
	DecimalFormat dollar = new DecimalFormat("$#,##0.00");

	/**
	 * Constructor for ProductionWorker
	 * Inherits from Super
	 * @param name
	 * @param employeeNumber
	 * @param hireDate
	 * @param shift
	 * @param payRate
	 */
	public ANB_ProductionWorker(String name, String employeeNumber,
			String hireDate, String shift, double payRate) {
		super(name, employeeNumber, hireDate);
		this.shift = shift;
		this.payRate = payRate;
	}

	/**
	 * No-Args Constructor
	 * Inherits from Super
	 */
	public ANB_ProductionWorker() {
		super();
		this.shift = "";
		this.payRate = 0.0;
	}

	/**
	 * Set Shift
	 * @param shift
	 */
	public void setShift(String shift) {
		this.shift = shift;
	}

	/**
	 * Set PayRate
	 * @param payRate
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	/**
	 * Get Shift
	 * @return
	 */
	public String getShift() {
		return this.shift;
	}

	/**
	 * Get PayRate
	 * @return
	 */
	public double getPayRate() {
		return this.payRate;
	}

	/**
	 * ProductionWorker toString override
	 */
	public String toString() {

		String str1 = super.toString();
		str1 += "\nShift: ";
		if (shift.equals("Day")) {
			str1 += "Day";
		} else if (shift.equals("Night")) {
			str1 += "Night";
		} else {
			str1 += "Invalid shift";
		}
		str1 += ("\nHourly Pay Rate: " + dollar.format(payRate));
		return str1;
	}
}