package Deloitte;

import java.util.Scanner;

public class SmallestLargestPrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int start=sc.nextInt();
	int end=sc.nextInt();
	int min=0;
	int max=0;
	
	for(int num=start;num<=end;num++)
	{
		int count1=0;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count1++;
				count++;
				break;
			}
		}
		if(count1==0 && min==0 )
		{
		min=num;	
		}
		if(count==0)
		{
			max=num;
		}
	}
int sum=min+max;
System.out.println(sum);
	
}
}
