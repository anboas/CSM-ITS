package Ch18_Collections;
import java.util.Comparator;

/**
 * File:&emsp; EmployeeOrderingTest.java<br />
 * Project:&emsp; C18<br />
 * 
 * <br />
 */

public class EmployeeOrderingTest {

	static final Comparator<Employee> EMPLOYEE_ID = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e1.getID().compareTo(e2.getID());
		}
	};

	static final Comparator<Employee> SALARY = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e1.getSalary().compareTo(e2.getSalary());
		}
	};

}


