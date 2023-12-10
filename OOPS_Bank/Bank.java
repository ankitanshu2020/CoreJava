package com.company.oopsbank;

public interface Bank {
	void balance();
	void transfer();
}
class SBI implements Bank{
	public SBI() {
		System.out.println("-----Welcome to SBI-----");
	}

	@Override
	public void balance() {
		System.out.println("Your balance is 50,000 rupees");
	}

	@Override
	public void transfer() {
		System.out.println("10,000 rupees has been transfered");
	}
	
}
class HDFC implements Bank{
	public HDFC() {
		System.out.println("-----Welcome to HDFC-----");
	}

	@Override
	public void balance() {
		System.out.println("Your balance is 55,000 rupees");
	}

	@Override
	public void transfer() {
		System.out.println("15,000 rupees has been transfered");
	}
	
}
class ICICI implements Bank{
	public ICICI() {
		System.out.println("-----Welcome to ICICI-----");
	}

	@Override
	public void balance() {
		System.out.println("Your balance is 60,000 rupees");
	}

	@Override
	public void transfer() {
		System.out.println("20,000 rupees has been transfered");
	}
	
}
