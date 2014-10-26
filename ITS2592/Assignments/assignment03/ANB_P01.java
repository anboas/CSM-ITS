package assignment03;
/***********************************************************************
'Project:           Assignment 03
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Oct 08, 2014
'Description:      	Problem Number 01 Chapter 17
'    
'	MyList Class
'
'	Write a generic class named MyList, with a type parameter T. The type 
'	parameter T should be constrained to an upper bound: the Number class. The
'	class should have as a field an ArrayList of T. Write a public method named
'	add, which accepts a parameter of type T. When an argument is passed to the 
'	method, it is added to the ArrayList. Write two other methods, largest and 
'	smallest, which return the largest and smallest values in the ArrayList.
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P01 {

	public static void main(String[] args) {
		
		// Instantiate
        MyList<Integer> myList = new MyList<Integer>();  
  
        // Populate our list
        myList.add(7);  
        myList.add(-9);  
        myList.add(23);  
        myList.add(18);  
        myList.add(12);  

        // Display smallest and largest values
        System.out.println("The Smallest Value is: \t" + myList.smallest());  
        System.out.println("The Largest Value is: \t" + myList.largest());  
	}
}
