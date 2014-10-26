package assignment02;
import java.util.Scanner;


/**
//***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 31, 2014
'Description:      	Problem Number 12 Chapter 03
'    
'   This program returns the time it will take for for sound to travel
'	through certain mediums, air, water, steel.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NAME OR NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P02
{
	public static void main(String[] args) 
	{
		// Constants
		final double AIR 	= 1100;
		final double WATER 	= 4900;
		final double STEEL 	= 16400;
		
		// Variables
		double time;
		String medium = "";
		double distance;
		
		// Keyboard Scanner
		Scanner getValue = new Scanner(System.in);
		
		// Decision Structure
		while(!(medium.equalsIgnoreCase("Air") || medium.equalsIgnoreCase("Water") || medium.equalsIgnoreCase("Steel")))
		{
			System.out.println("Enter a medium. Either Air, Water or Steel.\n");
			medium = getValue.nextLine();
			if (medium.equalsIgnoreCase("Air"))
			{
				System.out.println();
				System.out.println("Enter a distance\n");
				distance = getValue.nextDouble();
				time = distance / AIR;
				System.out.println("It will take " + time + " seconds for the sound to travel through " + medium);
				break;
			}
				if (medium.equalsIgnoreCase("Water"))
				{
					System.out.println("Enter a distance\n");
					distance = getValue.nextDouble();
					time = distance / WATER;
					System.out.println("It will take " + time + " seconds for the sound to travel through " + medium);
					break;
				}
					if (medium.equalsIgnoreCase("Steel"))
					{
						System.out.println("Enter a distance\n");
						distance = getValue.nextDouble();
						time = distance / STEEL;
						System.out.println("It will take " + time + " seconds for the sound to travel through " + medium);
						break;
					}
		}
		getValue.close();		// Closes getValue to ensure no resource leaks
	}
}