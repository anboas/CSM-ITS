package Ch18_Collections;
import java.util.*;

 

/**
 * Figure 18-19
 * 
 * The JCF has a class named Collections which provides numerous static methods
 * that perform useful operations on collections. 
 * Note that the name of this class, Collections, is plural, 
 * and should not be confused with the Collection interface. 
 * The majority of the methods in the Collections class perform
 * operations on lists. There are methods for copying, sorting, searching,
 * randomly shuffling, filling with a value and many other procedures.
 */

public class CollectionsDemo
{
   public static void main(String[] args)
   {
      // Create an ArrayList for storing Integers.
      List<Integer> myList = new ArrayList<Integer>();
      
      // Add the integers 0 through 9 to the list.
      // Note: The primitive values are autoboxed.
      for (int count = 0; count < 10; count++)
         myList.add(count);
      
      // Display the list.
      System.out.println("Original list contents:");
      System.out.println(myList);
      
      // Shuffle the elements in the list.
      Collections.shuffle(myList);
      
      // Display the list.
      System.out.println("\nAfter the list has been shuffled:");
      System.out.println(myList);
      
      // Display the min and max values.
      System.out.println("\nThe min value in the list is " +
                         Collections.min(myList) + 
                         " and the max value is " +
                         Collections.max(myList));
      
      // Sort the list in ascending order.
      Collections.sort(myList);
      
      // Display the list.
      System.out.println("\nAfter the list has been sorted:");
      System.out.println(myList);
      
      // Perform a binary search to locate the value 5.
      System.out.println("\nThe value 5 is located at index " +
                         Collections.binarySearch(myList, 5));
   }
}