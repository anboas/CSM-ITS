package finalexam;

/***********************************************************************
 'Project:          Final Exam
 'Programmer:     	Adam Boas
 'Company Info:  	anboas@gmail.com (240) 561-8173
 'Date:             Dec 7, 2014
 'Description:      Problem 02
 '
 '	FE Parsing File / JCF Review
 '
 '	Read the data file FA14_Names.txt  which contains last names and find
 '	out how many duplicate names there are in the file; output that number.
 '	Then calculate how many occurrences of each duplicate name there are.
 '	Print those duplicate names and the number of occurrences of each name
 '	in alphabetical order.
 '
 '  HONOR CODE: I pledge that this program represents my own program code.
 '  I received help from NO ONE in designing and debugging my program.
 '
 '**********************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ANB_FE02 {

	public static void main(String[] args) {
		// Initial Program started from work from ANB_Q05 -
		// ReadingIntegerFiles_Student.java

		// Current String in the file
		String currLine;

		// HashMap to store unique values
		Map<String, Integer> inputSet = new LinkedHashMap<String, Integer>();

		// Integer to count all values
		int entries = 0;

		String fileName = "E:\\Users\\whspr\\git\\CSM-ITS\\2592\\Exams\\finalexam\\FA14_Names.txt";

		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File(fileName));
		} catch (FileNotFoundException fe) {
			System.out.println("File not found! " + fe);
			fe.printStackTrace();
		}

		// Read lines from the file until no more are left.
		while (inputFile.hasNextLine()) {
			currLine = inputFile.nextLine();
			if (!currLine.isEmpty()) {
				entries++;
				if (inputSet.containsKey(currLine)) {
					inputSet.put(currLine, inputSet.get(currLine) + 1);
				} else {
					inputSet.put(currLine, 1);
				}
			}
		}

		// Close the file.
		inputFile.close();

		// Print out file statistics
		System.out.println("File Statistics:\n\tThe file had: \t" + entries
				+ " Entries.");
		System.out.println("\tThe file had: \t" + inputSet.size()
				+ " Unique Entries.");
		System.out.println("\tThe file had: \t" + (entries - inputSet.size())
				+ " Duplicate Entries.\n");

		// Map to store duplicates
		Map<String, Integer> duplicateSet = new TreeMap<String, Integer>();

		// Iterate through the set at Values > 1
		Set<String> keys = inputSet.keySet();
		for (String k : keys) {
			if (inputSet.get(k) > 1) {
				duplicateSet.put(k, inputSet.get(k));
			}
		}

		// Display duplicate entries
		for (Map.Entry<String, Integer> entry : duplicateSet.entrySet()) {
			System.out.println("\t" + entry.getValue() + "\t- "
					+ entry.getKey());
		}
	}
}
