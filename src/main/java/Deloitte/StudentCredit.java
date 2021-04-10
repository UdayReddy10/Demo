package Deloitte;

public class StudentCredit {

 int maxpairs(int input1,int input2[],int input3,int input4[])
{
	int count=0;
	for(int i=0;i<input3;i++)
	{
		for(int j=0;j<input1;j++)
		{
			if(input4[i]>input2[j])
			{
				count++;
			}
		}
	}
	
	return count;
}

}
