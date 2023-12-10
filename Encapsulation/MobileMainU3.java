//==============================UNIT 3 Concepts=========================================
package com.company.encapsulation;

class Mobiles{
	String brand;
	double price;
	String color;
	int ram;
	
	
	Mobiles(String brand,double price, String color,int ram) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}
	@Override 
	public String toString() {
		String ms = "[Brand = " + brand + "\n" + "Price = " + price + "\n" + "Color = " + color + "\n" + "RAM = " + ram + "]";
		return ms;
	}
	@Override
	public boolean equals(Object o) { //upcasting
		Mobiles mm = (Mobiles)o; // downcasting
		boolean b = this.brand.equals(mm.brand) && this.price == (mm.price) && this.color.equals(mm.color) && this.ram == mm.ram;
		return b;
	}
	@Override
	public int hashCode() {
		int hc = brand.hashCode() + (int)price + color.hashCode() + ram;
		return hc;
		}
}

public class MobileMainU3 {
	public static void main(String[] args) {
		Mobiles m1 = new Mobiles("Samsung", 45000, "Lime", 6);
		Mobiles m2 = new Mobiles("OnePlus", 25000, "Orange", 4);
		System.out.println("\n=============toString()===================");
		System.out.println(m1);
		System.out.println("\n================================");
		System.out.println(m2);
		
		System.out.println("\n=============equals()===================");
		Mobiles m3 = new Mobiles("Apple", 60000, "Golden", 6);
		Mobiles m4 = m3;
		Mobiles m5 = new Mobiles("Apple", 60000, "Golden", 6);
		System.out.println(m3 == m4);// comparing reference
		System.out.println(m3.equals(m4));// comparing states
		System.out.println("\n================================");
		System.out.println(m4 == m5);// comparing reference
		System.out.println(m4.equals(m5));// comparing states
		
		System.out.println("\n=============hashCode()===================");
		System.out.println(m1.brand);
		System.out.println(m2.brand);
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		int hc1 = m1.hashCode();
		int hc2 = m2.hashCode();
		System.out.println(hc1 == hc2);
		System.out.println("\n================================");
		System.out.println(m3.brand);
		System.out.println(m4.brand);
		System.out.println(m3 == m4);
		System.out.println(m3.equals(m4));
		int hc3 = m3.hashCode();
		int hc4 = m4.hashCode();
		System.out.println(hc3 == hc4);
	}

}
