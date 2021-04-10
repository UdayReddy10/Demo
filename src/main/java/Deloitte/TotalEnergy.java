package Deloitte;

import java.util.Scanner;

public class TotalEnergy {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[3];
	int total=0;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int output=0;
	for(int i=0;i<arr[2];i++)
	{
		if(i==0)
		{
			output=arr[0];
		}
		if(i==1)
		{
			output+=arr[1];
		}
		if(i!=0&&i!=1)
		{
			output+=3;
		}
	}
	System.out.println(output);
}
}
