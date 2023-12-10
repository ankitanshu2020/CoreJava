package CollectionPrograms;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
	public static void removeDuplicates(String s) {
		LinkedHashSet<String> hs = new LinkedHashSet();
		
		//whenever we need use of index , make use of array
		String[] str = s.split(" "); //splitting word by word, and storing in string array
		
		for(int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
		System.out.println(hs); //[a, big, black, bug, is, sitting, on, the, nose, of, dog]
		
		//for sorting
		LinkedList<String> li = new LinkedList(hs);
		Collections.sort(li);
		System.out.println(li); //[a, big, black, bug, dog, is, nose, of, on, sitting, the]
	}
	public static void removeDuplicatesUsingComparator(String s) {
		
		LinkedHashSet<String> hs = new LinkedHashSet();
		LinkedList<String> li = new LinkedList(hs);

		for(int i = 0; i < li.size(); i++) {
			for(int j = i + 1; j < li.size(); j++) {
				if(li.get(i).compareTo(li.get(j)) > 0) {
					String temp = li.get(i);
					li.set(i, li.get(j));
					li.set(j, temp);
				}
			}
		}
		System.out.println(li);
	}
	public static void main(String[] args) {
		String str = "a big black bug is sitting on the big black nose of black dog";
		removeDuplicates(str);
		removeDuplicatesUsingComparator(str);
	}
}
