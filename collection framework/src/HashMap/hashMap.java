package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> numberMapping = new HashMap<>();
		
		//add key - values in map
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		numberMapping.put("four", 4);
		numberMapping.put(null, 6);
		numberMapping.put("five", 5);
		numberMapping.put(null, 7);    //null update its value
		System.out.println("Map = "+numberMapping);
		
		//to check HashMap is empty or not
		System.out.println("HashMap is empty = "+numberMapping.isEmpty());
		
		//to check of hashmap
		System.out.println("Size of HashMap = "+numberMapping.size());
		
		//to check key present or exist in HashMap
		System.out.println("HashMap contains key two = "+numberMapping.containsKey("two"));
		

		//to check value present or exist in HashMap
		System.out.println("HashMap contains value 8 = "+numberMapping.containsValue(8));
		
		//to get value of enterd key
		System.out.println("value of key one = "+numberMapping.get("one"));
		
		//to remove key from HashMap
		numberMapping.remove("one");
		System.out.println("updated hashMap = "+numberMapping);
		
		//to get only keys from hashmap
		System.out.println("all keys of HashMap = "+numberMapping.keySet());
		
		//to get only values from hashmap
		System.out.println("all keys of HashMap = "+numberMapping.values());
		
		//iteration is same as others.......
	}
}
