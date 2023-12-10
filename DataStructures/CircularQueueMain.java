package dataStructures.com;
import java.util.Scanner;

public class CircularQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of queue : ");
		int size = sc.nextInt();
		
		CircularQueue c = new CircularQueue(size);
		
		boolean flag = true;
		
		while(flag) {
			System.err.println("====================");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Empty???");
			System.out.println("4. Full???");
			System.out.println("5. Display queue elements");
			System.out.println("6. Exit");
			System.err.println("====================");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("Enter the element to insert");
				int data = sc.nextInt();
				c.enqueue(data);
				System.err.println(c);
			}break;
			case 2: {
				c.dequeue();
				System.err.println(c);
			}break;
			case 3: {
				System.out.println(c.isEmpty());
			}break;
			case 4: {
				System.out.println(c.isFull());
			}break;
			case 5: {
				System.out.println(c);
			}
			case 6: {
				flag = false;
			}break;
			default : {
				System.err.println("Invalid Options");
			}
			}
		}
		System.out.println("Thank you, for your patience!!. Please visit again");
	}
}
