package oops;
//only m1 and m3 method can be overrided .M2 method cant be 
//overrided as it is a final method
public class Sample extends Demo {
	void m1()
	{
		System.out.println("overrides m1 method");
	}
	
	void m3()
	{
		System.out.println("overrides M3 method");
	}



}
