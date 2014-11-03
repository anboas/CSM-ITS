package quiz_05_student;

import java.io.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ReadingIntegerFiles_Student {

	// Adam Boas

	public static void main(String[] args) throws IOException {

		// HashSet to store unique values
		Set<Integer> inputSet = new HashSet<Integer>();
		
		// Integer to count all values
		int entries = 0;
		
		String fileName = "C:\\Users\\ST160S18\\Desktop\\a6.txt";
		
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File(fileName));

		} catch (FileNotFoundException fe) {
			System.out.println("File not found! " + fe);
			fe.printStackTrace();
		}

		// Read lines from the file until no more are left.
		while (inputFile.hasNextInt()) {
			// Increment entries count
			entries++;
			
			// Add next Integer into set
			inputSet.add(inputFile.nextInt());

			
		}

		// Print out file statistics
		System.out.println("File Statistics:\n\tContained: " + entries + " Entries.");
		System.out.println("\tThe file had: " + inputSet.size() + " Unique Entries.");

		// Close the file.
		inputFile.close();
	}

}
