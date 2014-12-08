package finalexam;

import java.util.ArrayList;

public class ANB_FE01 {

	public static void main(String[] args) {

		ArrayList<EmployeeFX> employees = new ArrayList<EmployeeFX>();
		employees.add(new EmployeeFX(200, "Caroline", "James", false, 37654));
		employees.add(new EmployeeFX(2, "Julian", "James", false, 46499));
		employees.add(new EmployeeFX(1, "Conor", "Habgren", true, 88767));
		employees.add(new EmployeeFX(10, "Tillie", "Donalan", true, 98456));
		employees.add(new EmployeeFX(15, "Alice", "Jeanu", true, 72821));
		employees.add(new EmployeeFX(12, "Fred", "Habgren", false, 28767));
		employees.add(new EmployeeFX(103, "Mary", "Donalan", false, 28456));
		employees.add(new EmployeeFX(135, "Ed", "Jeanu", true, 52821));


	}
}
