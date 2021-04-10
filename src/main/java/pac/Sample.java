package pac;
//Assigning values using a method
public class Sample {
 int a;
 int b;
 void assignValues(int a1,int b1)
 {
	 a=a1;
	 b=b1;
 }
 void dispValues()
 {
	 System.out.println(a);
	 System.out.println(b);
 }
 public static void main(String[] args) {
	Sample s1=new Sample();
	s1.dispValues();
	s1.assignValues(10, 20);
	s1.dispValues();
	Sample s2=new Sample();
	s2.dispValues();
	s2.dispValues();
}
}
//Disadv:we may miss out method calling stmt
//which assigns values