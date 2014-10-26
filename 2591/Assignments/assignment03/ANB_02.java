package assignment03;

public class ANB_02
{
	/**
	//***********************************************************************
	'Project:           Assignment 03
	'Programmer:     	Adam Boas
	'Company Info:  	anboas@gmail.com (240) 561-8173
	'Date:              Feb 6, 2014
	'Description:      	Problem Number 01 Chapter 06
	'
	'	This program will create three instances of the Employee class.
	'	The program will then display, in a formatted style, all three instances.
	'
	'
	'  HONOR CODE: I pledge that this program represents my own program code.
	'  I received help from NO ONE in designing and debugging my program.
	'
	'**********************************************************************/
	public static void main(String[] args)
	{
		//Use of constructor with all four arguments passed into it
		ANB_Employee employeeOne = new ANB_Employee("Susan Meyers",47899,"Accounting","Vice President");
		ANB_Employee employeeTwo = new ANB_Employee("Mark Jones",39119,"IT\t","Programmer");
		ANB_Employee employeeThree = new ANB_Employee("Joy Rogers",81774,"Manufacturing","Engineer");

		//Output Display
		System.out.println("Name\t\tID Number\tDepartment\tPosition");
		System.out.println("----------------------------------------------------------------");
		employeeOne.displayEmployee();
		employeeTwo.displayEmployee();
		employeeThree.displayEmployee();
	}
}
