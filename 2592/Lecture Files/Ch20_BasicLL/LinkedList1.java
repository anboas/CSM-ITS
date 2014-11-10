package Ch20_BasicLL;

/**
   The LinkedList1 class implements a Linked list.
*/

class LinkedList1
{
    /**
       The Node class stores a list element
       and a reference to the next node.
    */
    
   // YOUR CODE GOES HERE private class Node
    
	 
    private Node first;  // list head
    private Node last;   // last element in list
	     
    /**
       Constructor.
    */
    
    public LinkedList1()
    {
        first = null;
        last = null;        
    }
    
    /**
       The isEmpty method checks to see 
		 if the list is empty.
		 @return true if list is empty, 
		 false otherwise.
    */
    
    public boolean isEmpty()
    {        
        return first == null;       
    }
    
    /**
       The size method returns the length of the list.
       @return The number of elements in the list.
    */
    
    public int size()
    {
       int count = 0;
       Node p = first;     
		 while (p != null)
       {
           // There is an element at p
           count ++;
           p = p.nextNode;
       }
       return count;
    }
    
    /**
       The add method adds an element to
		 the end of the list.
       @param e The value to add to the
		 end of the list.       
    */
    
    public void add(String e)
    {
      if (isEmpty()) 
      {
          first = new Node(e);
          last = first;
      }
      else
      {
          // Add to end of existing list
          last.nextNode = new Node(e);
          last = last.nextNode;
      }      
    }
    
    /**
       The add method adds an element at a position.
       @param e The element to add to the list.
       @param index The position at which to add 
		 the element.
       @exception IndexOutOfBoundsException When 
		 index is out of bounds.  
    */
    
    public void add(int index, String e)
    {
         if (index < 0  || index > size()) 
         {
             String message = String.valueOf(index);
             throw new IndexOutOfBoundsException(message);
         }
         
         // Index is at least 0
         if (index == 0)
         {
             // New element goes at beginning
             first = new Node(e, first);
             if (last == null)
                 last = first;
             return;
         }
         
         // Set a reference pred to point to the node that
         // will be the predecessor of the new node
         Node pred = first;        
         for (int k = 1; k <= index - 1; k++)        
         {
            pred = pred.nextNode;           
         }
         
         // Splice in a node containing the new element
         pred.nextNode = new Node(e, pred.nextNode);  
         
         // Is there a new last element ?
         if (pred.nextNode.nextNode == null)
             last = pred.nextNode;         
    }
    
    /**
       The toString method computes the string
       representation of the list.
       @return The string form of the list.
    */
    
    public String toString()
    {
      StringBuilder strBuilder = new StringBuilder();
      
      // Use p to walk down the linked list
      Node p = first;
      while (p != null)
      {
         strBuilder.append(p.value + "\n"); 
         p = p.nextNode;
      }      
      return strBuilder.toString(); 
    }
    
    /**
       The remove method removes the element at an index.
       @param index The index of the element to remove. 
       @return The element removed.  
       @exception IndexOutOfBoundsException When index is 
                  out of bounds.     
    */
    
    public String remove(int index)
    {
       if (index < 0 || index >= size())
       {  
           String message = String.valueOf(index);
           throw new IndexOutOfBoundsException(message);
       }
       
       String element;  // The element to return     
       if (index == 0)
       {
          // Removal of first item in the list
          element = first.value;    
          first = first.nextNode;
          if (first == null)
              last = null;             
       }
       else
       {
          // To remove an element other than the first,
          // find the predecessor of the element to
          // be removed.
          Node pred = first;
          
          // Move pred forward index - 1 times
          for (int k = 1; k <= index -1; k++)
              pred = pred.nextNode;
          
          // Store the value to return
          element = pred.nextNode.value;
          
          // Route link around the node to be removed
          pred.nextNode = pred.nextNode.nextNode;  
          
          // Check if pred is now last
          if (pred.nextNode == null)
              last = pred;              
       }
       return element;        
    }  
    
    /**
       The remove method removes an element.
       @param element The element to remove.
       @return true if the remove succeeded, 
		 false otherwise.
    */
    
    public boolean remove(String element)
    {
       if (isEmpty()) 
           return false;      
      
       if (element.equals(first.value))
       {
          // Removal of first item in the list
          first = first.nextNode;
          if (first == null)
              last = null;       
          return true;
       }
      
      // Find the predecessor of the element to remove
      Node pred = first;
      while (pred.nextNode != null && 
             !pred.nextNode.value.equals(element))
      {
          pred = pred.nextNode;
      }

      // pred.next == null OR pred.next.value is element
      if (pred.nextNode == null)
          return false;
      
      // pred.next.value  is element
      pred.nextNode = pred.nextNode.nextNode;    
      
      // Check if pred is now last
      if (pred.nextNode == null)
          last = pred;
      
      return true;       
    }
    
     
}