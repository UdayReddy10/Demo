package Deloitte;

public class Maincode {
public static void main(String[] args) {
	int num1=2;
	int num2=3;
	int rem1=num1%5;
	int rem2=num2%5;
	if(rem1>rem2)
	{
		System.out.println(num1);
	}
	else if(rem1<rem2)
	{
		System.out.println(num2);
	}
	else if(rem1==rem2)
	{
		System.out.println(0);
	}
}
}
