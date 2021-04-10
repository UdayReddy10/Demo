package Deloitte;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float a1=sc.nextFloat();
	float a2=sc.nextFloat();
	float area1=(a1*a2)/2;
	float b1=sc.nextFloat();
	float b2=sc.nextFloat();
	float area2=(b1*b2)/2;
	if(area1>area2)
	{
		System.out.println(area1);
	}
	else
	{
		System.out.println(area2);
	}
}
}
