package com.company.encapsulation;

class Laptop{
	String brand = "Acer";
	int price = 60000;
	Motherboard mo = new Motherboard();
	Battery bt = new Battery();
}
class Motherboard{
	String ram = "4 GB";
	String processor = "Qualcum";
}
class Battery{
	int model = 2020;
}

public class LaptopMain {
	public static void main(String[] args) {
		Laptop lp = new Laptop();
		System.out.println("Laptop brand = " + lp.brand);
		System.out.println("Laptop price = " + lp.price);
		System.out.println("Laptop RAM = " + lp.mo.ram);
		System.out.println("Laptop Processor = " + lp.mo.processor);
		System.out.println("Laptop Model = " + lp.bt.model);


	}

}
