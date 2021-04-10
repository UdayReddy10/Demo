package Deloitte;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	char[] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	for(int i=0;i<ch1.length;i++)
	{
		try
		{
		if(ch1[i]!=ch2[i])
		{
			System.out.println(ch1[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(ch1[i]);
		}
	}
}
}
