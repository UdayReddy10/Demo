package Deloitte;

import java.util.Scanner;

public class SumOfPrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int start=sc.nextInt();
	int end=sc.nextInt();
	int sum=0;
	for(int num=start;num<=end;num++)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
		sum=sum+num;	
		}
	}
	System.out.println(sum);
}
}
