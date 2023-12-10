//                          Aggregation relationship example

package com.company.encapsulation;
import java.util.Scanner;
class Mobile{
	Sim s;
	
	public void addSim(Sim s) {
		if(this.s == null) {
			this.s = s;
			System.out.println("Sim added in Mobile");
		}
		else {
			System.out.println("Sim is already there !!");
		}
	}
	public void removeSim(Sim s) {
		if(this.s != null) {
			this.s = null;
			System.err.println("Sim removed from Mobile");
		}
		else {
			System.err.println("Sim is not there !!");
		}
	}
}
class Sim{
	private String sim_provider;
	private int sim_no;
	
	public int getSim_no() {
		return sim_no;
	}
	public void setSim_no(int sim_no) {
		this.sim_no = sim_no;
	}
	
	public String getSim_provider() {
		return sim_provider;
	}
	public void setSim_provider(String sim_provider) {
		this.sim_provider = sim_provider;
	}
}

public class SimMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mobile m = new Mobile();
		m.addSim(new Sim());
		m.s.setSim_provider("Jio");
		m.s.setSim_no(7899);
		
		boolean flag = false;
		
		System.out.println(m.s.getSim_provider());
		System.out.println(m.s.getSim_no());
		
		m.removeSim(new Sim()); // here Sim is removed
		
		while(!flag) {
			System.out.println("1.Add Sim");
			System.out.println("1.Remove Sim");
			System.out.println("3.Exit");
			System.out.println("Enter the above option");
			
//			int choice = sc.nextInt();
		}
		
	}
}

