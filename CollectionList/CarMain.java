package collectionList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CarMain{
	public static void main(String[] args) {
		Car c1 = new Car(2021,600000,"white","Maruti Suzuki");
		Car c2 = new Car(2017,5500000,"black","Mercedes");
		Car c3 = new Car(2019,9000000,"red","Ferrari");
		Car c4 = new Car(2023,6000000,"black","BMW");
		Car c5 = new Car(2022,4500000,"white","Mustang");
		
		ArrayList<Car> a = new ArrayList<Car>();
		
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		a.add(c5);
		
		
		for(Car c : a){
			System.out.println(c);
		}
		
		System.out.println("=====================");
		System.out.println("Printing car details if their color is WHITE : ");
		System.out.println();
		System.out.println("METHOD 1	-	USING FOR-EACH LOOP");
		
		for(Car c : a){
			if(c.getColor().equalsIgnoreCase("white")){
				System.out.println(c);
			}
		}
		
		System.out.println();
		System.out.println("METHOD 2	-	USING ITERATOR");
		
		Iterator<Car> i = a.iterator();
		
		while(i.hasNext()){
			Car c = i.next();
			if(c.getColor().equalsIgnoreCase("white")){
				System.out.println(c);
			}
		}
		
		
		System.out.println("=====================");
		System.out.println("Printing car details if their model is between 2020 and 2023 : ");
		System.out.println();
		System.out.println("METHOD 1	-	USING FOR-EACH LOOP");
		
		for(Car c : a){
			if(c.getModel()>=2020 && c.getModel()<=2023){
				System.out.println(c);
			}
		}
		
		System.out.println();
		System.out.println("METHOD 2	-	USING ITERATOR");
		
		i=a.iterator();
		while(i.hasNext()){
			Car c = i.next();
			if(c.getModel()>=2020 && c.getModel()<=2023){
				System.out.println(c);
			}
		}
		
		System.out.println("=====================");
		System.out.println("Printing car details if their price is more than 50 lakhs : ");
		
		System.out.println();
		System.out.println("METHOD 1	-	USING FOR-EACH LOOP");
		
		for(Car c : a){
			if(c.getPrice() > 5000000){
				System.out.println(c);
			}
		}
		
		System.out.println();
		System.out.println("METHOD 2	-	USING ITERATOR");
		
		i = a.iterator();
		while(i.hasNext()){
			Car c = i.next();
			if(c.getPrice() > 5000000){
				System.out.println(c);
			}
		}

		System.out.println("=====================");
		System.out.println("Sorting according to model number in Ascending order : ");
		
		System.out.println();
		System.out.println("METHOD 1 : Converting ArrayList to ObjectArray using ArrayList method ");
		System.err.println("This method is not working properly");
		
		Object[] o = a.toArray();
		for(int x=0;x<o.length;x++){
			Car m = (Car) o[x] ;
			for(int y=x+1;y<o.length;y++){
				Car n = (Car) o[y] ;
				
				if(m.getModel() > n.getModel()){
					Object obj = o[x];
					o[x] = o[y];
					o[y] = obj;
				}
			}
		}
		
		for(Object o1 : o){
			System.out.println(o1);
		}
		
		System.out.println();
		System.out.println("METHOD 2 : using for-loop on ArrayList using ArrayList methods");
		
		for(int ii=0;ii<a.size();ii++){
			for(int jj=ii+1;jj<a.size();jj++){
				if(a.get(ii).getModel() > a.get(jj).getModel()){
					Car t = a.get(ii);
					a.set(ii, a.get(jj));
					a.set(jj, t);
				}
			}
		}
		for(Car car : a){
			System.out.println(car);
		}
		
		System.out.println();
		System.out.println("METHOD 3 : using Collections class method - sort(list,comparator) ");
		
		Collections.sort(a, new SortAccordingToModel());
		for(Car car : a){
			System.out.println(car);
		}
		
		System.out.println("=====================");
		System.out.println("Removing Car Object if color is BLACK : ");
		
		for(int remove=0;remove<a.size();remove++){
			if(a.get(remove).getColor().equalsIgnoreCase("black"))
				a.remove(remove);
		}
		
		for(Car rem : a){
			System.out.println(rem);
		}	
	}
}

