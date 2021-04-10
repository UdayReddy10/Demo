package virtusa;

import java.util.Arrays;

public class UserCode {
public int marathon(int input1,int input2,int input3[])
{
	
	int sum=0;
	Arrays.sort(input3);
	for(int i=input1-1;i>=input2;i--)
	{
		sum+=input3[i];
	}
	return sum;
}
}
