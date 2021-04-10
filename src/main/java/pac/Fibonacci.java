package pac;

public class Fibonacci {
public static void main(String[] args) {
	int prev=0;
	int next=1;
	System.out.println(prev);
	System.out.println(next);
	int range=7;
//	while(range>0)
	for(int i=1;i<=range;i++)
	{
		int sum=prev+next;
		System.out.println(sum);
		prev=next;
		next=sum;
		
	}
}
}
