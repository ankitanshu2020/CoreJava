package com.company.encapsulation;
import java.util.Scanner;

abstract class Atm{
	abstract void withdraw();
	abstract void checkBalance();
	abstract void deposit();

}
class ICICIAtm extends Atm{
	ICICIAtm() {
		System.out.println("-----Welcome to ICICI_Atm-----");
	}
	@Override
	void withdraw() {
		System.out.println("Withdrawl successful from ICICIAtm");
	}
	@Override
	void checkBalance() {
		System.out.println("Balance is 15,000 rupees");
	}
	@Override
	void deposit() {
		System.out.println("5,000 rupees has been deposited to your account");
	}
	
}
class SBIAtm extends Atm{
	SBIAtm() {
		System.out.println("-----Welcome to SBI_Atm-----");
	}
	@Override
	void withdraw() {
		System.out.println("Withdrawl successful from SBIAtm");
	}
	@Override
	void checkBalance() {
		System.out.println("Balance is 20,000 rupees");
	}
	@Override
	void deposit() {
		System.out.println("5,000 rupees has been deposited to your account");
	}
	
}
class HDFCAtm extends Atm{
	HDFCAtm() {
		System.out.println("-----Welcome to HDFC_Atm-----");
	}
	@Override
	void withdraw() {
		System.out.println("Withdrawl successful from HDFCAtm");
	}
	@Override
	void checkBalance() {
		System.out.println("Balance is 25,000 rupees");
	}
	@Override
	void deposit() {
		System.out.println("5,000 rupees has been deposited to your account");
	}
	
}

class Banking{
	 Banking() {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Bank_Atm \n 1. ICICI_Atm \n 2. SBI_Atm \n 3. HDFC_Atm ");
			int atm = sc.nextInt();
			
			if(atm == 1) {
				System.out.println("\n Enter the options \n 1. Withdraw Money \n 2. Check Balance \n 3. Deposit Money ");
				int opt = sc.nextInt();
				
				Atm i = new ICICIAtm();
				
				if(opt == 1) {
					i.withdraw();
				}
				else if(opt == 2) {
					i.checkBalance();
				}
				else if(opt == 3) {
					i.deposit();
				}
				else {
					System.out.println("Invalid Option");
				}
			}
			else if(atm == 2) {
				System.out.println("\n Enter the options \n 1. Withdraw Money \n 2. Check Balance \n 3. Deposit Money ");
				int opt = sc.nextInt();
				
				Atm s = new SBIAtm();
				
				if(opt == 1) {
					s.withdraw();
				}
				else if(opt == 2) {
					s.checkBalance();
				}
				else if(opt == 3) {
					s.deposit();
				}
				else {
					System.out.println("Invalid Option");
				}
			}
			else if(atm == 3) {
				System.out.println("\n Enter the options \n 1. Withdraw Money \n 2. Check Balance \n 3. Deposit Money ");
				int opt = sc.nextInt();
				
				Atm h = new HDFCAtm();
				
				if(opt == 1) {
					h.withdraw();
				}
				else if(opt == 2) {
					h.checkBalance();
				}
				else if(opt == 3) {
					h.deposit();
				}
				else {
					System.out.println("Invalid Option");
				}
			}
			else {
				System.out.println("\n Invalid Choice");
			}
	}
}


public class MainAtm {
	public static void main(String[] args) {
		Banking b = new Banking();
	}
}
