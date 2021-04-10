package pac1;

public class C implements I1,I2{
	public void m1() {
		System.out.println("M1 method");
	}
	public void m2() {
		System.out.println("M2 method");
	}
	public void m3() {
		System.out.println("M3 method");
	}
public static void main(String[] args) {
	I1 i=new C();
	i.m1();
	i.m2();
	i.m3();
	I2 i2=new C();
	i2.m2();
	i2.m3();
}

}
