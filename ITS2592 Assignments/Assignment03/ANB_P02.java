/***********************************************************************
'Project:           Assignment 03
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 08, 2014
'Description:      	Problem Number 02 Chapter 17
'    
'	MyList Class Modification
'
'	Write a generic class named MyList, with a type parameter T. The type 
'	parameter T should be constrained to an upper bound: the Number class. The
'	class should have as a field an ArrayList of T. Write a public method named
'	add, which accepts a parameter of type T. When an argument is passed to the 
'	method, it is added to the ArrayList. Write two other methods, largest and 
'	smallest, which return the largest and smallest values in the ArrayList.
'
'	Modify the MyList class that you wrote for Programming Challenge 1 so the 
'	type parameter T should accept any type that implements the Comparable 
'	interface. Test the class in a program that creates one instance of MyList 
'	to store Integers, and another instance to store Strings.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P02 {

	public static void main(String[] args) {
		
		// Instantiate
        MyListModification<Integer> myListInteger = new MyListModification<Integer>();  
        MyListModification<String> myListString = new MyListModification<String>();  
  
        // Populate our lists
        myListInteger.add(7);  
        myListInteger.add(-9);  
        myListInteger.add(23);  
        myListInteger.add(18);  
        myListInteger.add(12);  
        
        myListString.add("MARY");  
        myListString.add("PATRICIA");  
        myListString.add("LINDA");  
        myListString.add("BARBARA");  
        myListString.add("ELIZABETH");  

        // Display smallest and largest values of respective list
        System.out.println("Integers:");
        System.out.println("\tThe Smallest Value is: \t" + myListInteger.smallest());  
        System.out.println("\tThe Largest Value is: \t" + myListInteger.largest());  
        
        System.out.println("\nStrings:");
        System.out.println("\tThe Smallest Value is: \t" + myListString.smallest());  
        System.out.println("\tThe Largest Value is: \t" + myListString.largest());  
	}
}
