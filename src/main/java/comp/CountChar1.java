package comp;

import java.util.Scanner;

public class CountChar1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String temp="";
	for (int i =str.length()-1;i>=0;i--) {
		temp+=str.charAt(i);
	}
	int count=0;
	char[] c1=str.toCharArray();
	char[] c2=temp.toCharArray();
	for (int i = 0; i < c2.length; i++) {
		if(c1[i]==c2[i])
		{
			count++;
		}
	}
	System.out.println(count);
}
}
