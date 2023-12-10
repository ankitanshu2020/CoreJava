package Comparator;

import java.util.Comparator;

public class SortAccordingToTitle implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Books b1 = (Books) o1;
		Books b2 = (Books) o1;
		
		return b1.getTitle().compareToIgnoreCase(b2.getTitle());
	}
}
