//accountName
//phoneNumber
//panNumber
//aNumber
//dob
//gender
//accountNumber = 36791063175

package com.company.encapsulation;

class PrintDetails{
	
	private String accountName;
	private long phoneNumber;
	private long panNumber;
	private long aadharNumber;
	private int dOb;
	private char gender;
	static long accountNumber = 36791063175l;
	
	
	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public long getPanNumber() {
		return panNumber;
	}


	public void setPanNumber(long panNumber) {
		this.panNumber = panNumber;
	}


	public long getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public int getdOb() {
		return dOb;
	}


	public void setdOb(int dOb) {
		this.dOb = dOb;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
	
	static int count = 1;
	PrintDetails(){
		System.out.println("---- Details of customer ----" + count++ );
	}
	public void display(){
		System.out.println("AccountName = " + getAccountName()); 
		System.out.println("PhoneNumber = " + getPhoneNumber()); 
		System.out.println("PanNumber = " + getPanNumber()); 
		System.out.println("AadharNumber = " + getAadharNumber()); 
		System.out.println("Date Of Birth = " + getdOb()); 
		System.out.println("Gender = " + getGender()); 
		System.out.println("AccountNumber = " + accountNumber++); 
		System.out.println();
	}
}

public class AccountReg {
	public static void main(String[] args) {
		PrintDetails ac1 = new PrintDetails();
		ac1.setAccountName("Anki");
		ac1.setPhoneNumber(7488904977l);
		ac1.setPanNumber(8988765l);
		ac1.setAadharNumber(551993128793l);
		ac1.setdOb(832001);
		ac1.setGender('M');
		ac1.display();
		
		PrintDetails ac2 = new PrintDetails();
		ac2.setAccountName("Deepak");
		ac2.setPhoneNumber(8988904977l);
		ac2.setPanNumber(89887546);
		ac2.setAadharNumber(5519931285678l);
		ac2.setdOb(1832000);
		ac2.setGender('M');
		ac2.display();
		
		PrintDetails ac3 = new PrintDetails();
		ac3.setAccountName("Reema");
		ac3.setPhoneNumber(7488904989l);
		ac3.setPanNumber(6788767l);
		ac3.setAadharNumber(851993128797l);
		ac3.setdOb(862002);
		ac3.setGender('F');
		ac3.display();
		
		PrintDetails ac4 = new PrintDetails();
		ac4.setAccountName("Sonu");
		ac4.setPhoneNumber(8488904971l);
		ac4.setPanNumber(5988768l);
		ac4.setAadharNumber(851993128791l);
		ac4.setdOb(631999);
		ac4.setGender('M');
		ac4.display();
		
		PrintDetails ac5 = new PrintDetails();
		ac5.setAccountName("Raushan");
		ac5.setPhoneNumber(9488904922l);
		ac5.setPanNumber(1088763l);
		ac5.setAadharNumber(651993128792l);
		ac5.setdOb(1272001);
		ac5.setGender('M');
		ac4.display();
		
	}
}
