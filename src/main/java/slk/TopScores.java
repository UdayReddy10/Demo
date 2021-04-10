package slk;

import java.util.Arrays;

public class TopScores {
	
	
	
	
	int marathon(int input1,int input2,	int input3[])
	{
		
		int sum=0;
		Arrays.sort(input3);
		for(int i=input1-1;i>=input1-input2;i--)
		{
			sum=sum+input3[i];
		}
		
		
		return sum;
	}
	
	
	
	
	
	
	
}