package Deloitte;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int range=sc.nextInt();
	int  num1 = 0, num2 = 1;
    int i=1;
    while(i<=range)
    {
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
        i++;
    }
    System.out.println(num1);
}
}
