package collectionList;

public class Car {
	private int model;
	private double price;
	private String color;
	private String brand;
	
	public Car(int model, double price, String color,String brand) 
	{
		super();
		this.model = model;
		this.price = price;
		this.color = color;
		this.brand = brand;
	}
	
	public int getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}

	
	@Override
	public String toString() {
		return "Cars [model=" + model + ", price=" + price + ", color=" + color + ", brand=" + brand + "]";
	}
}
