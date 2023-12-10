package multiThreadingConcepts;

public class InheritingThreadClassWithLambdaExpressionMain {
	public static void main(String[] args) {
		new Thread(
				
			() -> {
			for(int i = 1; i <= 3; i++) {
				System.out.println("Child thread");
			}
		  }
			
		).start();
		
		for(int i = 1; i <= 3; i++) {
			System.err.println("Main thread");
		}
	}
}
