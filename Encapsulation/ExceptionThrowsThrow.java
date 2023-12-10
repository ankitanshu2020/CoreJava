package com.company.encapsulation;

//===================================================================throws keyword
//public class ExceptionThrowsThrow {
//	
//	public static void m1() throws ArithmeticException{
//		int a = 10;
//		int b = 0;
//		System.out.println(a / b);
//	}
//	public static void m2() throws ArithmeticException{
//		m1();
//	}
//	public static void m3() throws ArithmeticException{
//		m2();
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Program Starts");	
//		
//		try
//		{
//			m3();
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("AE Handled");
//		}
//		System.out.println("Program Ends");	
//	}
//
//}

//
//======================================================================throw keyword
public class ExceptionThrowsThrow {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		try
		{
			throw new InterruptedException();
		}
		catch(InterruptedException e)
		{
			System.out.println("IE Handled");	
		}
		
		System.out.println("Program Ends");	
		}
}

