package lecture;
import java.util.Comparator;

/**
 * A Comparator for Ordering Strings in Reverse Alphabetic Order
 */

public class RevStrComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2); // Note the negation operator
	}
}
