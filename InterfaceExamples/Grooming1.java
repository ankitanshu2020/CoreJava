package com.company.interfacesexamples;

public interface Grooming1 {
	
	// java previous versions only incomplete methods allowed
	public abstract void m1();    // public abstract non-static method is allowed
	 
	
	// after java-8 version complete methods allowed
	default void m2() { }         // default non-static complete method is allowed
	
	public static void m3() { }   // public static complete method is allowed
	
	
	// after java-9 private complete methods are allowed
	private void m4() { }         // private non-static complete method is allowed
	
	private static void m5() { }  // private static complete method is allowed
	
}
