package pac;

public class TestDemo {
public TestDemo()
{
	System.out.println("Constructor");
}
public TestDemo(int a)
{
	System.out.println("1-int arg constructor");
}
public TestDemo(int a,int b)
{
	System.out.println("2-int arg constructor");
}

public static void main(String[] args) {
	TestDemo t1=new TestDemo();
	TestDemo t2=new TestDemo(10);
	TestDemo t3=new TestDemo(10,20);
}
}