package Mapss;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		
		m.put(888,"Anki");
		m.put(609, "Rajan");
		m.put(null, null);
		m.put(809, null);
		
		System.out.println(m);//{null=null, 609=Rajan, 888=Anki, 809=null}
		
		System.out.println(m.size());//4
		
		System.out.println(m.containsKey(609));//true
		System.out.println(m.containsKey(608));//false
		
		System.out.println(m.containsValue("Anki"));//true
		System.out.println(m.containsValue("Ankit"));//false

		m.remove(null);
		System.out.println(m);//{609=Rajan, 888=Anki, 809=null}
		
		System.out.println(m.get(609));//Rajan
		
		System.out.println(m.keySet());//[609, 888, 809]
		
		System.out.println(m.values());//[Rajan, Anki, null]
		
	}
}
