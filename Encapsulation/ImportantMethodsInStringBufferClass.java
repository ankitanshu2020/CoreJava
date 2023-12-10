package com.company.encapsulation;

public class ImportantMethodsInStringBufferClass {
	
//CHALLENGE PROGRAM, IF ANY WORD IS REPEATING AS MANY TIMES AS ANOTHER WORD RETURN TRUE, OTHERWISE FALSE
//	catdogcatdog - true, catcatdog - false, catdogdog - false, doggodcattac - false
//if that string is there or not contains(), remove that string delete(), again do previous two steps
//count the contains, do same for another word
//implement count , if count of words of same or not
	
	public static boolean catDog(String str) {
		int count1 = 0, count2 = 0; // counting duplicates words of string
		
		while(str.contains("cat")) {
			count1++;
			int index = str.indexOf("cat");
			StringBuffer sb = new StringBuffer(str);
			sb.delete(index, index+3);
			str = sb.toString();
		}
		while(str.contains("dog")) {
			count2++;
			int index = str.indexOf("dog");
			StringBuffer sb = new StringBuffer(str);
			sb.delete(index, index+3);
			str = sb.toString();
		}
			return count1 == count2;
	}

	public static void main(String[] args) {
		
		System.out.println(catDog("catdogcatdog"));
		
		
		StringBuffer sb1 = new StringBuffer("Java Programming");
//										indexOf(String str)
//		System.out.println(sb1.indexOf("am"));
//										indexOf(String str, int fromIndex)
//		System.out.println(sb1.indexOf("a", 2));
//		System.out.println(sb1.indexOf("a", 5));
//		
//										lastIndexof(String str)
//		System.out.println(sb1.lastIndexOf("a"));
//		
//										lastIndexOf(String str, int fromIndex)
//		System.out.println(sb1.lastIndexOf("a", 5));
//		System.out.println(sb1.lastIndexOf("a", 14));
//		
//										setCharAt(int index, char ch)
//		sb1.setCharAt(2,'c');
//		System.out.println(sb1);
//		
//										reverse()
//		System.out.println(sb1.reverse());	
//		
//      								substring(int start)
//		System.out.println(sb1.substring(5));
//		
//		                                substring(int start, int end)
//		System.out.println(sb1.substring(5, 12));
//		
//		                                trimToSize
//		System.out.println(sb1.length());
//		System.out.println(sb1.capacity());
//		
//		sb1.trimToSize();
//		System.out.println(sb1.length());
//		System.out.println(sb1.capacity());
		
		
//		
//		
 
	}

}
