package pac1;

public class B extends A {
	B()
	{
		System.out.println("B class constructor");
	}
	void m3() {
		System.out.println("M3 method");
	}
	void m4(int a) {
	System.out.println("M4 method");	
	}
	void m5() {
		System.out.println("M5 method");
	}
	void m6()
	{
		System.out.println("M6 method");
	}
public static void main(String[] args) {
	A b1=new B();//Upcasting to achive method hiding
	b1.m1();
	b1.m2();
	b1.m3();
	b1.m4(10);
	b1.m5();
}
}
