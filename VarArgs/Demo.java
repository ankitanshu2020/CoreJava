package VarArgs;
//VarArgs should be the last argument in the method definition
//we can pass primitive data types before VarArgs

public class Demo {
	
	public static void demo1(int... a) {
		System.out.println("--------------DEMO1--------------");
		for(Integer i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void demo2(int a, String... str) {
		System.out.println("--------------DEMO2--------------");
		System.out.println(a);
		for(String i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void demo3(int a, char ch, String... str) {
		System.out.println("--------------DEMO3--------------");
		System.out.println(a);
		System.out.println(ch);
		for(String i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		demo1(20, 10, 50, 60, 100);
		demo2(20,"Raman", "Gaurav", "Mohan");
		demo3(20,'A', "Raman", "Gaurav", "Mohan", "Sundar");

	}
}
