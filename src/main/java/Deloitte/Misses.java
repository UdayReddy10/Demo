package Deloitte;

import java.util.Scanner;
//aa a234bc@ sad$ hsadg^
public class Misses {
	public static void main(String[] args) {		
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
int character=0;
int miss=0;

for(char c:ch)
{
	if(Character.isDigit(c)||Character.isAlphabetic(c)||Character.isWhitespace(c))
	{
		character++;
	}
	else
	{
		miss++;
	}
}
System.out.println(miss);
}
}
