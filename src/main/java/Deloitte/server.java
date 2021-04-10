package Deloitte;

import java.util.*;

public class server {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int output=0;
	for (int i = 0; i < arr.length; i=i+2) {
		output+=arr[i];
	}
	System.out.println(output);
}
}
