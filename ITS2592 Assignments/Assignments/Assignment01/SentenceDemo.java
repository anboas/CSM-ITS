package Assignment01;



/***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 14, 2014
'Description:      	Problem 04 from Assignment 01
'    
'	Sentence Demo
'
'	Create a recursive function which reverses a string passed to it.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class SentenceDemo {
	public static void main(String[] args) {
		
		// Store the string for reversing
		String word = "Europe’s labor market remained in the doldrums in "
				+ "December, while the inflation rate ticked back down to "
				+ "the same level that recently led the European Central "
				+ "Bank to cut interest rates.";
		
		// Output header
		System.out.print("The reverse word is: ");
		
		// Calls reverse class, passed String word and word length
		Sentence.reverse(word, word.length());
		
	}
}
