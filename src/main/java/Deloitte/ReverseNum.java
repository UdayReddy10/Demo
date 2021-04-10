package Deloitte;

public class ReverseNum {
public static void main(String[] args) {
	int n=123;
	int ep=n%10;
	while(n>0)
	{
		if(ep==0 && n%10==0)
		{
			ep=1;
		}
		else if(ep==1)
		{
			System.out.println(n%10);
		}
		n=n/10;
	}
//	System.out.println(ep);
}

}
