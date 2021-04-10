package Deloitte;

import java.util.Scanner;
//array Sum
public class Sum_of_Numbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	int res[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for (int i = 0; i < arr.length; i++) {
		int num=arr[i];
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		res[i]=sum;
	}
	for (int i = 0; i < res.length; i++) {
		System.out.print(res[i]+" ");
	}	
}
}
