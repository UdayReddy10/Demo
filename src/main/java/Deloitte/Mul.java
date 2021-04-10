package Deloitte;

import java.util.Scanner;

public class Mul {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int total=0;
	int arr[]= {a,b,c};
	for (int i = 0; i < arr.length; i++) {
		if(i==0)
		{
			System.out.println(arr[i]);
			total=arr[i];
			
		}
		else
		{
			total*=3;
			System.out.println(total);
		}
	}
	
}
}
