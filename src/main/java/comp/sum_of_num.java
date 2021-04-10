package comp;

import java.util.Scanner;

public class sum_of_num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	for (int i = 0; i < arr.length; i++) {
		int num=arr[i];
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
			System.out.print(sum+" ");
	}
}
}
