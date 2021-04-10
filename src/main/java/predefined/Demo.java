package predefined;
//india is my country
//country my is india

//aidni si ym yrtnuoc
public class Demo {
public static void main(String[] args) {
	String str="india is my country";
	String arr[]=str.split("");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]);
	}
	System.out.println();
	String s1[]=str.split(" ");
	for(int i=s1.length-1;i>=0;i--)
	{
		System.out.print(s1[i]+" ");
	}
	System.out.println();
	for(String s:s1)
	{
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.print(" ");
	}
}
}
