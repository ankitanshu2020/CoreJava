package multiThreadingConcepts;

public class MovieMain {
	public static void main(String[] args) {
		Movie m = new Movie("KGFChapter2");
		
		Runnable r1 = () -> m.read();
		Runnable r2 = () -> m.write();
		
		Thread read = new Thread(r1);
		Thread write = new Thread(r2);
		
		read.start();
		write.start();
	}
}
