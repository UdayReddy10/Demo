package Deloitte;

import java.util.Scanner;

//product of each digits
public class OrderID_pwd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int res=1;
	while(num>0)
	{
		int rem=num%10;
		res=res*rem;
		num=num/10;
	}
	System.out.println(res);
}
}
