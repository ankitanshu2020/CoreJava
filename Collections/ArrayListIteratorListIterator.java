package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteratorListIterator {
	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList(); // by writing this we can add integer values, generalizing
		ArrayList al = new ArrayList();

		al.add(10);
		al.add("Ankit");
		al.add(null);
		al.add('s');
		al.add(56.78);
		
		System.out.println("\n\n------iterate using normal for loop-----");
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		
		System.out.println("\n\n------iterate using forEach loop-----");
		for(Object i : al) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n------iterate using iterator-----");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\n\n------iterate using listIterator-----");
		System.out.println("\n----Printing in forward direction");
		ListIterator lit = al.listIterator();
		while(lit.hasNext()) {
			System.out.print(lit.next() + " ");
		}
		System.out.println("\n----Printing in backward direction");
		while(lit.hasPrevious()) { // (we can perform backward operation only when it is forwarded first
			System.out.print(lit.previous() + " ");
		}
		
	}
}
