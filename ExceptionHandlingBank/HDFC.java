package ExceptionHandlingBank;

public class HDFC extends Bank {

	@Override
	void deposit(double amount) throws InvalidAmountException, HDFCAmountNotInMultipleOf1000 {
	if(amount < 0) {
		throw new InvalidAmountException();
	}
	else {
		if(amount % 1000 == 0) {
			double updatedBalance = getBalance() + amount;
			setBalance(updatedBalance);
			System.out.println("Balance deposited successfully and updated balance is " + getBalance());				
		}
		else {
			throw new HDFCAmountNotInMultipleOf1000();
		}
	}
	}

	@Override
	void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException, HDFCAmountNotInMultipleOf2000 {
		if(amount <= getBalance()) {
			if(amount <= 0) {
				throw new InvalidAmountException();
			}
			if(amount % 2000 == 0) {
				double updatedBalance = getBalance() - amount;
				setBalance(updatedBalance);
				System.out.println("Balance dispensed successfully and updated balance is " + getBalance());				
			}
			else {
				throw new HDFCAmountNotInMultipleOf2000();
			}
		}
		else {
			throw new InsufficientBalanceException();
		}
	}

}
