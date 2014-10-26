package midterm;
/***********************************************************************
'Project:           Midterm Exam 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 14, 2014
'Description:      	Problem 01
'    
'	MT01_Generics
'
'	Write a generic method printArray that will print all the arrays in the program.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/
public class MT01_Generics {

	public static void main(String[] args) {
		// Declare and Initialize Variables
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 7 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O', 'S' };

		// Print Arrays
		System.out.print("Array integerArray contains:");
		printArray(integerArray);

		System.out.print("\nArray doubleArray contains:");
		printArray(doubleArray);

		System.out.print("\nArray characterArray contains:");
		printArray(characterArray);
	}

	private static <E> void printArray(E[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("\n" + array[i]);
		}
		System.out.println("\n");
	}
}
