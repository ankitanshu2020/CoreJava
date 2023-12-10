//Q. 1 //write a program to insert integer objects in arrayList and convert into linkedList
//sort the elements in ascending order and descending order, using inbuilt and without inbuilt methods

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListProg1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(100);
		al.add(20);
		al.add(60);
		al.add(80);
		
		LinkedList ll = new LinkedList(al);
		
//		Sorting using inbuilt method
		Collections.sort(ll);
		
//		Sorting without using inbuilt method
		for(int i = 0; i < ll.size(); i++) {
			for(int j = i + 1; j < ll.size(); j++) {
				if((Integer)ll.get(i) > (Integer)ll.get(j)) {
					Integer x = (Integer)ll.get(i);
					ll.set(i, ll.get(j));
					ll.set(j, x);
				}
			}
		}

	}
}
