package Deloitte;

import java.util.*;

public class Distinct {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	char ch[]=input.toCharArray();
	Set s=new HashSet();
	int count=0;
	for(char c:ch)
	{
		if(s.add(c)==false)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
