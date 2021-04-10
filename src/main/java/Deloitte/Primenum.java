package Deloitte;

import java.util.Scanner;

public class Primenum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	while(num>0)
	{
		int rem=num%10;
		while(rem>0)
		{
			int count=0;
			for(int i=2;i<rem;i++)
			{
				if(rem%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				sum=sum+rem;
			}
			break;
		}
		num=num/10;
	}
	System.out.println(sum);
}
}
