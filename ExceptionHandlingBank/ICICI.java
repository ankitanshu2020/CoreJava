package ExceptionHandlingBank;

public class ICICI extends Bank {

	@Override
	void deposit(double amount) throws InvalidAmountException, ICICIAmountNotInMultipleOf2000 {
	if(amount < 0) {
		throw new InvalidAmountException();
	}
	else {
		if(amount % 2000 == 0) {
			double updatedBalance = getBalance() + amount;
			setBalance(updatedBalance);
			System.out.println("Balance deposited successfully and updated balance is " + getBalance());				
		}
		else {
			throw new ICICIAmountNotInMultipleOf2000();
		}
	}
	}

	@Override
	void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException, ICICIAmountNotInMultipleOf500 {
		if(amount <= getBalance()) {
			if(amount <= 0) {
				throw new InvalidAmountException();
			}
			if(amount % 500 == 0) {
				double updatedBalance = getBalance() - amount;
				setBalance(updatedBalance);
				System.out.println("Balance dispensed successfully and updated balance is " + getBalance());				
			}
			else {
				throw new ICICIAmountNotInMultipleOf500();
			}
		}
		else {
			throw new InsufficientBalanceException();
		}
	}

}
