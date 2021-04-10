package Deloitte;

import java.util.*;

public class Chardata {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	char ch[]=new char[size];
	for (int i = 0; i < ch.length; i++) {
		ch[i]=sc.next().charAt(0);
	}
	char[] ch1= {'v','k','l'};
	int count=0;
	for(char c:ch)
	{
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==c)
			{
				count++;
			}
		}
	}
	System.out.println(count);
}
}
