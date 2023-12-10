package com.company.encapsulation;

import java.util.Arrays;

public class ArrayPrintUsingMethodU3 {
	// For printing the values of main method
//	public static void printArraysValues(int[] a) {
//		System.out.println(Arrays.toString(a));
//	}
//	public static void main(String[] args) {
//		int[] a = {3, 8, 5};
//		printArraysValues(a);
//	}
	
	// For printing the values of other method in in main method
	public static int[] m1() {
		int[] a = {5, 8, 10};
		return a;
	}
	public static void main(String[] args) {
	int[] b = m1();
	// printing in array format
	System.out.println(Arrays.toString(b));
	//using forEach loop
	for(int i : b) {
		System.out.println(i);
	}
	}

}
