package objectClassAccountExample;

public class Account {
	
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
	
