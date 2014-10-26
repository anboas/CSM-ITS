package assignment03;
public class ANB_01
{
	/**
	//***********************************************************************
	'Project:           Assignment 03
	'Programmer:     	Adam Boas
	'Company Info:  	anboas@gmail.com (240) 561-8173
	'Date:              Feb 6, 2014
	'Description:      	Problem Number 01 Chapter 05
	'    
	'	This program will ask the user to enter the width and length of a rectangle.
	'	It will then display the rectangle's area, length and width.
	'
	'  HONOR CODE: I pledge that this program represents my own program code.
	'  I received help from NO ONE in designing and debugging my program.
	'
	'**********************************************************************/
	public static void main(String[] args)
	{
		ANB_Rectangle box = new ANB_Rectangle();
		
		box.setWidth();
		box.setLength();

		box.displayData(box.getWidth(),box.getLength(),box.calculateArea());
	}
}