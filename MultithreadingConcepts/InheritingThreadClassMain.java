package multiThreadingConcepts;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("Child thread");	
		}
	}
}

public class InheritingThreadClassMain {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		mt.start();
		for(int i = 1; i <= 3; i++) {
			System.err.println("main thread");		
		}
	}
}
