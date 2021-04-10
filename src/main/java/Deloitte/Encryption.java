package Deloitte;
import java.util.Scanner;
public class Encryption {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	int num=sc.nextInt();
	char res;
	
	char[] temp;

	char[] charText=new char[10];
	if(Character.isUpperCase(ch))
	{
		int ascii=ch;
		ascii=ascii+num;
		if(ascii>90)
			ascii=(ascii%91)+65;
		temp=Character.toChars(ascii);
		charText[0]=temp[0];
	}
	else if(Character.isLowerCase(charText[0]))
	{
		int ascii=charText[0];
		ascii=ascii+num;
		if(ascii>122)
			ascii=(ascii%123)+97;
		temp=Character.toChars(ascii);
		charText[0]=temp[0];
	}
}
}
