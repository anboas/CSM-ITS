package assignment03;

public class ANB_05 
{
	/**
	//***********************************************************************
	'Project:           Assignment 03
	'Programmer:     	Adam Boas
	'Company Info:  	anboas@gmail.com (240) 561-8173
	'Date:              Feb 6, 2014
	'Description:      	Problem Number 05 Chapter 06
	'    
	'	This program creates two instances of the circle class.
	'	The program then calls the toString method on both instances of the class.
	'
	'  HONOR CODE: I pledge that this program represents my own program code.
	'  I received help from NO ONE in designing and debugging my program.
	'
	'**********************************************************************/
	public static void main(String[] args)
	{
		double radiusOne = 1;
		double radiusTwo = 2.7832;
		
		ANB_Circle circleOne = new ANB_Circle(radiusOne);
		ANB_Circle circleTwo = new ANB_Circle(radiusTwo);
		System.out.println(circleOne.toString());
		System.out.println(circleTwo.toString());
	}
}
