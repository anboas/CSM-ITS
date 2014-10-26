package assignment01;


public class Recursive {

	/**
	 * Multiply two numbers together by recursively adding them
	 * @param x First number
	 * @param y Second number
	 * @return
	 */
	public static int multiply(int x, int y) {
		// Handles multiplying by 0 (5 * 0)
		if (x == 0 || y == 0) {
			return 0;
			
		// Handles multiplying by negatives (5 * -4)
		} else if (x < 0) {
			return -x + multiply(x, y + 1);
			
		// Handles default operation (5 * 4)
		} else {
			return x + multiply(x, y - 1);
		}
	}
}