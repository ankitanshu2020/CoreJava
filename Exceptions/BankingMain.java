package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

class CustomException extends Exception{
	CustomException (String s){
		super(s);
	}
}
class Bank{
	private double balance;
	void deposit() throws CustomException{
		System.out.println("Welcome to deposit section");
	}
	void widthdraw() throws CustomException{
		System.out.println("Welcome to widthdraw section");
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
//ICICI
class ICICI extends Bank{
    void deposit() throws CustomException{
		Scanner de = new Scanner(System.in);
		System.out.print("Enter Deposit Amount : ");
		try
		{
			double amount = de.nextDouble();
			if(amount % 2000 != 0) {
				throw new CustomException("Deposit amount in multiple of 2000");
			}
			System.out.println(amount + " is deposited successfully");
		}
		catch(InputMismatchException e)
		{
			System.err.println("Please enter a valid amount");
		}
	}
	void widthdraw()throws CustomException{
		Scanner de = new Scanner(System.in);
		System.out.print("Enter Widthdrable Amount : ");
		try
		{
			double amount = de.nextDouble();
			if(amount % 500 != 0) {
				throw new CustomException("Widthdraw amount in multiple of 500");
			}
			System.out.println(amount + " is widthdrawn successfully");
		}
		catch(InputMismatchException e)
		{
			System.err.println("Please enter a valid amount");
		}

	}
}
//HDFC
class HDFC extends Bank{
    void deposit() throws CustomException{
		Scanner de = new Scanner(System.in);
		System.out.print("Enter Deposit Amount : ");
		try
		{
			double amount = de.nextDouble();
			if(amount % 1000 != 0) {
				throw new CustomException("Deposit amount in multiple of 1000");
			}
			System.out.println(amount + " is deposited successfully");
		}
		catch(InputMismatchException e)
		{
			System.err.println("Please enter a valid amount");
		}
	}
	void widthdraw()throws CustomException{
		Scanner de = new Scanner(System.in);
		System.out.print("Enter Widthdrable Amount : ");
		try
		{
			double amount = de.nextDouble();
			if(amount % 2000 != 0) {
				throw new CustomException("Widthdraw amount in multiple of 2000");
			}
			System.out.println(amount + " is widthdrawn successfully");
		}
		catch(InputMismatchException e)
		{
			System.err.println("Please enter a valid amount");
		}

	}
}

public class BankingMain {
	public static void main(String[] args) throws CustomException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Bank \n Enter \n 1. for ICICI \n 2. for HDFC");
		
		try
		{
			int bankName = sc.nextInt();
			
			if(bankName == 1) {
				ICICI b1 = new ICICI();
				b1.deposit();
				b1.widthdraw();
			}
			else if(bankName == 2) {
				HDFC b2 = new HDFC();
				b2.deposit();
				b2.widthdraw();
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
