package Assignment03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/***********************************************************************
'Project:           Assignment 03
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 08, 2014
'Description:      	Problem Number 01 Chapter 18
'    
'	Word Set
'
'	Write an application that reads a line of input from the keyboard, and 
'	then displays each unique word that was entered, sorted in ascending order. 
'	You can do this by tokenizing the line of input and adding each token to an 
'	appropriate Set object.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class ANB_P03 {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		
		// Get Scanner, Ask for input, Get input, Close scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a string to tokenize and count: \t");
		String currentLine = keyboard.nextLine();
		keyboard.close();
		
		// Tokenize the input by white space
		String[] wordsFromInput = currentLine.split("\\s+",-1);
				
		// Convert the tokenized input into a HashSet
		Set<T> wordSet = new HashSet<T>((Collection<? extends T>) Arrays.asList(wordsFromInput)); 

		/*
		 * Print HashSet beautifully, by code that originally looked obfuscated.
		 * Making this unnecessary method follow-able took longer than the first
		 * three programming challenges combined... I wrote it a few years ago 
		 * before I developed my habitual naming conventions and adopted a few 
		 * standards -- It looks clean now if I were to compare it to before
		 */
		printHashSetInformation(wordSet);
	}

	private static <T> void printHashSetInformation(Set<T> wordSet) {
		
		// ArrayLists are easier to work with for this
		ArrayList<T> wordList = new ArrayList<>(wordSet);
		
		// Defined outside the scope of the for loop so we can use it later on
		int largestWordLength = 0;

		// Establish the space we want between values
		for (int i = 0; i < wordList.size(); i++) {
			String currentWord = (String) wordList.get(i);
			if (largestWordLength < currentWord.length() + 5) {
				largestWordLength = currentWord.length() + 5;
			}
		}

		// Display amount of unique values
		int hashSetSize = wordSet.size();
		System.out.print("\nThere were " + hashSetSize + " unique values entered, those values are: ");
		
		// Display unique values
		for(int i = 0; i < wordList.size(); i++){
			
			// Makes calling insertWhiteSpace a little more elegant
			String currentValue = (String) wordList.get(i);
			int currentValueLength = currentValue.length();

			// If we have six entries on a line, go to the next one, if not, print then insert more space
			if(i % 6 == 0){
				System.out.print("\n" + currentValue + insertWhiteSpace(largestWordLength - currentValueLength));
			} else {
				System.out.print(wordList.get(i) + insertWhiteSpace(largestWordLength-currentValueLength));
			}
		}
	}

	/**
	 * Simply creates a concatenated string of the desired length containing white space
	 * @param whiteSpace
	 * @return
	 */
	public static String insertWhiteSpace(int whiteSpace) {
		String white = "";
		for (int i = 0; i < whiteSpace; i++) {
			white += " ";
		}
		return white;
	}
}
