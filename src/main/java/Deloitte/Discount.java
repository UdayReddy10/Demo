package Deloitte;

import java.util.Scanner;

public class Discount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int disc=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<arr.length;i=i+5)
	{
		count++;
	}
	System.out.println(count);
}
}
