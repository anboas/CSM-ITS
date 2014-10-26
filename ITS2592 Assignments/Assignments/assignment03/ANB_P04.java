package assignment03;
/***********************************************************************
'Project:           Assignment 03
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 08, 2014
'Description:      	Problem Number 03 Chapter 18
'    
'	EmployeeMap Class
'
'	Create an Employee class that stores an employee’s ID number and name. 
'	Then create an EmployeeMap class that allows you to add Employee objects 
'	and look them up by their ID numbers. The EmployeeMap class should 
'	use a Map object to map ID numbers to Employee objects. Create an 
'	application to demonstrate the classes.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P04 {
	public static void main(String[] args) {

		// Create objects and stores them in a map
		EmployeeMap employeeMap = new EmployeeMap();
		employeeMap.add("A3208x", new Employee("BRENDA", "PENYA"));
		employeeMap.add("B2384z", new Employee("NANCY", "ZARKOZI"));
		employeeMap.add("A4393c", new Employee("SANDRA", "MELON"));
		employeeMap.add("C9802z", new Employee("PATRICK", "LOZE"));
		employeeMap.add("C9832x", new Employee("LOUIS", "JONES"));

		// Find employee based upon ID
		System.out.println(employeeMap.findEmployee("C9802z"));	// Invokes true response
		System.out.println(employeeMap.findEmployee("Not an employee")); // Invokes false response

		// Return total employee count
		System.out.println("\nThere are " + employeeMap.size() + " total employees.");
	}
}
