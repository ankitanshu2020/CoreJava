// LAMBDA EXPRESSION EXAMPLE
package Mapss;

interface Computation{
	int compute(int a, int b);
}

public class ComputationMain {
	public static void main(String[] args) {
		Computation add = (x, y) -> (x + y);
		Computation sub = (x, y) -> (x - y);
		Computation mul = (x, y) -> (x * y);
		Computation div = (x, y) -> (x / y);
		
		System.out.println(add.compute(15, 3));
		System.out.println(sub.compute(15, 3));
		System.out.println(mul.compute(15, 3));
		System.out.println(div.compute(15, 3));
		}
}
