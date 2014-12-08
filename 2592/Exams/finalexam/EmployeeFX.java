package finalexam;

import java.text.DecimalFormat;

public class EmployeeFX {

	private final int id;
	private final String firstName;
	private final String lastName;
	private final boolean salaried;
	private final double salary;
	private final DecimalFormat decForm = new DecimalFormat("#.00");

	public EmployeeFX(int id, String firstName, String lastName,
			boolean salaried, double salary) {

		this.id = validateField(id);
		this.firstName = validateField(firstName);
		this.lastName = validateField(lastName);
		this.salaried = salaried;
		this.salary = validateField(salary);

	}

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
		str += "\t" + this.firstName;
		str += "\t" + this.lastName;
		str += "\t" + this.salaried;
		str += "\t" + this.salary;
		return str;
	}

}
