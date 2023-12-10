package com.company.encapsulation;
import java.util.Scanner;

public class StrongPassword {
	
	public static boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}

	public static boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}
	
	public static boolean isSpecial(char c) {
		return (!isLower(c) && !isUpper(c) && (c != ' ') && !(c >= '0' && c <= '9'));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any password to check it is strong or not");
		String s = sc.next();
		
		int countUpper = 0, countLower = 0, countSpecial = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(isLower(c))
				countLower++;
			
			if(isUpper(c))
				countUpper++;
			
			if(isSpecial(c))
				countSpecial++;
		}
		
		if(s.length() > 6 && countLower > 0 && countUpper > 0 && countSpecial > 0)
			System.out.println("Strong Password");
		else
			System.out.println("Weak Password");
 }
}
