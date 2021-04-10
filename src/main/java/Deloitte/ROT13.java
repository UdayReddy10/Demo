package Deloitte;

public class ROT13 {
	static String encodeString(String str)
	{
		char[] charText=str.toCharArray();
		char[] temp;
		int shift=13;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(charText[i]))
				if(Character.isUpperCase(charText[i]))
				{
					int ascii=charText[i];
					ascii=ascii+shift;
					if(ascii>90)
						ascii=(ascii%91)+65;
					temp=Character.toChars(ascii);
					charText[i]=temp[0];
				}
				else if(Character.isLowerCase(charText[i]))
				{
					int ascii=charText[i];
					ascii=ascii+shift;
					if(ascii>122)
						ascii=(ascii%123)+97;
					temp=Character.toChars(ascii);
					charText[i]=temp[0];
				}
		}
		String res=new String(charText);
		return res;
	}
public static void main(String[] args) {
	System.out.println(encodeString("Hello, World!"));
}
}
