package finalexam;

import java.text.DecimalFormat;

/**
 * EmployeeFX for Fall2014 Final Exam - Written by Adam Boas
 */
public class EmployeeFX {

	private final int id;
	private final String firstName;
	private final String lastName;
	private final boolean salaried;
	private final double salary;
	private final DecimalFormat decForm = new DecimalFormat("#.00");

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param salaried
	 * @param salary
	 */
	public EmployeeFX(int id, String firstName, String lastName,
			boolean salaried, double salary) {

		// Validate fields as they're input --
		// Throws error and terminates run
		this.id = validateField(id);
		this.firstName = validateField(firstName);
		this.lastName = validateField(lastName);
		this.salaried = salaried;
		this.salary = validateField(salary);

	}

	/**
	 * Validates field based upon variable type
	 * 
	 * @param fieldInput
	 * @return
	 */
	private <E> E validateField(E fieldInput) {
		if (fieldInput instanceof String) {
			if (((String) fieldInput).trim().isEmpty()) {
				throw new IllegalArgumentException("Input must not be null.");
			}
		}
		if (fieldInput instanceof Integer) {
			if ((Integer) fieldInput < 0) {
				throw new IllegalArgumentException(
						"Input must not be less than 0.");
			}
		}
		if (fieldInput instanceof Double) {
			if ((Double) fieldInput < 0) {
				throw new IllegalArgumentException(
						"Input must not be less than 0.");
			}
		}
		return fieldInput;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		String str = "";
		str += "\t" + this.id;
		str += ", " + this.firstName;
		str += ", " + this.lastName;
		str += ", " + this.salaried;
		str += ", " + decForm.format(this.salary);
		return str;
	}

}
