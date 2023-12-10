package dataStructures.com;
import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Stack");
		int size = sc.nextInt();
		
		Stack st = new Stack(size);
		boolean flag = true;
		
		while(flag) {
			System.out.println();
			System.out.println("========================");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Empty ??");
			System.out.println("4. Full ??");
			System.out.println("5. Peek");
			System.out.println("6. Display stack elements");
			System.out.println("7. Exit");
			System.out.println("========================");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter the element to insert");
				int data = sc.nextInt();
				st.push(data);
				System.err.println(st);
			}break;
			case 2: {
				st.pop();
				System.err.println(st);
			}break;
			case 3: {
				System.out.println(st.isEmpty());
			}break;
			case 4: {
				System.out.println(st.isFull());
			}break;
			case 5: {
				int value = st.peek();
				if(value == -1)
					System.err.println("No element found !!");
				else
					System.out.println(value);
			}break;
			case 6: {
				System.err.println(st);
			}break;
			case 7: {
				flag = false;
			}break;
			default: {
				System.out.println("Invalid option");
			}
			}
		}
		System.out.println("Thank You For Your Patience !!, Please visit again");
	}

}
