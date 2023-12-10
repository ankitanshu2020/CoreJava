package objectClassAccountExample;

public class LoanAccount extends Account {
	
	private double loan_amount;

	public double getLoanAmount() {
		return loan_amount;
	}

	public void setLoanmAmount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	
	LoanAccount(){}
	
	LoanAccount(long account, String ifsc, double loan_amount){
		super(account, ifsc);
		this.loan_amount = loan_amount;
	}
	
	@Override
	public String toString() {
		String s = "Account No :" + getAccount() + "," + "IFSC :" + getIfsc() + "," + "Balance :" + getLoanAmount() + "]";
		return s;
	}
	@Override
	public boolean equals(Object o) {
		LoanAccount la = (LoanAccount) o; //downcasting
		boolean b = this.getAccount() == la.getAccount() && this.getIfsc().equals(la.getIfsc()) && this.loan_amount == la.loan_amount;
		return b;
	}
	@Override
	public int hashCode() {
		int hc = (int)getAccount() + getIfsc().hashCode() + (int)loan_amount;
		return hc;
	}
}
