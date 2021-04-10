package Deloitte;

public class MaxPosNeg {
public int solution(int[] A)
{
	int count=0;
	for (int i = 0; i < A.length; i++) {
		for(int j=i+1;j<A.length;j++)
		{
			if(A[i]+A[j]==0)
			{
				if(A[i]>count)
				{
				count=A[i];
				}
			}
		}
	}
	return count;
}
}
