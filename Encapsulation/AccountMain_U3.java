package com.company.encapsulation;

class Account {
	private long account;
	private String ifsc;
	
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	Account(){}
	
	public Account(long account, String ifsc) {
		super();
		this.account = account;
		this.ifsc = ifsc;
	}
}


class SavingAccount extends Account
{
	private double balance;

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	SavingAccount(long account,String ifsc,double balance){
		super(account,ifsc);
		this.balance = balance;
	}
	@Override
	public String toString(){
		String s = "Account No :"+getAccount()+","+"IFSC :"+getIfsc()+","+"Balance :"+getBalance()+"]";
		return s;
	}
	@Override
	public boolean equals(Object o){
		SavingAccount sa = (SavingAccount)o;
		boolean b = this.getAccount()==sa.getAccount() && this.getIfsc().equals(sa.getIfsc()) && this.balance==sa.balance;
		return b;
	}
	@Override
	public int hashCode(){
		int hc = (int)getAccount() + getIfsc().hashCode() + (int)balance;
		return hc;
	}
}

class LoanAccount extends Account
{
	private double loan_amount;

	public double getLoanAmount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	LoanAccount(long account,String ifsc,double loan_amount){
		super(account,ifsc);
		this.loan_amount = loan_amount;
	}
	@Override
	public String toString(){
		String s = "Account No :"+getAccount()+","+"IFSC :"+getIfsc()+","+"Balance :"+getLoanAmount()+"]";
		return s;
	}
	@Override
	public boolean equals(Object o){
		LoanAccount sa = (LoanAccount)o;
		boolean b = this.getAccount()==sa.getAccount() && this.getIfsc().equals(sa.getIfsc()) && this.loan_amount==sa.loan_amount;
		return b;
	}
	@Override
	public int hashCode(){
		int hc = (int)getAccount() + getIfsc().hashCode() + (int)loan_amount;
		return hc;
	}
}

public class AccountMain_U3{
	public static void main(String[] args) {
		Account a1 = new Account(1124355444, "SBINoo1456");
		Account a2 = new Account(1224305489, "HDFCoo8754");
		Account a3 = new Account(1321311440, "ICICIoo4459");
		Account a4 = a3;
		
		System.out.println("\n=============hashCode()===================");
		System.out.println(a1.getAccount());
		System.out.println(a2.getAccount());
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		int hc1 = a1.hashCode();
		int hc2 = a2.hashCode();
		System.out.println(hc1 == hc2);
		System.out.println("\n================================");
		System.out.println(a3.getAccount());
		System.out.println(a4.getAccount());
		System.out.println(a3 == a4);
		System.out.println(a3.equals(a4));
		int hc3 = a3.hashCode();
		int hc4 = a4.hashCode();
		System.out.println(hc3 == hc4);
	}
}







