package Ch18_Collections;
import java.util.*;

/**
   Figure 18-11
   This program demonstrates how a TreeSet
   sorts its elements in ascending order.
   
   In order for a TreeSet to sort the objects that a stored in it, 
   those objects must have a natural order. 
   This means that the TreeSet must be able to compare the objects 
   and determine whether one object is greater than, less than or equal to the other. 
   One way to accomplish this is to store only objects 
   that implement the comparable interface in the TreeSet.       
   
*/

public class TreeSetDemo1
{
   public static void main(String[] args)
   {
      // Create a TreeSet and store some values in it.
      SortedSet<String> mySet = new TreeSet<String>();
      mySet.add("Pear");
      mySet.add("Apple");
      mySet.add("Strawberry");
      mySet.add("Banana");

      // Display the elements in the TreeSet.
      System.out.println("Here are the TreeSet elements " +
                         "in ascending order:");
      for (String str : mySet)
         System.out.println(str);
         
      // Add a new element to the TreeSet.
      System.out.println("\nAdding Blueberry to the set.");
      mySet.add("Blueberry");

      // Display the elements again.
      System.out.println("\nHere are the TreeSet elements " +
                         "again:");
      for (String str : mySet)
         System.out.println(str);
   }
}