package lecture;
//P03

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * A tutorial on HashMap. Maps are data collections that function like lookup
 * tables; basically you can store objects via “keys” (names, IDs, or even
 * complex objects) and quickly retrieve them without having to look through an
 * entire list.
 * 
 * 
 * @author Dick
 * 
 */
 
public class HashMap00 {
	
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");

		String text = map.get(6);

		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ": " + value);
		}

	}

}
