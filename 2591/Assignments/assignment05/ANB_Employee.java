package assignment05;
public class ANB_Employee {

	String name; // Employee name
	String employeeNumber; // Employee number
	String hireDate; // Employee hire date

	/**
	 * Employee Constructor
	 * @param name
	 * @param employeeNumber
	 * @param hireDate
	 */
	public ANB_Employee(String name, String employeeNumber, String hireDate) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.hireDate = hireDate;
	}

	/**
	 * Employee no-args Constructor
	 */
	public ANB_Employee() {
		this.name = "";
		this.employeeNumber = "";
		this.hireDate = "";
	}

	/**
	 * Set Name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set Employee Number
	 * @param employeeNumber
	 */
	public void setEmployeeNumber(String employeeNumber) {
		if (isValidEmpNum(employeeNumber)) {
			this.employeeNumber = employeeNumber;
		} else {
			this.employeeNumber = "";
		}
	}

	/**
	 * Set Hire Date
	 * @param hireDate
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * Get Name
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Get Employee Number
	 * @return
	 */
	public String getEmployeeNumber() {
		return this.employeeNumber;
	}

	/**
	 * Get Hire Date
	 * @return
	 */
	public String getHireDate() {
		return this.hireDate;
	}

	/**
	 * Checks whether or not an employee number is valid
	 * @param empNum
	 * @return
	 */
	private boolean isValidEmpNum(String empNum) {
		boolean isValid = true;
		if (empNum.length() != 5)
			isValid = false;
		else {
			if ((!Character.isDigit(empNum.charAt(0)))
			 || (!Character.isDigit(empNum.charAt(1)))
			 || (!Character.isDigit(empNum.charAt(2)))
			 || (empNum.charAt(3) != '-')
			 || (!Character.isLetter(empNum.charAt(4)))
			 || (!(empNum.charAt(4) >= 'A' && empNum.charAt(4) <= 'M'))) {
				isValid = false;
			}
		}
		return isValid;
	}

	/**
	 * Employee toString override
	 */
	public String toString() {
		String str1 = "\n";
		str1 += "Name: " + this.name;
		str1 += "\nEmployee Number: ";
		if (employeeNumber.equals("")) {
			str1 += "This is an invalid employee number";
		} else {
			str1 += this.employeeNumber;
		}
		str1 += ("\nHire Date: " + this.hireDate);
		return str1;
	}
}