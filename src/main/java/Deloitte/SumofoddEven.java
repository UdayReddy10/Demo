package Deloitte;

import java.util.Scanner;

public class SumofoddEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem=0;
	int rev=0;
	int oddsum=0;
	int evensum=0;
	while(num>0)
	{
	rem=num%10;
	if(rem%2==0)
	{
		evensum+=rem;
	}
	else
	{
		oddsum+=rem;
	}
	num=num/10;
	}
	int result=oddsum*evensum;
	System.out.println(result);
}
}
