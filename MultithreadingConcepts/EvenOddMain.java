package multiThreadingConcepts;

class EvenOdd{
	synchronized public void printEven() {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println("Even :- " + i);
				this.notify();
			}else {
				try {
					this.wait(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	synchronized public void printOdd() {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.println("Odd :- " + i);
				this.notify();
			}else {
				try {
					this.wait(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
public class EvenOddMain {
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		
		Runnable r1 = () -> eo.printEven();
		Runnable r2 = () -> eo.printOdd();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}
}
