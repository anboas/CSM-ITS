package Ch18_Collections;
/**
 * File:&emsp; Employee.java<br />
 * Project:&emsp; C18<br />
 */

class Employee {
	private int id;
	private String name;
	private double salary;

	Employee(String name, int id, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Note Object
	public Integer getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
}


