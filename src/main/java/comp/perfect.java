package comp;

import java.util.Scanner;

public class perfect {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		int n=arr[i];
		for (int j = 1; j * j <= n; j++) {
			 
            // If (i * i = n)
            if ((n % j == 0) && (n / j == j)) {
                count++;
            }
        }
	}
	System.out.println(count);
}
}
