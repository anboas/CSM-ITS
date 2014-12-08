package lecture;

//P04

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * A tutorial on sorted maps in Java, plus some explanation of the 
 * Map interface and interfaces in general.
 * @author Dick
 *
 */
 
public class MapSorted {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		System.out.println("\nHash Map \n");
		testMap(hashMap);
		System.out.println("\nLinked Hash Map \n");
		testMap(linkedHashMap);
		System.out.println("\nTree Map \n");
		testMap(treeMap);
	}
 
	
	/**
	 * @param map
	 * <br/>testMap is a method which is passed different kinds of maps.
	 * <br/>It inserts data into the map that was passed.
	 * <br/>it then iterates over the map and prints out key, value sets.
	 */
	public static void testMap(Map<Integer, String> map)
	{
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(22, "cow"); // Substitute 22 for 0 an notice results
		map.put(15, "bear");
		map.put(6, "snake");

		for (Integer key : map.keySet())
		{
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
