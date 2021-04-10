package Deloitte;

import java.util.Scanner;

public class Binary2Decimal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String num = String.valueOf(n);
    int dec_value = 0;
    int base = 1;
    int len = num.length();
    for (int i = len - 1; i >= 0; i--) {
        if (num.charAt(i) == '1')
            dec_value += base;
        base = base * 2;
    }
    System.out.println(dec_value);
}
}
