package objectClassAccountExample;

public class SavingAccount extends Account{
	private double balance;

	public double getLoanAmount() {
		return balance;
	}

	public void setLoanmAmount(double balance) {
		this.balance = balance;
	}
	
	SavingAccount(){}
	
	SavingAccount(long account, String ifsc, double balance){
		super(account, ifsc);
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		String s = "Account No :" + getAccount() + "," + "IFSC :" + getIfsc() + "," + "Balance :" + getLoanAmount() + "]";
		return s;
	}
	@Override
	public boolean equals(Object o) {
		SavingAccount sa = (SavingAccount) o; //downcasting
		boolean b = this.getAccount() == sa.getAccount() && this.getIfsc().equals(sa.getIfsc()) && this.balance == sa.balance;
		return b;
	}
	@Override
	public int hashCode() {
		int hc = (int)getAccount() + getIfsc().hashCode() + (int)balance;
		return hc;
	}
}
