package lecture;
import java.util.*;

/**
 * Figure 18-13 This program demonstrates how a TreeSet can use a Comparator to
 * sort its elements.
 */

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// Create a TreeSet and pass an instance of
		// CarComparator to it.
		// If you pass a Comparator object as an argument to the TreeSet
		// constructor,
		// the TreeSet will use the Comparator to perform comparisons.

		SortedSet<Car> carSet1 = new TreeSet<Car>(new CarComparator2<Car>());
		SortedSet<Car> carSet2 = new TreeSet<Car>(new CarComparator<Car>());

		// Add some Car objects to the TreeSet.
		carSet1.add(new Car("227H54", "1997 Volkswagen"));
		carSet1.add(new Car("453B55", "2007 Porsche"));
		carSet1.add(new Car("177R60", "1980 BMW"));
		carSet1.add(new Car("448A69", "1965 Mustang"));

		// Add some Car objects to the TreeSet.
		carSet2.add(new Car("227H54", "1997 Volkswagen"));
		carSet2.add(new Car("453B55", "2007 Porsche"));
		carSet2.add(new Car("177R60", "1980 BMW"));
		carSet2.add(new Car("448A69", "1965 Mustang"));

		// Display the elements in the TreeSet.
		System.out.println("Here are the cars sorted in "
				+ "order of their descriptions:");
		for (Car car : carSet1)
			System.out.println(car);

		// Display the elements in the TreeSet.
		System.out.println();
		System.out.println("Here are the cars sorted in "
				+ "order of their VINSs:");
		for (Car car : carSet2)
			System.out.println(car);

	}
}