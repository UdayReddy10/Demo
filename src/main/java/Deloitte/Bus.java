package Deloitte;

import java.util.Scanner;

public class Bus {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[][]=new int[size][2];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < 2; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println(arr.length);
}
}
