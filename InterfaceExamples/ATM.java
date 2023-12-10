//                       Hierarchical Inheritance with interface
package com.company.interfacesexamples;
import java.util.Scanner;

public interface ATM {
	void withdraw();
	void checkBalance();
	void deposit();

}
class ICICIAtm implements ATM{
	ICICIAtm() {
		System.out.println("-----Welcome to ICICI_Atm-----");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdrawl successful from ICICIAtm");
	}
	@Override
	public void checkBalance() {
		System.out.println("Balance is 15,000 rupees");
	}
	@Override
	public void deposit() {
		System.out.println("5,000 rupees has been deposited to your account");
	}
	
}
class SBIAtm implements ATM{
	SBIAtm() {
		System.out.println("-----Welcome to SBI_Atm-----");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdrawl successful from SBIAtm");
	}
	@Override
	public void checkBalance() {
		System.out.println("Balance is 20,000 rupees");
	}
	@Override
	public void deposit() {
		System.out.println("5,000 rupees has been deposited to your account");
	}
	
}
class HDFCAtm implements ATM{
	HDFCAtm() {
		System.out.println("-----Welcome to HDFC_Atm-----");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdrawl successful from HDFCAtm");
	}
	@Override
	public void checkBalance() {
		System.out.println("Balance is 25,000 rupees");
	}
	@Override
	public void deposit() {
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
				
				ATM i ;
				i = new ICICIAtm();
				
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
				
				ATM s ;
				s = new SBIAtm();
				
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
				
				ATM h ;
				h = new HDFCAtm();
				
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
