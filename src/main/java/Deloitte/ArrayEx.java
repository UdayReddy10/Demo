package Deloitte;

import java.util.Scanner;

public class ArrayEx {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int a[]=new int[size];
	int res[]=new int[size];
	int k=0;
	for (int i = 0; i < res.length; i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++){  
	if(a[i]%2==0){  
	res[k]=a[i];
	k++;
	}  
	}
	for(int i=0;i<a.length;i++){  
	if(a[i]%2!=0){  
	res[k]=a[i];
	k++;
	}  
	}  
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);
	}
}
}
	
