package multiThreadingConcepts;

import java.util.PriorityQueue;
import java.util.Queue;

class CommonBuffer{
	Queue<Integer> q = new PriorityQueue<>();
	
	public void pleaseWait() {
		for(int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
	}
	
	public synchronized void producer() {
		System.err.println("\nItems started to produce :-");
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			q.add(i);
			System.out.println("Item produced " + i);
		}
		this.notify();
	}
	public synchronized void consumer() {
		if(q.isEmpty()) {
			System.out.print("Buffer is empty please wait");
			pleaseWait();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.err.println("\nItems started to consume :-");
		while(!q.isEmpty()){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Item consumed " + q.poll());
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String[] args) {
		CommonBuffer b = new CommonBuffer();
		
		Runnable r1 = () -> b.producer();
		Runnable r2 = () -> b.consumer();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t2.start();
		t1.start();
	}
}
