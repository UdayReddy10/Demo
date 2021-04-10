package Deloitte;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int start=sc.nextInt();
	int end=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	boolean flag=true;
	for(int a:arr)
	{
		if(a>=start && a<=end)
		{
			System.out.print(a+" ");
			flag=false;
		}
	}
	if(flag)
	{
		System.out.println(-1);
	}
}
}
