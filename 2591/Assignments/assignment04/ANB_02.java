package assignment04;
import javax.swing.JOptionPane;
/**
//***********************************************************************
'Project:           Assignment 04
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              April 1, 2014
'Description:      	Problem Number 01 Chapter 08
'    
'	Accepts a charge account number as its argument, then 
'	compares the value against an array and determines whether the 
'	value is Valid or Invalid
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_02 {
	public static void main(String[] args) {
		String input;
		int accountNumber;

		
		ANB_Validator val = new ANB_Validator();

		// Gets account number from the user
		input = JOptionPane
				.showInputDialog("Enter your charge account number: ");
		accountNumber = Integer.parseInt(input);

		if (val.isValid(accountNumber)) {
			JOptionPane.showMessageDialog(null,
					"That's a valid account number.");
		} else {
			JOptionPane.showMessageDialog(null,
					"That's an INVALID account number.");
		}

		System.exit(0);

	}

}
