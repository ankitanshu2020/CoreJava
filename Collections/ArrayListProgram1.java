package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram1 {
	
	public static void printAllValues(ArrayList al) {
		for(Object o : al) {
			System.out.print(o + ", ");

		}
	}
    public static void printIntegerValues(ArrayList al) {
		for(Object o : al) {
			if(o instanceof Integer) {
				System.out.print(o + ", ");
			}
		}
	}
    public static void printStringValues(ArrayList al) {
		for(Object o : al) {
			if(o instanceof String) {
				System.out.print(o + ", ");
			}
		}
	}
    public static void printStringValuesStartWithS(ArrayList al) {
		for(Object o : al) {
			if(o instanceof String) {
				String str = (String)o; // everything in arraylist stored in object, we need to downcast and make object to string in order to use String methods
				if(str.startsWith("S")) {
					System.out.print(str + ", ");
				}
			}
		}
	}
    public static void printStringValuesEndsWithA(ArrayList al) {
		for(Object o : al) {
			if(o instanceof String) {
				String str = (String)o; // everything in arraylist stored in object, we need to downcast and make object to string in order to use String methods
				if(str.endsWith("a")){
					System.out.print(str + ", ");
				}
			}
		}
	}
    public static void printFloatValuesFrom10To20(ArrayList al) {
    	for(int i = 0; i < al.size(); i++) {
    		Object o = al.get(i);
    		if(o instanceof Float) {
    			Float f = (Float)al.get(i);
    			if(f >= 10 && f <= 20) {
    				System.out.print(f + ", ");    			
    			}
    		}
    	}
	}
    
    
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(40);
		al.add("Sohan");
		al.add("Monika");
		al.add(50.32f);
		al.add(15.43f);
		al.add(11.09f);
		al.add(70);
		al.add('c');
		al.add("leela");
		al.add('X');
		al.add(null);
		al.add(78d);
		
		printAllValues(al);
		System.out.println();
		
		printIntegerValues(al);
		System.out.println();

		printStringValues(al);
		System.out.println();

		printStringValuesStartWithS(al);
		System.out.println();

		printStringValuesEndsWithA(al);
		System.out.println();
		
		printFloatValuesFrom10To20(al);


	}
}
