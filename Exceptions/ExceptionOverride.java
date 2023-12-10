package exceptions;

//when parent class method is not declaring any exception
//class A{
//	void m1()
//	{
//		
//	}
//}
//class B extends A{
//	@Override
//	void m1()throws ArithmeticException
//	{
//		
//	}
//}
//
//when parent class method is not declaring any exception
class A{
	void m1() throws Exception
	{
		
	}
}
class B extends A{
	@Override
	void m1()// allowed
//	void m1()throws ArithmeticException // allowed
//	void m1()throws StringIndexOutOfBoundsException // allowed
//	void m1()throws Exception // allowed
//	void m1()throws InterruptedException // allowed
//	void m1()throws Throwable // Not allowed

	{
		
	}
}


public class ExceptionOverride {

	public static void main(String[] args) {

	}

}
