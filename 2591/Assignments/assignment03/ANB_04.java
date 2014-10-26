package assignment03;
import java.text.DecimalFormat;
/**
//***********************************************************************
'Project:           Assignment 03
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Feb 6, 2014
'Description:      	Problem Number 05 Chapter 06
'    
'	Design a Payroll class that has fields for an employee's name, ID number, hourly pay rate,
'	and number of hours worked. Write the appropriate accessor and mutator methods and
'	a constructor that accepts the employee's name and II) number as arguments. The class
'	should also have a method that returns the employee's gross pay, which is calculated as the
'	number of hours worked multiplied by the hourly pay rate. Write a program that demon-
'	strates the class by treating a Payroll object, then asking the user to enter the data for an
'	employee. The program should display the amount of gross pay earned.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_04 
{

	public static void main(String[] args)
	{
		String grossPay;
		
		//Format for grossPay display
		DecimalFormat decForm = new DecimalFormat("#0.00");
		
		//Add an employee to payroll
		ANB_Payroll employeeOne = new ANB_Payroll();
		
		//Return employee's grossPay
		grossPay = decForm.format(employeeOne.calculateGrossPay());
		System.out.println("The employee's gross pay is: \t$" + grossPay);
		
		//Display all employee information
		//employeeOne.displayEmployeeInformation();
	}
}
