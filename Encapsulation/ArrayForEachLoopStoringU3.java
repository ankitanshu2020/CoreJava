package com.company.encapsulation;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayForEachLoopStoringU3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		int x = 0;
		for(int i : arr) {
			arr[x] = sc.nextInt();
			x++;
		}
		System.out.println(Arrays.toString(arr));	
	}
}



