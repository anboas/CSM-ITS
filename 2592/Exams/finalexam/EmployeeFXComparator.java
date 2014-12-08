package finalexam;

import java.util.Comparator;

public class EmployeeFXComparator {

	static final Comparator<EmployeeFX> EMPLOYEEFX_ID = new Comparator<EmployeeFX>() {
		@Override
		public int compare(EmployeeFX emp1, EmployeeFX emp2) {
			return emp1.getId().compareTo(emp2.getId());
		}
	};

	static final Comparator<EmployeeFX> EMPLOYEEFX_SALARY = new Comparator<EmployeeFX>() {
		@Override
		public int compare(EmployeeFX emp1, EmployeeFX emp2) {
			return emp1.getSalary().compareTo(emp2.getSalary());
		}
	};

}
