package finalexam;

/***********************************************************************
'Project:           Final Exam
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Dec 7, 2014
'Description:      	Problem 02
'
'	FE Parsing File / JCF Review
'
'	Read the data file FA14_Names.txt  which contains last names and find
'	out how many duplicate names there are in the file; output that number.
'	Then calculate how many occurrences of each duplicate name there are.
'	Print those duplicate names and the number of occurrences of each name
'	in alphabetical order.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

import java.util.ArrayList;
import java.util.Collections;

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

		// Print Original Order
		System.out.println("Original Order: ");
		for (EmployeeFX emp : employees) {
			System.out.println(emp.toString());
		}

		// Print ascending order by ID
		System.out.println("\nOrdered by ID: (Ascending)");
		Collections.sort(employees, EmployeeFXComparator.EMPLOYEEFX_ID);
		for (EmployeeFX emp : employees) {
			System.out.println(emp.toString());
		}

		// Print ascending order by Salary
		System.out.println("\nOrdered by Salary: (Ascending)");
		Collections.sort(employees, EmployeeFXComparator.EMPLOYEEFX_SALARY);
		for (EmployeeFX emp : employees) {
			System.out.println(emp.toString());
		}
	}
}
