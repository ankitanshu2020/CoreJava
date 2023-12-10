// write a program to create a matrix of size 2X3 and print the values of matrix 
//using normal for loop and forEach loop
package com.company.encapsulation;

import java.util.Arrays;

public class MDAusingLoopU3 {
	public static void main(String[] args) {
		
		int[][] a = {{3, 4, 5}, {1, 2, 6}};
		
//		USING NORMAL FOR LOOP
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
//		USING FOR_EACH LOOP
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//      USING INBUILT METHOD
		for(int[] s : a) {
			System.out.println(Arrays.toString(s));
		}
	}
}
