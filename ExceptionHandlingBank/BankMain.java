package ExceptionHandlingBank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Bank \n Enter \n 1. for ICICI \n 2. for HDFC");
		
		try
		{
			int bankName = sc.nextInt();
			
			if(bankName == 1) {
				ICICI b1 = new ICICI();
			}
			else if(bankName == 2) {
				HDFC b2 = new HDFC();
			}
			else {
				System.out.println("Bank not found");
			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("Please enter a valid input");
		}
	}
}
