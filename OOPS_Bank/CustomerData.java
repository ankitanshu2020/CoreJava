package com.company.oopsbank;
import java.util.Scanner;

public class CustomerData {
	static String name;
	static long mob;
	static int pin;
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		name = sc.nextLine();
		System.out.print("Enter your Mobile Number : ");
		mob = sc.nextLong();
		System.out.print("Enter your UPI Pin : ");
		pin = sc.nextInt();
	}

}
