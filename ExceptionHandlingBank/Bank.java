package ExceptionHandlingBank;

public abstract class Bank {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	Bank(){}
	
	Bank(double balance){
		this.balance = balance;
	}
	
	abstract void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException, ICICIAmountNotInMultipleOf500, HDFCAmountNotInMultipleOf2000;
	abstract void deposit(double amount) throws InvalidAmountException, ICICIAmountNotInMultipleOf2000, HDFCAmountNotInMultipleOf1000;
}
