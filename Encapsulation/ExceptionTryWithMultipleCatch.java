package com.company.encapsulation;

import java.io.FileNotFoundException;

public class ExceptionTryWithMultipleCatch {
	
	public static void myMethod(int a) throws InterruptedException, ArithmeticException, 
	FileNotFoundException, NullPointerException{
		
		if(a >= 1 && a <= 10) {
			throw new InterruptedException();
		}
		else if(a >= 11 && a <= 20) {
			throw new ArithmeticException();
		}
		else if(a >= 21 && a <= 30) {
			throw new FileNotFoundException();
		}
		else{
			throw new NullPointerException();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		try 
		{
			myMethod(10);
		}
		catch (InterruptedException e)
		{
			System.out.println("IE Handled");	
		}
		catch (ArithmeticException e)
		{
			System.out.println("AE Handled");	
		}
		catch (FileNotFoundException e)
		{
			System.out.println("FNFE Handled");	
		}
		catch (NullPointerException e)
		{
			System.out.println("NPE Handled");	
		}
		
		System.out.println("Program Ends");	
		}
}
