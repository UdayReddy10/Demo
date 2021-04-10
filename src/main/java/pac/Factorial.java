package pac;
//5==>1*2*3*4*5
//5==>5*4*3*2*1
public class Factorial {
	void find_fact(int num)
	{
		
		long fact=1L;
		int i=1;
	while(i<=num)
	{
		fact=fact*i;
		i++;
	}
		System.out.println("Factorial="+fact);
		}
	

public static void main(String[] args) {
	Factorial f=new Factorial();
	f.find_fact(5);
	f.find_fact(20);
}
}
