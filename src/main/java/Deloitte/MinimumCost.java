package Deloitte;

public class MinimumCost {
int addingCost(int input1,int[] input2,int input3)
{
	int cost = 0;
	int cost1=0;
	int sum=0;
	int sum1=0;
	int output=0;
	for (int i = 0; i < input2.length; i++) {
		sum=input2[i]+input2[++i];
		sum1=sum+sum1;
		cost=input3*sum;
		output=output+cost;
	}
		cost1=input3*sum1;
		
	return (output+cost1);
	
}
}
