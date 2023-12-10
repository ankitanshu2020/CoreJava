package multiThreadingConcepts;

public class Movie {
	String movie;
	
	Movie(String movie){
		this.movie = movie;
	}
	
	
//	public void read() { // method is non Synchronized
	synchronized public void read() { //method is Synchronized
		for(int i = 0; i < movie.length(); i++) {
			System.out.print(movie.charAt(i));
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//  public void write() { //method is non Synchronized
	synchronized public void write() { //method is Synchronized
		try {
			Thread.sleep(12);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		movie = "SonuKiTituKiSweety";
	}
}
