package finalexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ANB_P02 {

	public static void main(String[] args) {

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
			// Increment entries count

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

		// Print out file statistics
		System.out.println("File Statistics:\n\tThe file had: \t" + entries
				+ " Entries.");
		System.out.println("\tThe file had: \t" + inputSet.size()
				+ " Unique Entries.");
		System.out.println("\tThe file had: \t" + (entries - inputSet.size()) + " Duplicate Entries.\n");

		// Close the file.
		inputFile.close();

		// Map to store duplicates
		Map<String, Integer> duplicateSet = new TreeMap<String, Integer>();

		// Iterate through the set at Values > 1
		Set<String> keys = inputSet.keySet();
		for (String k : keys) {
			if (inputSet.get(k) > 1) {
				duplicateSet.put(k, inputSet.get(k));
			}
		}

		for (Map.Entry<String, Integer> entry : duplicateSet.entrySet()) {
			System.out.println("\t" + entry.getValue() + "\t- " + entry.getKey());
		}
	}
}
