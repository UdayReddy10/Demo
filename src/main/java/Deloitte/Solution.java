package Deloitte;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int input=sc.nextInt();
	Arrays.sort(arr);
	for(int i=input;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
}
}
