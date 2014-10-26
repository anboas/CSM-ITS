package midterm;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/***********************************************************************
'Project:           Midterm Exam 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 14, 2014
'Description:      	Problem 01
'    
'	MT02_FileDriver
'
'	Develop a driver for ReadFileUtilities. Load, Sort, and Search an array
'	from a file.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class MT02_FileDriver {

	public static void main(String[] args) throws IOException,
			InterruptedException {

		// Declare and instantiate variables
		String filePath = "J:\\Adam\\School\\ITS-2591\\Workspace\\ITS2592\\female1.txt";
		int recordsCount = ReadFileUtilities.readFileSize(filePath);
		File arraySource = new File(filePath);
		String[] femaleNames = new String[recordsCount];

		// Display records count and path
		System.out.println("There are " + recordsCount
				+ " records in the file \"" + arraySource.toPath() + "\"");

		// Create String[] array from file
		ReadFileUtilities.readFileIntoArray(femaleNames, filePath);

		// Display contents of String[]
		ReadFileUtilities.displayArray(femaleNames);

		// Sort String[] using quickSort
		FileSortUtilities.quickSort(femaleNames);

		// Display contents of sorted String[]
		ReadFileUtilities.displayArray(femaleNames);

		// Perform Binary Searches
//		FileSearchUtilities.binarySearch(femaleNames, "Maria");
//		FileSearchUtilities.binarySearch(femaleNames, "Tia");
//		FileSearchUtilities.binarySearch(femaleNames, "Alice");
//		FileSearchUtilities.binarySearch(femaleNames, "Rapenzul");

		Thread.sleep(2000);

		// Declare and initialize variables
		final String EOF = "xxx";
		String userInput;
		boolean end = false;

		// Perform additional searches
		while (end != true) {
			userInput = JOptionPane
					.showInputDialog("Which name would you like to search for? (type xxx to end)");
			if (userInput.compareTo(EOF) == 0) {
				end = true;
			} else if (userInput != null) {
				FileSearchUtilities.binarySearch(femaleNames, userInput);
			}
		}
		JOptionPane.showMessageDialog(null, "Progam Complete.");
	}
}
