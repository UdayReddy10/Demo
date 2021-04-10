package Deloitte;

import java.util.Scanner;

public class ERP {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	int dis=sc.nextInt();
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		if(dis%arr[i]==0)
		{
		count++;	
		}
	}
	System.out.println(count);
}
}
