package com.company.encapsulation;

public class ExceptionNullPointer {
	
	int var1 = 10;
	static int var2 = 15;

	public static void main(String[] args) {
		ExceptionNullPointer ep = new ExceptionNullPointer();
		
		System.out.println(ep.var1);  // accessing non-static variable
		
		System.out.println(ep.var2);  // accessing static variable
		System.out.println(var2);     // accessing static variable
		System.out.println(ExceptionNullPointer.var2);   // accessing static variable
		
		ep = null;
//		System.out.println(ep.var1);  // accessing non-static variable, this will throw exception
		
		System.out.println(ep.var2);  // accessing static variable
		System.out.println(var2);     // accessing static variable
		System.out.println(ExceptionNullPointer.var2);   // accessing static variable
	}

}
