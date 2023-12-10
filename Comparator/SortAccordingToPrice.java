package Comparator;

import java.util.Comparator;

public class SortAccordingToPrice implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Books b1 = (Books) o1;
		Books b2 = (Books) o1;
		
		if(b1.getPrice() < b2.getPrice())
			return -1;
		else if(b1.getPrice() == b2.getPrice())
			return 0;
		else
			return 1;
	}
}