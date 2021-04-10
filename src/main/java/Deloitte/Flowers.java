package Deloitte;

import java.util.HashSet;
import java.util.Set;

public class Flowers {
public int SheenaFlowers(int input1,int input2,int input3[])
{
	Set hs=new HashSet();
	for(int i=0;i<input2;i++)
	{
		hs.add(input3[i]);
	}
	return hs.size();
	
}

	
}

