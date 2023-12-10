package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionSpeed extends Exception{
	ExceptionSpeed (String s){
		super(s);
	}
}

class SpeedTest{
	private int speed;
	
	SpeedTest(int speed){
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void checkSpeed() throws ExceptionSpeed{
		
		if(speed < 40) {
			throw new ExceptionSpeed("Low Speed");
		}
		else if(speed >= 40 && speed <= 60) {
			throw new ExceptionSpeed("Avg Speed");
		}
		else {
			throw new ExceptionSpeed("Over Speed");
		}
	}
}
public class ExceptionSpeedTestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your speed : ");
		
		try
		{
			int speed = sc.nextInt();
			SpeedTest s = new SpeedTest(speed);
			
			try
			{
				s.checkSpeed();
			}
			catch(ExceptionSpeed e) {
				System.err.println(e.getMessage());
			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("Invalid input !!!!");
		}	
	}
}
