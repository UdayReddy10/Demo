package Deloitte;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int maxprod=arr[size-1]*arr[size-2];
	int sum=0;
	while(maxprod>0)
	{
		int rem=maxprod%10;
		sum=sum+rem;
		maxprod=maxprod/10;
	}
	System.out.println(sum);
}
}
