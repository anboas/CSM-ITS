package Assignment02;
/***********************************************************************
'Project:           Assignment 02
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 16, 2014
'Description:      	Problem Number 06 Chapter 16
'
'	Sorting Objects with the Insertion Sort Algorithm
'
'	The insertionSort method in the IntInsertionSorter class presented
'	in this chapter sorts an array of int values. Create an
'	ObjectInsertionSorter class that can sort Comparable objects.
'	Demonstrate the class in a program that sorts an array of
'	String objects.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ANB_P04 {
	public static void main(String[] args) throws IOException {

		// Get ArrayList from file
		String targetFile;
		targetFile = "names.txt";
		ArrayList<String> newList = new ArrayList<String>();
		newList = createArrayListFromFile(new File(targetFile));

		// Display unaltered ArrayList
		System.out.println("Original Order: ");
		for (int i = 0; i < newList.size(); i++) {
			System.out.println(i + "\t" + newList.get(i));
		}

		// Sort ArrayList
		System.out.println("\n");
		QuickSort.quickSort(newList);

		// Display altered ArrayList
		System.out.println("Sorted Order: ");
		for (int i = 0; i < newList.size(); i++) {
			System.out.println(i + "\t" + newList.get(i));
		}

		// Find String
		System.out.println("\nBARBARA was found at index: "
				+ ObjectBinarySearcher.search(newList, "BARBARA"));
	}

	public static ArrayList<String> createArrayListFromFile(File fileIn)
			throws IOException {
		ArrayList<String> tempList = new ArrayList<String>();
		String line = "";
		BufferedReader br = null;

		if (fileIn.isFile()) {
			try {
				br = new BufferedReader(new FileReader(fileIn));
				while ((line = br.readLine()) != null) {
					tempList.add(line);
				}
			} finally {
				if (br != null) {
					br.close();
				}
			}
		}
		return tempList;
	}
}
