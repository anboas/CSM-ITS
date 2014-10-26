package assignment02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Jan 31, 2014
'Description:      	Problem Number 06 Chapter 04
'    
'   Write a program that asks the user to enter the name of a file,
'	and then asks the user to enter a character. The program should count
'	and display the number of times that the specific character appears in the
'	file. Use notepad or another text editor to create a simple file that can
'	be used to test the program.
'	
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NAME OR NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P04
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		int count = 0;		//Characters in file
		String userInputForFileName;
		String fileContents;
		String searchCharacter;
		char finalSearchCharacter;
		int charactersInString;
		
		//Get File
		userInputForFileName = JOptionPane.showInputDialog("Please enter the name of the file you wish to search:");
		File file = new File(userInputForFileName);
		Scanner inputFile = new Scanner(file);
		
		//Get character, set index
		searchCharacter = JOptionPane.showInputDialog("Please enter the character you would like to search for:");
		searchCharacter = searchCharacter.toUpperCase();
		finalSearchCharacter = searchCharacter.charAt(0);
		
		while (inputFile.hasNext())
		{
			//Convert to upper case before for loop
			fileContents = inputFile.nextLine();
			fileContents = fileContents.toUpperCase();
			
			for (charactersInString = 0; charactersInString < fileContents.length(); charactersInString++)
			{
				if (fileContents.charAt(charactersInString) == finalSearchCharacter)
				{
					count++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "There are " + count + " "+ finalSearchCharacter +"'s in the file.");
		inputFile.close();
	}

}