package virtusa;

import java.util.List;

public class TwoString {
	
public static void commonSub(List<String> a,List<String> b)
{
for(int i=0;i<a.size();i++)
	{
		String s1=a.get(i);
		String s2=b.get(i);
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		boolean flag=false;
		for (int j = 0; j < ch.length; j++) {
			for(int k=0;k<ch.length;k++)
			{
				if(ch[j]==ch1[k])
				{
				flag=true;
				break;
				}
			}
		}
			if(flag)
			{
				System.out.println("YES");
				break;
			}
			else
			{
				System.out.println("No");
				break;	
			}			}}}
