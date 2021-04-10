package Deloitte;

public class StreetLight {
	

	public int coverage(int input1,int[][] input2)
	{
	
		int count=0;
		int diff=0;
		int common=0;
		for(int i=0;i<input2.length;i++)
		{
			for(int j=input2.length-1;j>=0;j--)
			{
				diff=diff+(input2[i][j]-input2[i][--j]);
			}
		if(input2[0][1]>input2[1][0])
		{
			common=input2[0][1]-input2[1][0];
		}
		}
		return diff-common;
}
}
