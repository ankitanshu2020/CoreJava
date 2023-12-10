package Mapss;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//creating a HashMap, two ways - Map<String, Integer> m = new HashMap<>();    , HashMap<String, Integer> hm = new HashMap<>();
		Map<String, Integer> m = new HashMap<>();
//		HashMap<String, Integer> hm = new HashMap<>();
		
		m.put("apple", 12);
		m.put("Orange", 6);
		m.put("chiku", 2);
		//storing duplicate with same key
		m.put("apple", 12);
		//storing duplicate with different keys
		m.put("app", 12);
		//storing null key and null value - only one null key is allowed and more than one values can be null
		m.put(null, null);
		
//		displaying all entries
		System.out.println(m);
		
	}
}
