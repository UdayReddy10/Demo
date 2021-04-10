package pac1;

public abstract class A {
	A()
	{
		System.out.println("A class constructor");
	}
	static void m1()
	{
		System.out.println("static");
	}
	void m2()
	{
		System.out.println("non static");
	}
	abstract void m3();
	abstract void m4(int a);
	abstract void m5();
}
