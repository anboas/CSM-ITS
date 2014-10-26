package assignment03;

public class ANB_03 
{
	/**
	//***********************************************************************
	'Project:           Assignment 03
	'Programmer:     	Adam Boas
	'Company Info:  	anboas@gmail.com (240) 561-8173
	'Date:              Feb 6, 2014
	'Description:      	Problem Number 03 Chapter 06
	'    
	'	This program will hard code three people's information and then 
	'	output the information in a neat fashion. It also has formatting for
	'	the telephone number.
	'
	'  HONOR CODE: I pledge that this program represents my own program code.
	'  I received help from NO ONE in designing and debugging my program.
	'
	'**********************************************************************/
	public static void main(String[] args)
	{
		//Input three people's information
		ANB_PersonalInfo personOne = new ANB_PersonalInfo("Adam Boas","24785 Cougar Ct","19","2405618173");
		ANB_PersonalInfo personTwo = new ANB_PersonalInfo("James Dean","12345 Drury Ln","21","3015551337");
		ANB_PersonalInfo personThree = new ANB_PersonalInfo("Bryan Tobins","797 Cicada Ln","25","5575553301");
		
		//Output header - (Could be done in the ANB_PersonalInfo class)
		System.out.println("Name\t\tAddress\t\t\tAge\tPhone Number");
		System.out.println("---------------------------------------------------------------");
		
		//calling for outputs
		personOne.displayInfo();
		personTwo.displayInfo();
		personThree.displayInfo();
		
		
	}
}
