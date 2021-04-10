package Deloitte;

import java.util.*;

public class CountReverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String res="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		res=res+s1.charAt(i);
	}
	int count=0;
	char[] ch1=s1.toCharArray();
	char[] ch2=res.toCharArray();
	for(int i=0;i<ch1.length;i++)
	{
		if(ch1[i]==ch2[i])
		{
			count++;
		}
	}
	System.out.println(count);
}
}
