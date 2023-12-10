package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class MyCstmExptNotEligible extends Exception{
	MyCstmExptNotEligible (String s){
		super(s);
	}
}

class Voting{
	private int age;
	
	Voting(int age){
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public void checkEligibility() throws MyCstmExptNotEligible{
		
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			throw new MyCstmExptNotEligible("Not eligible to vote");
		}
	}
}
public class ExceptionCustomVotingMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		
		try
		{
			int age = sc.nextInt();
			Voting v = new Voting(age);
			
			try
			{
				v.checkEligibility();
			}
			catch(MyCstmExptNotEligible e) {
				System.err.println(e.getMessage());
			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("Invalid input !!!!");
		}		
	}
}
