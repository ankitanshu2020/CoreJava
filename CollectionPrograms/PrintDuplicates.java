package CollectionPrograms;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class PrintDuplicates {
	public static void printDuplicates(String s) {
		
		String[] str = s.split(" ");
		
		LinkedHashSet<String> hs1 = new LinkedHashSet();
		LinkedHashSet<String> hs2 = new LinkedHashSet();
		
		for(int i = 0; i < str.length; i++) {
			if(!hs1.add(str[i])) {
				hs2.add(str[i]);
			}
		}
		System.out.println(hs2); 
	}
	public static void main(String[] args) {
		String str = "a big black bug is sitting on the big black nose of black dog";
		printDuplicates(str);
	}
}
