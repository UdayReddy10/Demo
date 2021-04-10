package Deloitte;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i=i+2)
	{
		System.out.println(arr[i]);
	}
}
}
