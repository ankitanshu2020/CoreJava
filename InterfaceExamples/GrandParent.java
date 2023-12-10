//                       Multilevel Level Inheritance with interface
package com.company.interfacesexamples;

public interface GrandParent {
	int g_age = 85;
	void greet1();
}

class Parent implements GrandParent{
	int p_age = 45;
	@Override
	public void greet1() {
		System.out.println("Hi i am GrandPa");
	}
	public void greet2() {
		System.out.println("Hi i am Papa");
	}	
}
class Child extends Parent{
	int c_age = 18;
	public void greet3() {
		System.out.println("Hi i am Child");
	}	
}

