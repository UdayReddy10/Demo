package pac1;
public class Test {
final static int a=10;
final String s="abc";
final int b=20;
static int c;
int d;
	public static void main(String[] args) {
Test t=new Test();
System.out.println(t.a);
System.out.println(t.s);
System.out.println(t.b);
System.out.println(t.c);
System.out.println(t.d);
t.c=30;
t.d=40;
//Reassigning of final variables throws compilation error
//t.a=55;
//t.b=75;
//t.s="xyz";
}
}
