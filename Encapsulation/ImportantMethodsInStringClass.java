package com.company.encapsulation;

public class ImportantMethodsInStringClass {

	public static void main(String[] args) {
		
		String sms = "Hi how are you? I hope you are having a great day!" +
		 " I have come to banglore let's meet some day, Ping me" +
				" when you are free let's catch up!!";
		
		int mid = sms.length() / 2;
		
		if(mid > 10) {
			sms = sms.substring(0, mid+1);
			sms = sms.concat("...");
			System.out.println(sms);
		}
		
		sms = sms.replace("great", "wonderful");
		System.out.println(sms);
		
		// 1. charAt(int index)
//		String s = "Java is a Programming Language";
//		System.out.println(s.charAt(10));
		
		// 2. length()
//		System.out.println(s.length());
		
		// 3. toLowerCase()
//		String l = s.toLowerCase();
//		System.out.println(l);
		
		// 3. toLowerCase()
//		String u = s.toUpperCase();
//		System.out.println(u);
		
		// 4. trim()
//		String str = "    space and strings    ";
//		System.out.println(str);
//		str = str.trim();
//		System.out.println(str);
		
		// 5. concat(String s)
//		String greet = "Hi, ";
//		greet = greet.concat("Ankitanshu");
//		System.out.println(greet);
//		
		// 6. contains(charSequence s)
//		System.out.println(s.contains("ramm"));
//		System.out.println(s.contains("ramma"));
		
		// 7. startsWith(String prefix)
//		System.out.println(s.startsWith("J"));
//		System.out.println(s.startsWith("j"));
		
		// 8. endsWith(String suffix)
//		System.out.println(s.endsWith("age"));
//		System.out.println(s.endsWith("a"));
		
		// 9. equalsIgnoreCase(String anotherString)
//		String j = "JSpiders";
//		System.out.println(j.equalsIgnoreCase("jspiders"));
		
		// 10. indexOf(int ch)
//		String msg = "Java is a Programming Language";
//		System.out.println(msg.indexOf('m'));
//		System.out.println(msg.indexOf('a'));
//		System.out.println(msg.indexOf('z'));
		
		// 11. indexOf(int ch, int fromIndex)
//		System.out.println(msg.indexOf('a', 16));
//		System.out.println(msg.indexOf('g', 23));
//		System.out.println(msg.indexOf('m', 18));
		
		// 12. indexOf(String str)
//		System.out.println(msg.indexOf("is"));
//		System.out.println(msg.indexOf("Pro"));
//		System.out.println(msg.indexOf("mmiga"));
				
		// 13. indexOf(String str, int fromIndex)
//		System.out.println(msg.indexOf("a", 2));
//		System.out.println(msg.indexOf("a", 10));
//		System.out.println(msg.indexOf("nga", 18));
		
		
		}
}
