package multiThreadingConcepts;

class Compute{
	
	int total;
	
	public void computeTotal() {
		synchronized (this) {
			System.out.println("Calculation started");
			for(int i = 1; i <= 200; i++) {
				total += i;
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Calculation ended and giving notification");
			this.notify();
		}
	}
	
	public void printTotal() {
		synchronized (this) {
			System.out.println("Printing total");
			try {
//				this.wait(2000);
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing finished");
		System.out.println("This is the total = " + total);
	}
}

public class SynchronizationNotifyAndWait {
	public static void main(String[] args) {
		Compute c = new Compute();
		
		Runnable r1, r2;
		r1 = () -> c.computeTotal();
		r2 = () -> c.printTotal();
		
		Thread t1, t2;
		t1 = new Thread(r1);
		t2 = new Thread(r2);
		
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
