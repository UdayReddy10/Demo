package pac1;
//within the same class
public class Sample {
 protected int a=10;
 protected void m1()
{
	System.out.println("protected method");
}
public static void main(String[] args) {
	Sample s1=new Sample();
	System.out.println(s1.a);
	s1.m1();
}
}
