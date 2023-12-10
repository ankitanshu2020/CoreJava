package com.company.encapsulation;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayU3Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in array");
		
		int[] arr = new int[10];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("====================");
		// 		// using general logic, without inbuilt method
		String s = "[";
		for(int i=0; i < arr.length; i++) {
			if(i!= arr.length-1)
				s = s + arr[i] + ", " ;
			else
				s = s + arr[i];
		}
		s = s + "]";
		System.out.println(s);
		
		// using inbuilt method toString()
		System.out.println(arr);// it will print reference
		System.out.println(Arrays.toString(arr));// it will print array in String format

	}

}
