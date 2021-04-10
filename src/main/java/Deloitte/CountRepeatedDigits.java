package Deloitte;

import java.util.Scanner;
public class CountRepeatedDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int res = 0; 
    int cnt[] = new int[10]; 
    while (N > 0) 
    { 
        int rem = N % 10; 
        cnt[rem]++; 
        N = N / 10; 
    } 
    for (int i = 0; i < 10; i++)  
    { 
        if (cnt[i] > 1)  
        { 
            res++; 
        } 
    } 
System.out.println(res);
}
}
