package assignment01;
import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 29, 2014
'Description:      	Problem Number 10 Chapter 02
'    
'	This program accepts three test scores from the user
'	and returns each test score as well as the average test score
'	Neither the book nor the assignment statement explicitly instructed
'	us to allow the program to output the letter grade of the average score.
'	I've done so anyway because the screenshot supplied with the assignment
'	statement did. But I have commented it out seeing as it was not asked for.
'	Just proving I could have done it correctly if needed.
'
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from OR NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P02 
{
	public static void main(String[] args) 
	{
		// Declarations
		int testScore1;
		int testScore2;
		int testScore3;
		int averageScore;
		String score1;
		String score2;
		String score3;
		
		// Get and display the original three test scores
		score1 = JOptionPane.showInputDialog("Enter your test first score:");
		testScore1 = Integer.parseInt(score1);
		score2 = JOptionPane.showInputDialog("Enter your test second score:");
		testScore2 = Integer.parseInt(score2);
		score3 = JOptionPane.showInputDialog("Enter your test third score:");
		testScore3 = Integer.parseInt(score3);
		System.out.println("First test score:   " + testScore1);
		System.out.println("Second test score:  " + testScore2);
		System.out.println("Third test score:   " + testScore3);
		
		// Get and display average test score
		averageScore = ((testScore1 + testScore2 + testScore3)/3);
		System.out.println("Average test score: " + averageScore);
		
		// Commented out Letter grade structure. Not asked for, just included in case.
		/**
		if (averageScore >= 90)
			System.out.println("Your grade is an A.");
		else if (averageScore >= 80)
			System.out.println("Your grade is a B.");
		else if (averageScore >= 70)
			System.out.println("Your grade is a C.");
		else if (averageScore >= 60)
			System.out.println("Your grade is a D.");
		else
			System.out.println("Your grade is an F.");
		**/
	}

}
