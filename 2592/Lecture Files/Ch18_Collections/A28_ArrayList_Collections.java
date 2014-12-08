package Ch18_Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Useful collection methods The java.util.Collections class provides useful
 * functionalities for working with collections.
 * http://pic.dhe.ibm.com/infocenter
 * /adiehelp/v5r1m1/index.jsp?topic=%2Fcom.sun.api
 * .doc%2Fjava%2Futil%2FCollections.html
 * 
 * @author Dick
 * 
 */

public class A28_ArrayList_Collections
{
	/**
	 * 
	 * public static void copy(List dest, List src) Copies all of the elements
	 * from one list into another. After the operation, the index of each copied
	 * element in the destination list will be identical to its index in the
	 * source list. The destination list must be at least as long as the source
	 * list. If it is longer, the remaining elements in the destination list are
	 * unaffected.
	 * 
	 * This method runs in linear time.
	 * 
	 * Parameters dest - The destination list. src - The source list.
	 * 
	 * http://stackoverflow.com/questions/14319732/how-to-copy-a-java-util-list-
	 * into-another-java-util-list The implementation of the
	 * Collections.copy(destList, sourceList) first checks the size of the
	 * destination list by calling the method size(). Since the call to the
	 * size() method will always return the number of elements in the list (0 in
	 * this case, The constructor ArrayList(capacity) ensures only the initial
	 * capacity of the backing array and this does not have any relation with
	 * the size of the list). Hence we get IndexOutOfBoundsException always.
	 * 
	 * 2) A relatively simple way is to use the constructor which takes
	 * collection as argument:-
	 * 
	 * List wsListCopy=new ArrayList(wsList);
	 */
	public static void main(String[] args)
	{
		ArrayList<Double> myList = new ArrayList<Double>();

		myList.add(1.);
		myList.add(2.);
		myList.add(3.);
		myList.add(4.);
		myList.add(5.);
		myList.add(4.);
		myList.add(5.);

		System.out.println("My List");
		printList(myList);

		// Sort the list
		Collections.sort(myList);
		System.out.println("My List Sorted");
		printList(myList);

		ArrayList<Double> yourList = new ArrayList<Double>(myList);

		// Copy a collection to another

		Collections.copy(yourList, myList);
		System.out.println("Your List");
		printList(yourList);

		// Reverse the order of the list
		Collections.reverse(myList);
		System.out.println("My List Reversed");
		printList(myList);

		System.out.println("The lowest number in the array is "
				+ Collections.min(myList));
		System.out.println("The highest number in the array is "
				+ Collections.max(myList));

		double sum =  sumList(myList);

		System.out.println("The total of the numbers in the array is " + sum);
		System.out.println("The average of the numbers in the array is " + sum
				/ myList.size());
	}

	public static double sumList(ArrayList<Double> inList){

		double sum = 0;
		for (int i = 0; i < inList.size(); i++)
		{
			sum += inList.get(i);
		}
		return sum;
	}

	public static <E> void printList(ArrayList<E> inList)
	{
		System.out.println("\n");
		for (int index = 0; index < inList.size(); index++)
		{
			System.out.println(inList.get(index));
		}
		System.out.println("\n");
	}

}
