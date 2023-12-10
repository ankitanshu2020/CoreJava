package multiThreadingConcepts;

//*************************methods are non-synchronized
//class Demo{
//	public void m1() {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i);
//		}
//	}
//	public void m2() {
//		for(char c = 'A'; c <= 'Z'; c++) {
//			System.out.print(c);
//		}
//	}
//}

//*************************methods are synchronized and non-static
class Demo{
synchronized public void m1() {
	for(int i = 1; i <= 10; i++) {
		System.out.print(i);
	}
}
synchronized public void m2() {
	for(char c = 'A'; c <= 'Z'; c++) {
		System.out.print(c);
	}
}
}

//*************************methods are synchronized and static
//class Demo{
//synchronized static public void m1() {
//	for(int i = 1; i <= 10; i++) {
//		System.out.print(i);
//	}
//}
//synchronized static public void m2() {
//	for(char c = 'A'; c <= 'Z'; c++) {
//		System.out.print(c);
//	}
//}
//}

//*************************methods are synchronized, one static and one non-static
//class Demo{
//synchronized static public void m1() {
//	for(int i = 1; i <= 10; i++) {
//		System.out.print(i);
//	}
//}
//synchronized public void m2() {
//	for(char c = 'A'; c <= 'Z'; c++) {
//		System.out.print(c);
//	}
//}
//}

//----------------------------------one object
public class SynchronizationOfThreads {

	public static void main(String[] args) {
		Demo d = new Demo();
		
		Runnable r1 = () -> d.m1();
		Runnable r2 = () -> d.m2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

//----------------------------------two different objects
//public class SynchronizationOfThreads {
//
//	public static void main(String[] args) {
//		Demo d1 = new Demo();
//		Demo d2 = new Demo();
//
//		Runnable r1 = () -> d1.m1();
//		Runnable r2 = () -> d2.m2();
//		
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		
//		t1.start();
//		t2.start();
//	}
//}