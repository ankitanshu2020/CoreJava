package multiThreadingConcepts;

class ATM{
	double amount = 1000;
	
	public void deposit(double balance) {
		synchronized (this) {
			amount += balance;
			System.out.println("Updated balance after deposit = " + amount);
			this.notify();
		}		
	}
	public void withdraw(double balance) {
		synchronized (this) {
			if(balance > amount) {
				System.err.println("Insufficiant balance !!");
				try {
					this.wait(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				amount -= balance;
				System.out.println("Updated balance after withdrawl = " + amount);
			}
			else {
				amount -= balance;
				System.out.println("Updated balance after withdrawl = " + amount);
		}
	}
 }
}
public class MainAtm {
	public static void main(String[] args) {
		ATM tr = new ATM();
		
		Runnable r1 = () -> tr.deposit(10000);
		Runnable r2 = () -> tr.withdraw(10000);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t2.setPriority(10);
		
		t2.start();
		t1.start();
	}
}
