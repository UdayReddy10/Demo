package pac1;

public interface Abc {
static void m1()
{
	System.out.println("M1 method");
}
void m2();//public abstract
void m3();
int a=10;//static final

public static void main(String[] args) {
	Abc.m1();
	System.out.println(Abc.a);
}

}
