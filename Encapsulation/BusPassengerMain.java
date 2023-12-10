//                          Aggregation relationship example
package com.company.encapsulation;
import java.util.Scanner;

class Bus{
	Passenger p;
	
	public void addPassenger(Passenger p) { // helper method to add passenger
		
		if(this.p == null) { // validating before adding passenger
			this.p = p;
			System.out.println("Passenger added in bus");
		}
		else {
			System.out.println("Passenger is already there !!");
		}
	}
public void removePassenger() { // helper method to remove passenger
		
		if(this.p != null) { // validating before removing passenger
			this.p = null;
			System.out.println("\nPassenger kicked out from the bus");
		}
		else {
			System.out.println("Passenger is not there !!");
		}
	}
}
class Passenger{
	String name = "Nithish";
}
public class BusPassengerMain {
	public static void main(String[] args) {
		Bus b = new Bus();
		
//		b.addPassenger(new Passenger());
//		b.addPassenger(new Passenger());
//		in the above we are adding passenger again and again, as p can hold only one reference
		
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(!flag) {
			System.out.println("1. Add Passenger");
			System.out.println("2. Remove Passenger");
			System.out.println("3. Exit");
			System.out.print("Enter the above option : ");
			System.out.println();

			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				b.addPassenger(new Passenger());
				System.out.println("Passenger name is : " + b.p.name);
				System.out.println();
			}break;
			
			case 2: {
				b.removePassenger();
				System.out.println();
			}break;
			
			case 3: {
				flag = true;
			}break;
			
			default: {
				System.out.println("Invalid input");
			}
			
			}
		}
		
		System.err.println("Thank you for your patience, visit again !!");

	}
}
