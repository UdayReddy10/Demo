package Deloitte;

import java.util.*;

public class CountRepeatedDigits1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int key=sc.nextInt();
	int count=0;
	while(num>0)
	{
		int rem=num%10;
		if(rem==key)
		{
			count++;
		}
		num=num/10;
	}
	System.out.println(count);
}
}
