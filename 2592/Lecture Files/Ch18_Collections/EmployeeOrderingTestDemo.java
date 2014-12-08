package Ch18_Collections;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeOrderingTestDemo {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Caroline", 200, 37654));
		employeeList.add(new Employee("Julian", 2, 46499));
		employeeList.add(new Employee("Conor", 1, 88767));
		employeeList.add(new Employee("Tillie", 10, 98456));
		employeeList.add(new Employee("Alice", 15, 72821));
		
		System.out.println("\noutput");
		//Collections.sort(employeeList);
		for (Employee e : employeeList) {
			System.out.println(e.getID() + "   " + e.getName() + "   "
					+ formatter.format(e.getSalary()));
		}
		

		System.out.println("\nOrder by ID");
		Collections.sort(employeeList, EmployeeOrderingTest.EMPLOYEE_ID);
		for (Employee e : employeeList) {
			System.out.println(e.getID() + "   " + e.getName() + "   "
					+ formatter.format(e.getSalary()));
		}

		System.out.println("\nOrder by Salary");
		Collections.sort(employeeList, EmployeeOrderingTest.SALARY);
		for (Employee e : employeeList) {
			System.out.println(formatter.format(e.getSalary()) + "   "
					+ e.getName() + " " + e.getID());
		}
	}
}
