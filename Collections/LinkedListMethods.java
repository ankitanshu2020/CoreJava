package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add("Ankitanhu");
		ll.add("Ram");
		ll.add(null);
		ll.add('G');
		ll.add(100);
		
		System.out.println(ll);
		
		ll.addFirst("Sant");
		
		Iterator i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		System.out.println();
		
		i = ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
	}
}


//Q. 1 //write a program to insert integer objects in arrayList and convert into linkedList
//sort the elements in ascending order and descending order, using inbuilt and without inbuilt methods

//Q. 2 //write a program to insert Car objects in linkedList by making it generic, 
//sort the objects on the basis of price in ascending and descending order