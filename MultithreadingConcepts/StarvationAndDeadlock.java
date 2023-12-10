package multiThreadingConcepts;

class A{
	synchronized void m1(B b) {
		System.out.println("M1 method starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.m4();
		System.out.println("M1 method stops");
	}
	synchronized void m2() {
		System.out.println("M2 method starts");
		System.out.println("M2 method stops");
	}
}
class B{
	synchronized void m3(A a) {
		System.out.println("M3 method starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.m2();
		System.out.println("M3 method stops");
	}
	synchronized void m4() {
		System.out.println("M4 method starts");
		System.out.println("M4 method stops");
	}
}
public class StarvationAndDeadlock {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Runnable r1 = () -> a.m1(b);
		Runnable r2 = () -> b.m3(a);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
