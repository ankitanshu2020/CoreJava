package exceptions;
import java.util.Arrays;
import java.util.Comparator;

class sortAccordingToPrice implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Cars c1 = (Cars) o1;
		Cars c2 = (Cars) o2;
		
		if(c1.price < c2.price)
			return -1;
		else if(c1.price == c2.price)
			return 0;
		else
			return 1;

    }
}
class Cars{
	double price;
	int model;
	String color;
	String brand;
	
	Cars(){}
	
	public Cars(double price, int model, String color, String brand) {
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
	
}
public class CarMainComparator {
	public static void main(String[] args) {
		Cars[] cm = new Cars[3];
		
		cm[0] = new Cars(456464, 10, "Red", "Benz");
		cm[1] = new Cars(456370, 6, "Black", "Toyota");
		cm[2] = new Cars(456421, 5, "white", "Tata");
		
		Arrays.sort(cm, new sortAccordingToPrice());
		
		for(int i=0;i<cm.length;i++)
		{
			System.out.println(cm[i]);
		}

	}
}

