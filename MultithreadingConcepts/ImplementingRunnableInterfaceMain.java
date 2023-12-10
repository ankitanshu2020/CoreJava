package multiThreadingConcepts;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("Child thread");		
		}
	}
}
public class ImplementingRunnableInterfaceMain {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		Thread th = new Thread(mt);
		
		th.start();
		
		for(int i = 1; i <= 3; i++) {
			System.err.println("Main thread");		
		}
	}
}
