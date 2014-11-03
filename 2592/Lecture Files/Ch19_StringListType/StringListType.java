package Ch19_StringListType;
 
public class StringListType implements StringList
{
   // Constants for the default capacity and
   // the resizing factor.
   private final int DEFAULT_CAPACITY = 10;
   private final int RESIZE_FACTOR = 2;
   
   // Private Fields
   private String[] list;  // The list
   private int elements;   // Number of elements stored
   
   /** This constructor creates an empty list of the
       default capacity.
   */
   public StringListType()
   {
      // YOUR CODE
   }

   /** This constructor creates an empty list of the
       specified capacity.
       @param capacity The initial capacity.
       @exception IllegalArgumentException if the
                  specified capacity is less than one.
   */
   public StringListType(int capacity)
   {
      if (capacity < 1)
         throw new IllegalArgumentException();
      
   // YOUR CODE
   }
   
   /** Add a string to the end of the list.
       @param str The string to add. 
   */
   public void add(String str)
   {
      // If the list is full, resize it.
	// YOUR CODE
      
      // Add str to the end of the list.
	// YOUR CODE
      
      // Adjust the number of elements.
	// YOUR CODE
   }

   /** Add a string at a specific index.
       @param index The added string's position.
       @param str The string to add.
       @exception IndexOutOtBoundsException When index
                  is out of bounds.
   */   
   public void add(int index, String str)
   {
      // First make sure the index is valid.
      if (index >= elements || index < 0)
         throw new IndexOutOfBoundsException();

      // If the list is full, resize it.
   // YOUR CODE
         
      // Shift the elements starting at index
      // to the right one position.
      for (int index2 = elements; index2 > index; index2--)
         list[index2] = list[index2 - 1];
      
      // Add the new element at index.
   // YOUR CODE
      
      // Adjust the number of elements.
   // YOUR CODE
   }
   
   /** Clear the list. */
   public void clear()
   {
	// YOUR CODE
   }
   
   /** Search the list for a specified string.
       @param str The string to search for.
       @return true if the list contains the string;
               false otherwise.
   */
   public boolean contains(String str)
   {
      int index = 0;          // Index counter
      boolean found = false;  // Search flag
      
      // Step through the list. When the string
      // is found, set found to true and stop.
   // YOUR CODE
      
      // Return the status of the search.
      return found;
   }
   
   /** Get an element at a specific position.
       @param index The specified index.
       @return The element at index.
       @exception IndexOutOtBoundsException When index
                  is out of bounds.
   */
   public String get(int index)
   {
	// YOUR CODE
   }

   /** Gets the index of the first occurrence of the
       specified string.
       @param str The string to search for.
       @return The index of the first occurrence of str
               if it exists; -1 if str is not in the list.
   */
   public int indexOf(String str)
   {
      int index = 0;          // Index counter
      boolean found = false;  // Search flag
      
      // Step through the list. When the string
      // is found, set found to true and stop.
   // YOUR CODE
      
      // Return the index of str or -1.
   // YOUR CODE
   }
   
   /** Determines whether the list is empty.
       @return true if the list is empty; false otherwise.
   */
   public boolean isEmpty()
   {
      return (elements == 0);
   }
   
   /** Remove a specific string from the list.
       @param str The string to remove.
       @return true if the string was found; false otherwise.
   */
   public boolean remove(String str)
   {
      int index = 0;          // Index counter
      boolean found = false;  // Search flag
      
      // Perform a sequential search for str. When it is
      // found, remove it and stop searching.
      while (!found && index < elements)
      {
         if (list[index].equals(str))
         {
            list[index] = null;
            found = true;
         }
         index++;
      }
      
      // If the value was found, shift all subsequent
      // elements toward the front of the list.
      if (found)
      {
         while(index < elements)
         {
            list[index - 1] = list[index];
            index++;
         }
         
         // Adjust the number of elements.
         elements--;
      }
      
      // Return the status of the search.
      return found;
   }
   
   /** Remove a string at a specific index.
       @param index The index of the string to remove.
       @return The string that was removed.
       @exception IndexOutOtBoundsException When index
                  is out of bounds.
   */ 
   public String remove(int index)
   {
      if (index >= elements || index < 0)
         throw new IndexOutOfBoundsException();

      // Save the string, but remove it from the list.
      String temp = list[index];
      list[index] = null;
      index++;

      // Shift all subsequent elements toward
      // the front of the list.
      while(index < elements)
      {
         list[index - 1] = list[index];
         index++;
      }
      
      // Adjust the number of elements.
      elements--;
      
      // Return the string that was removed.
      return temp;
   }
   
   /** Resizes the list to twice its current length. */
   private void resize()
   {
      // Calculate the new length, which is the current
      // length multiplied by the resizing factor.
	// YOUR CODE
      
      // Create a new list.
	// YOUR CODE
      
      // Copy the existing elements to the new list.
      for (int index = 0; index < elements; index++)
         tempList[index] = list[index];
      
      // Replace the existing list with the new one.
      list = tempList;
   }
  
   /** Replace the string at a specified index with
       another string.
       @param index The index of the string to replace.
       @param str The string to replace it with.
       @return The string previously stored at the index.
       @exception IndexOutOtBoundsException When index
                  is out of bounds.     
   */
   public String set(int index, String str)
   {
      if (index >= elements || index < 0)
         throw new IndexOutOfBoundsException();

      // Save the existing string at that index.
   // YOUR CODE
      
      // Replace the string with str.
   // YOUR CODE
      
      // Return the previously stored string.
      return temp;
   }
   
   /** Get the number of elements in the list.
       @return The number of elements in the list.
   */
   public int size()
   {
	// YOUR CODE
   }
   
   /** Convert the list to a String array.
       @return A String array with the same elements as the list.
   */
   public String[] toStringArray()
   {
      // Create a String array large enough to hold
      // all the elements of the list.
      String[] stringArray = new String[elements];
      
      // Store the elements in the array.
      for (int index = 0; index < elements; index++)
         stringArray[index] = list[index];
      
      // Return the String array.
      return stringArray;
   }
}


 
