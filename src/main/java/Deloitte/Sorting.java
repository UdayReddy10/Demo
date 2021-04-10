package Deloitte;

import java.util.*;

public class Sorting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < args.length; i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int res=arr[arr.length-1]*arr[arr.length-2];
	System.out.println(res);
	
}
}
