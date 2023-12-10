package CollectionsCarProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	private String brand;
	private int model;
	private double price;
	private String color;

	public Car(String brand, int model, double price, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public int getMode() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", price=" + price + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Car c1 = new Car("BMW", 2019, 5500000d, "Black");
		Car c2 = new Car("BMW", 2019, 5500000d, "Black");
		Car c3 = new Car("BMW", 2019, 5500000d, "Black");
		Car c4 = new Car("BMW", 2019, 5500000d, "Black");
		Car c5 = new Car("BMW", 2019, 5500000d, "Black");
		
		Iterator<Car> i = al.iterator();
		while(i.hasNext()) {
			
		}

	}
}
