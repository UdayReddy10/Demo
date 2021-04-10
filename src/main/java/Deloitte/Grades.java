package Deloitte;

import java.util.Scanner;
public class Grades {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	if(i>=30 && i<=50)
	{
		System.out.println("D");
	}
	else if(i>=51 && i<=60)
	{
		System.out.println("C");
	}
	else if(i>=61 && i<=80)
	{
		System.out.println("B");
	}
	else if(i>=81 && i<=100)
	{
		System.out.println("A");
	}
}
}
