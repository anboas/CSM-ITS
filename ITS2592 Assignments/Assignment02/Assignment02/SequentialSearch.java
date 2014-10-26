package Assignment02;
public class SequentialSearch {

	/**
	 * Determines if an array contains a given value
	 * @param array
	 * @param value
	 * @return
	 */
	public static boolean contains(int[] array, int value) {
		for (int i : array) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
}
