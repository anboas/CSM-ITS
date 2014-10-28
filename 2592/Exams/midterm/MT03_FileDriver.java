package midterm;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JOptionPane;

/***********************************************************************
'Project:           Midterm Exam 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 14, 2014
'Description:      	Problem 03
'
'	MT03_FileDriver
'
'	Develop a driver for ReadFileUtilities. Load an array from a file into
'	a HashSet.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class MT03_FileDriver {

	public static void main(String[] args) throws IOException,
	InterruptedException {

		// Declare and instantiate variables
		String filePath = "E:\\Users\\whspr\\git\\CSM-ITS\\2592\\Exams\\midterm\\female1.txt";
		int recordsCount = ReadFileUtilities.readFileSize(filePath);
		File arraySource = new File(filePath);
		String[] femaleNames = new String[recordsCount];

		// Display records count and path
		System.out.println("There are " + recordsCount
				+ " records in the file \"" + arraySource.toPath() + "\"");


		// Load file into LinkedHashSet
		Set<String> currentSet = new LinkedHashSet<String>();
		currentSet = ReadFileUtilities.readFileIntoHashSet(femaleNames, filePath);
		ReadFileUtilities.readFileIntoArray(femaleNames, filePath);

		// Allow user to see duplicate entries
		System.out.println("There are " + currentSet.size() + " records in the Set.");

		Thread.sleep(2000);

		// Declare and initialize variables
		final String EOF = "xxx";
		String userInput;
		boolean end = false;

		// Perform additional searches
		try {
			while (end != true) {
				userInput = JOptionPane
						.showInputDialog("Which name would you like to search for? (type xxx to end)");
				if (userInput.compareTo(EOF) == 0) {
					end = true;
				} else if (userInput != null) {
					FileSearchUtilities.hashSearch(currentSet, userInput);
				}
			}

		} catch (Exception e) {
			// User ignored dialog
		}
		JOptionPane.showMessageDialog(null, "Progam Complete.");
	}
}
