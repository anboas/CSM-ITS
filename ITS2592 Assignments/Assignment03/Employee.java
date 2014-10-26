public class Employee {

	private String nameFirst;
	private String nameLast;

	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		this.nameFirst = firstName;
		this.nameLast = lastName;
	}

	/**
	 * Get employee's first name
	 * @return
	 */
	public String getEmployeeNameFirst() {
		return nameFirst;
	}
	
	/**
	 * Get employees last name
	 * @return
	 */
	public String getEmployeeNameLast() {
		return nameLast;
	}

	/**
	 * Prints employee name
	 */
	@Override
	public String toString() {
		String string = "";
		string += "\nFirst Name: " + nameFirst;
		string += "\nLast Name: " + nameLast + "\n";
		return string;
	}
}