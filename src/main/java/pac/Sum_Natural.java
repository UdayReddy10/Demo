package pac;
//5+4+3+2+1
//1+2+3+4+5
public class Sum_Natural {
public static void main(String[] args) {
	int num=5;
	int sum=0;
//	for(int i=1;i<=num;i++)
//	{
//		sum=sum+i;
//	}
	//alternate way
	for(int i=num;i>=1;i--)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
