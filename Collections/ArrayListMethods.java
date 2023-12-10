package Collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
//------add(Object o)
		al.add(10);
		al.add(null);
		al.add('c');
		al.add("Mango");
		al.add('c');
		al.add(56.78);
//		System.out.println(al);
		
//------add(int index, Object o)
		al.add(3, "Orange");
		al.add(5, 'M');
//		System.out.println(al);

//------addAll(Collection)
		ArrayList al2 = new ArrayList();
		al2.add("Guava");
		al2.add(40.34f);
//		al.addAll(al2);
//		System.out.println(al);
		
//------addAll(int index, Collection)
		al.addAll(5, al2);
		System.out.println(al);
		
//------contains(Object 0)
		System.out.println(al.contains("Banana"));
		System.out.println(al.contains("Guava"));
		System.out.println(al.contains(40.34)); // it will print false because in AL value is in Object format and we are passing Float format
		Float f = Float.valueOf(40.34f);
		System.out.println(al.contains(f));
		
//------containsAll(Collection)
		System.out.println(al.containsAll(al2));
		
//------indexOf(Object o)
		System.out.println(al.indexOf("Guava"));
		
//------lastIndexOf(Object o)
		System.out.println(al.lastIndexOf('c'));
		
//------remove(int index)
		al.remove(3);
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		
//------remove(Object o)
		al.remove("Mango");
		System.out.println(al);
		Integer i = Integer.valueOf(10);
		al.remove(i);
		System.out.println(al);
		
//------removeAll(Collection)
		al.removeAll(al2);
		System.out.println(al);
		
//------clear()
//		al.clear();
//		System.out.println(al);
		
//------set(int index, Object o)
		al.set(0, "Mango");
		al.set(1, 40.56f);
		al.set(2, 20);
		al.set(3, 'G');
		System.out.println(al);
		
//------size()
		System.out.println(al.size());
		
//------toArray()
		Object[] o = al.toArray();
		for(int j = 0; j < o.length; j++) {
			System.out.print(o[j] + " ");
		}
		System.out.println();
		
//------isEmpty()
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());

	}
}
