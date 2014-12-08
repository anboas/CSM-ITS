package Ch18_Collections;
import java.util.*;

/**
   Figure 18-14
   This program stores mappings in a HashMap and then
   searches for various objects.
*/

public class CarHashMap1
{
   public static void main(String[] args)
   {
      // Create a HashMap to store Car objects.
	   
	  // Both the Map interface and the HashMap class specify two generic type parameters:   
	  // one for the key data type and one for the value data type. 
	  // This explains why we�re specifying two data types, String and Car, in the generic type notation.  
	  // String is the data type of the keys, and Car is the data type of the values. 
      Map<String, Car> carMap = 
             new HashMap<String, Car>();
      
      // Create some Car objects.
      Car vw = new Car("227H54", "1997 Volkswagen");
      Car mustang = new Car("448A69", "1965 Mustang");
      Car porsche = new Car("453B55", "2007 Porsche");
      Car bmw = new Car("177R60", "1980 BMW");
      
      // Put some mappings into the HashMap. In each
      // mapping, the car's VIN is the key and the
      // Car object containing that VIN is the value.
      carMap.put(vw.getVin(), vw);
      carMap.put(mustang.getVin(), mustang);
      carMap.put(porsche.getVin(), porsche);
      carMap.put(bmw.getVin(), bmw);
      
      // Search for the Mustang by its VIN.
      System.out.println("\nSearching for the car with " +
                         "VIN " + mustang.getVin());
      Car foundCar = carMap.get(mustang.getVin());
      
      // If the car was found, display it.
      if (foundCar != null)
         System.out.println(foundCar);
      else
         System.out.println("The Mustang is NOT in the set.");

      // Search for another VIN. This one is not in the set.
      System.out.println("\nSearching for the car with " +
                         "VIN 911C87");
      foundCar = carMap.get("911C87");
      
      // If the car was found display it.
      if (foundCar != null)
         System.out.println(foundCar);
      else
         System.out.println("That car is NOT in the set.");
   }
}