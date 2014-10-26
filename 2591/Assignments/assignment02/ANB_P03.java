package assignment02;
import java.util.Scanner;

/**
//***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 31, 2014
'Description:      	Problem Number 01 Chapter 04
'    
'   Write a program that asks the user for a positive nonzero integer value.
'	The program should use a loop to get the sum of all the integers from 1 up to
'	the number entered. For example, if the user enters 50, the loop will find the sum
'	of 1, 2, 3, 4,...50.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NAME OR NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P03
{	
	public static void main(String[] args) 
	{
		int userInputInt;
		int count = 1;
		int sumOfAll = 0;
		String userInputString;
		
		Scanner getValue = new Scanner(System.in);	//Scanner to handle user input
		System.out.println("Please input a positive nonzero ingteger value.");	//Stating our criteria for input
		
		userInputString = getValue.nextLine();
		userInputInt = Integer.parseInt(userInputString);
		
		while (count < (userInputInt+1))
		{
			sumOfAll = sumOfAll + count;
			count++;
			
			//Used for debugging purposes
			//System.out.println(count);
			//System.out.println(sumOfAll);
		}
		System.out.println("The sum of the integers from 1 to " + userInputInt + " is " + sumOfAll);
		getValue.close();
	}
}