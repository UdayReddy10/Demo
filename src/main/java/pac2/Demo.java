package pac2;
//outside class of different package
import pac1.Sample;

public class Demo extends Sample {
	public static void main(String[] args) {
		Demo s1=new Demo();
		System.out.println(s1.a);
		s1.m1();
	}
}
