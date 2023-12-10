//                       Single Level Inheritance with interface
package com.company.interfacesexamples;

public interface TestSLI {
	int i = 10;
	void m1();
	void m2();
}
class MainTest implements TestSLI{
	@Override
	public void m1() {
		System.out.println("m1 is in sub-class");		
	}
	@Override
	public void m2() {
		System.out.println("m2 is in sub-class");		
	}
}
