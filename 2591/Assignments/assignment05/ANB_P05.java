package assignment05;
/**
//***********************************************************************
'Project:           Assignment 05
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 12, 2014
'Description:      	Problem Number 01 Chapter 11
'    
'	Write a method that accepts a String object as an argument and displays its contents backward.
'	For instance, if the string argument is "gravity" the method should display *ytivarg*.
'	Demonstrate the method in a program that asks the user to input a string and then passes it
'	to the method.
'
'	This Programming Challenge is Problem 01 of Chapter 10 in the main book.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P05 {

	public static void main(String[] args) {
		
		String name; // Employee name
		String employeeNumber; // Employee number
		String hireDate; // Employee hire date
		String shift; // Employee shift
		double payRate; // Employee pay
		
		name = "John Smith";
		employeeNumber = "123-A";
		hireDate = ("11-15-2005");
		shift = "Day";
		payRate = 18.50;
		
		ANB_ProductionWorker prodWorker1 = new ANB_ProductionWorker(name, employeeNumber, hireDate, shift, payRate);
		System.out.println(prodWorker1);
		ANB_ProductionWorker prodWorker2 = new ANB_ProductionWorker();
		
		prodWorker2.setName("Joan Jones");
		prodWorker2.setEmployeeNumber("222-L");
		prodWorker2.setHireDate("12-12-2005");
		prodWorker2.setShift("Night");
		prodWorker2.setPayRate(16.50);
		
		System.out.println(prodWorker2);
	}
}