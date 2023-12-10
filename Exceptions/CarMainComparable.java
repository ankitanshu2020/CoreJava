package exceptions;

import java.util.Arrays;

class Car implements Comparable{
	
	double price;
	int model;
	String color;
	String brand;
	
	Car(){}
	
	public Car(double price, int model, String color, String brand) {
		super();
		this.price = price;
		this.model = model;
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Car [price=" + price + ", model=" + model + ", color=" + color + ", brand=" + brand + "]";
	}

	@Override
	public int compareTo(Object o) {
		Car c = (Car)o;
		return (int)(this.price - c.price);
	}
	
}
public class CarMainComparable {
	public static void main(String[] args) {
		Car[] cm = new Car[3];
		
		cm[0] = new Car(456464, 10, "Red", "Benz");
		cm[1] = new Car(456370, 6, "Black", "Toyota");
		cm[2] = new Car(456421, 5, "white", "Tata");
		
		Arrays.sort(cm);
		
		for(int i=0;i<cm.length;i++)
		{
			System.out.println(cm[i]);
		}

//		Car[] cms = {cm1, cm2, cm3};  //we can do by this way
//		Car[] cms = {new Car(pass values), new Car(pass values), //new Car(pass values)} we can do by this way
		
	}
}
