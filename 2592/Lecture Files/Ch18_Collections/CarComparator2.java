package Ch18_Collections;
import java.util.Comparator;

/**
 * Figure 18-12 MODIFIED
 * 
 * If the objects that you wish to store in a TreeSet do not implement the
 * Comparator interface, you can still store them in a TreeSet by creating a
 * Comparator. A Comparator Is an object that can compare two other objects and
 * determine whether one is greater than, less than, or equal to the other. A
 * Comparator implements the Comparator interface, which is in the java.util
 * package.
 * 
 */

public class CarComparator2<T extends Car> implements Comparator<T> {

	public int compare(T car1, T car2) {
		// Get the two cars' descriptions.
		String description1 = car1.getDescription();
		String description2 = car2.getDescription();

		// Compare the descriptions and return the
		// result of the comparison.
		return description1.compareToIgnoreCase(description2);
	}

}


