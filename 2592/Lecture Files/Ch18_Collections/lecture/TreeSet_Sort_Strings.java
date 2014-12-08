package lecture;
import java.util.*;

public class TreeSet_Sort_Strings {

	public static void main(String[] args) {

		// Create Comparator
		RevStrComparator comp = new RevStrComparator();
		Set<String> mySet = new TreeSet<String>(comp);
		Set<String> mySet2 = new TreeSet<String>();
		// Add strings
		mySet.add("Alan");
		mySet.add("Carol");
		mySet.add("George");
		mySet.add("Bob");

		System.out.println("\nWith Comparator ");
		// Get Iterator
		Iterator<String> it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nWithout Comparator ");
		mySet2.add("Alan");
		mySet2.add("Carol");
		mySet2.add("George");
		mySet2.add("Bob");
		// Get Iterator
		Iterator<String> it2 = mySet2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
}


