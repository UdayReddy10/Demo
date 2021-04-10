package Deloitte;

import java.util.*;

public class CountOcc {
public static void main(String[] args) {
	HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char ch[]=str.toCharArray();
	for(char c:ch)
	{
		if(hm.containsKey(c))
		{
			hm.put(c, hm.get(c)+1);
		}
		else
		{
			hm.put(c, 1);
		}
	}
	char x=sc.next().charAt(0);
	System.out.println(hm.get(x));
}
}
