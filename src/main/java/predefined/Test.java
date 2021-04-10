package predefined;
//convert array to List
import java.util.*;
public class Test {
public static void main(String[] args) {
//Using logic
	int arr[]= {10,20,30,40,50};
	List<Integer> al=new ArrayList<Integer>();
	for(int a:arr)
	{
		al.add(a);
	}
	System.out.println(al);
//converting list to array
	List<String> lst=new ArrayList<String>();
	lst.add("xyz");
	lst.add("abc");
	lst.add("ijk");
	System.out.println(lst);
	String str[]=new String[lst.size()];
	for(int i=0;i<str.length;i++)
	{
		str[i]=lst.get(i);
	}
	for(String s:str)
	{
		System.out.println(s);
	}
}
}
