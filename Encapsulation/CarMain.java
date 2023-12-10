package com.company.encapsulation;

class Car{
	Engine e = new Engine();
	
}
class Engine{
	EngineOil eo = new EngineOil();
	int model = 123;
	private int chessi_no = 343534;
	
	public int getChessi_no() {
		return chessi_no;
	}
	
}
class EngineOil{
	String brand = "Motul";
}
public class CarMain {
	public static void main(String[] args) {
	Car c = new Car();
	System.out.println(c.e.model);
	System.out.println(c.e.getChessi_no());
	System.out.println(c.e.eo.brand);

 }
}
