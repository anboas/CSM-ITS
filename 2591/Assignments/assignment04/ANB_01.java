package assignment04;
/**
//***********************************************************************
'Project:           Assignment 04
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 1, 2014
'Description:      	Problem Number 01 Chapter 08
'    
'	Take data from an array and manipulate the values of it to determine
'	Average Rainfall, total Rainfall, Minimum rainfall, Maximum rainfall
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_01
{
	public static void main(String[] args)
	{
		double[] inputData = {54.2, 9.5, 27.8, 44.9, 42.9,
				46.9, 93.5, 70.2, 71.9, 30.5, 116.4, 39.9};		// Array of input data, rainfall in inches
		
		ANB_RainFall rainyYear = new ANB_RainFall(inputData);	// Creates new instance of ANB_RainFall
		
		System.out.println(rainyYear);							// Calls default method, toString
	}

}