package Deloitte;

import java.util.*;
import java.util.Map.Entry;
public class CountWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String[] s1=str.split(" ");
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	for(String s:s1)
	{
		if(hm.containsKey(s))
		{
			hm.put(s, hm.get(s)+1);
		}
		else
		{
			hm.put(s, 1);
		}
	}
	for(Entry<String, Integer> a:hm.entrySet())
	{
		if(a.getValue()>1)
		{
			System.out.println(a.getKey());
		}
	}
}}
